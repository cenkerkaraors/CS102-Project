import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ButtonListenerCustomerLogin implements ActionListener {
    private FarmBank farmbank;
    private CustomerMainPanel customerPanel;
    private boolean loginControl;

    public ButtonListenerCustomerLogin(FarmBank bank,CustomerMainPanel panel) {
        farmbank = bank;
        customerPanel = panel;
        loginControl = false;

    }
    public void actionPerformed(ActionEvent e) {
        String userName = customerPanel.getNameText();
        String userPassword = customerPanel.getPasswordText();
        ArrayList<Customer> list = farmbank.getCustomers();
        for(int i=0;i<list.size();i++) {
            Customer guy = list.get(i);
            if(guy.getName().equals(userName) && guy.getPassword().equals(userPassword)) {
                customerPanel.login(guy);
                customerPanel.completeComboBoxFarmers(farmbank);
                loginControl = true;

                System.out.println("Logged in");
                break;
            }


        }

        if(farmbank.getCustomers().size() == 0 || loginControl == false) {
            JOptionPane.showMessageDialog(null,"Wrong Name or Password");
        }
    }
}
