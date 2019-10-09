import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListenerLoginCustomer implements ActionListener {
    private FarmBank farmbank;
    private TabbedPane tabbedPane;
    public ButtonListenerLoginCustomer(FarmBank bank,TabbedPane tabbedPane) {
        farmbank = bank;
        this.tabbedPane = tabbedPane;
    }
    public void actionPerformed(ActionEvent e) {
        System.out.println("Login Customer");
        completeCustomerPanel();
        tabbedPane.openTab(3);
        tabbedPane.swapTab(3);
        tabbedPane.closeTab(0);

    }
    public void completeCustomerPanel() {
        CustomerMainPanel customerPanel = new CustomerMainPanel();
        ButtonListenerReturnHomeTwo listener = new ButtonListenerReturnHomeTwo(farmbank,tabbedPane,3);
        JButton button = new JButton("Home");
        button.setSize(150,50);
        button.setBackground(Color.WHITE);
        button.addActionListener(listener);
        ButtonListenerCustomerLogin listenerCustomerLogin = new ButtonListenerCustomerLogin(farmbank,customerPanel);
        JButton loginAccountButton = new JButton("Login");
        loginAccountButton.setSize(50,50);
        loginAccountButton.setBackground(Color.WHITE);
        loginAccountButton.addActionListener(listenerCustomerLogin);
        customerPanel.completeLoginButton(loginAccountButton);
        tabbedPane.completeCustomerMainPanel(customerPanel,button);




    }
}
