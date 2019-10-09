import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ButtonListenerOrder implements ActionListener {
    private Customer customer;
    private Farmer farmer;
    private ArrayList<JTextField> fields;
    private ArrayList<JTextField> fieldsUpdate;
    private ArrayList<Double> prices;
    private ArrayList<Double> pricesUpdate;
    private JLabel balanceLabel;
    FarmBank farmbank = new FarmBank();
    public ButtonListenerOrder(Customer activeC,Farmer activeF,ArrayList<JTextField> f,ArrayList<Double> p,JLabel b) {
        customer = activeC;
        farmer = activeF;
        fields = f;
        prices = p;
        fieldsUpdate = new ArrayList<JTextField>();
        pricesUpdate = new ArrayList<Double>();
        balanceLabel = b;

    }
    public void actionPerformed(ActionEvent e) {
        for(int i=0;i<fields.size();i++) {
            if((!(fields.get(i).getText().equals(""))))  {
                fieldsUpdate.add(fields.get(i));
                pricesUpdate.add(prices.get(i));
                JOptionPane.showMessageDialog(null, "Order Completed");

            }
        }
        for(int k=0;k<fieldsUpdate.size();k++) {



            Double ammount = Double.parseDouble(fieldsUpdate.get(k).getText());
            Double price = pricesUpdate.get(k);
            if (customer.getBalance() >= ammount * price) {
                customer.decBalance(ammount * price);
                farmbank.incBalance(ammount * price);
                farmbank.decBalance((ammount * price) - (0.02 * (ammount * price)));
                farmer.incBalance((ammount * price) - (0.02 * (ammount * price)));
                //System.out.println((ammount*price)-(0.02*(ammount*price)));
                System.out.println(ammount + "-" + price);

            }


        }
        System.out.println(farmbank.getBalance());
        System.out.println("Customers Balance:" + customer.getBalance());
        System.out.println(farmer.getBalance());
        balanceLabel.setText("Your Balance: " + customer.getBalance());
        for(int i=0;i<fields.size();i++) {
            fields.get(i).removeAll();
            fields.get(i).setText("");
        }
        fieldsUpdate.clear();
        pricesUpdate.clear();








    }
}
