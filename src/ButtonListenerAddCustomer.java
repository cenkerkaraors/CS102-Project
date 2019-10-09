import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListenerAddCustomer implements ActionListener {
    private FarmBank farmbank;
    private TabbedPane tabbedPane;
    private RegisterCustomerPanel registerCustomerPanel;
    public ButtonListenerAddCustomer(FarmBank bank,TabbedPane tabbedPane,RegisterCustomerPanel panel) {
        farmbank = bank;
        this.tabbedPane = tabbedPane;
        registerCustomerPanel = panel;
    }
    public void actionPerformed(ActionEvent e) {
        if(!registerCustomerPanel.getNameText().equals("") && !registerCustomerPanel.getZipText().equals("") && !registerCustomerPanel.getBalanceText().equals("") && !registerCustomerPanel.getLocationText().equals("") && !registerCustomerPanel.getBalanceText().equals("") && !registerCustomerPanel.getPasswordTextTwo().equals("")) {
            boolean nameControl = true;
            Customer newCustomer = new Customer(registerCustomerPanel.getNameText());
            double zip = Double.parseDouble(registerCustomerPanel.getZipText());
            int zipCode = (int) zip;
            newCustomer.setLocation(registerCustomerPanel.getLocationText(), zipCode);
            double balance = Double.parseDouble(registerCustomerPanel.getBalanceText());
            newCustomer.setBalance(balance);
            for (int i = 0; i < farmbank.getCustomers().size(); i++) {
                if (farmbank.getCustomers().get(i).getName().equals(newCustomer.getName())) {
                    nameControl = false;
                    JOptionPane.showMessageDialog(null, "This User Name Already Taken");
                    registerCustomerPanel.refresh();
                }
            }
            if (registerCustomerPanel.getPasswordText().equals(registerCustomerPanel.getPasswordTextTwo()) && nameControl == true) {
                newCustomer.setPassword(registerCustomerPanel.getPasswordText());
                farmbank.addCustomer(newCustomer);
                registerCustomerPanel.refresh();
                JOptionPane.showMessageDialog(null, "Account Created");


                System.out.println("Customer Added");
                System.out.println(farmbank.getCountOfCustomers());
            /*
            System.out.println(farmbank.getCustomers().get(0).getName());
            System.out.println(farmbank.getCustomers().get(0).getPassword());
            System.out.println(farmbank.getCustomers().get(0).getLocation().getName());
            */

            }
        }

    }
}
