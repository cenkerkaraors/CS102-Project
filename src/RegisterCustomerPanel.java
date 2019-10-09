import javax.swing.*;
import java.awt.*;

public class RegisterCustomerPanel extends JPanel {
    private ButtonListenerReturnHome listenerReturnHome;
    private ButtonListenerAddCustomer listenerAddCustomer;
    private JButton returnHomeButton;
    private JButton addCustomerButton;
    private JPanel registerCustomerNorthPanel;
    private JPanel registerCustomerCenterPanel;
    private JTextField nameField;
    private JPasswordField passwordField;
    private JPasswordField passwordFieldTwo;
    private JTextField locationField;
    private JTextField zipField;
    private JTextField balanceField;
    JPanel registerCustomerMainPanel = new JPanel();
    public RegisterCustomerPanel() {
        // Register Customer Panels
        registerCustomerMainPanel.setLayout(new BorderLayout());
        registerCustomerMainPanel.setBackground(Color.WHITE);
        registerCustomerMainPanel.setSize(600,600);

        registerCustomerNorthPanel = new JPanel();
        registerCustomerNorthPanel.setSize(600,50);
        registerCustomerNorthPanel.setBackground(Color.WHITE);
        registerCustomerNorthPanel.setLayout(new FlowLayout());
        registerCustomerMainPanel.add(registerCustomerNorthPanel,BorderLayout.NORTH);

        registerCustomerCenterPanel = new JPanel();
        registerCustomerCenterPanel.setSize(600,50);
        registerCustomerCenterPanel.setBackground(Color.WHITE);
        registerCustomerCenterPanel.setLayout(new GridLayout(6,2));
        registerCustomerMainPanel.add(registerCustomerCenterPanel,BorderLayout.CENTER);




        // Components
        JLabel welcomeRegisterCustomer = new JLabel("Register Customer");
        welcomeRegisterCustomer.setBackground(Color.WHITE);
        welcomeRegisterCustomer.setSize(150,50);
        registerCustomerNorthPanel.add(welcomeRegisterCustomer);

        JLabel nameLabel = new JLabel("Enter Name: ");
        nameLabel.setBackground(Color.WHITE);
        nameLabel.setSize(150,50);
        registerCustomerCenterPanel.add(nameLabel);

        nameField = new JTextField();
        nameField.setBackground(Color.WHITE);
        nameField.setSize(150,50);
        registerCustomerCenterPanel.add(nameField);

        JLabel passwordLabel = new JLabel("Enter Password: ");
        passwordLabel.setBackground(Color.WHITE);
        passwordLabel.setSize(150,50);
        registerCustomerCenterPanel.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBackground(Color.WHITE);
        passwordField.setSize(150,50);
        registerCustomerCenterPanel.add(passwordField);

        JLabel passwordLabelTwo = new JLabel("Enter Password: ");
        passwordLabelTwo.setBackground(Color.WHITE);
        passwordLabelTwo.setSize(150,50);
        registerCustomerCenterPanel.add(passwordLabelTwo);

        passwordFieldTwo = new JPasswordField();
        passwordFieldTwo.setBackground(Color.WHITE);
        passwordFieldTwo.setSize(150,50);
        registerCustomerCenterPanel.add(passwordFieldTwo);

        JLabel locationLabel = new JLabel("Enter Location: ");
        locationLabel.setBackground(Color.WHITE);
        locationLabel.setSize(150,50);
        registerCustomerCenterPanel.add(locationLabel);

        locationField = new JTextField();
        locationField.setBackground(Color.WHITE);
        locationField.setSize(150,50);
        registerCustomerCenterPanel.add(locationField);

        JLabel zipLabel = new JLabel("Enter Zip Code: ");
        zipLabel.setBackground(Color.WHITE);
        zipLabel.setSize(150,50);
        registerCustomerCenterPanel.add(zipLabel);

        zipField = new JTextField();
        zipField.setBackground(Color.WHITE);
        zipField.setSize(150,50);
        registerCustomerCenterPanel.add(zipField);

        JLabel balanceLabel = new JLabel("Enter Balance: ");
        balanceLabel.setBackground(Color.WHITE);
        balanceLabel.setSize(150,50);
        registerCustomerCenterPanel.add(balanceLabel);

        balanceField = new JTextField();
        balanceField.setBackground(Color.WHITE);
        balanceField.setSize(150,50);
        registerCustomerCenterPanel.add(balanceField);



        add(registerCustomerMainPanel);
    }
    public void addReturnHomeButton(JButton button,ButtonListenerReturnHome listener) {
        listenerReturnHome = listener;
        returnHomeButton = button;
        returnHomeButton.addActionListener(listenerReturnHome);
        registerCustomerNorthPanel.add(returnHomeButton);
    }
    public void addCustomerButton(JButton button,ButtonListenerAddCustomer listener) {
        addCustomerButton = button;
        listenerAddCustomer = listener;
        addCustomerButton.addActionListener(listenerAddCustomer);
        registerCustomerMainPanel.add(addCustomerButton,BorderLayout.SOUTH);
    }
    public String getNameText() {
        return nameField.getText();
    }
    public String getPasswordText() {
        String passText = "";
        char[] pass = passwordField.getPassword();
        for(int i=0;i<pass.length;i++) {
            passText += pass[i];
        }
        return passText;
    }
    public String getPasswordTextTwo() {
        String passText = "";
        char[] pass = passwordFieldTwo.getPassword();
        for(int i=0;i<pass.length;i++) {
            passText += pass[i];
        }
        return passText;
    }
    public String getLocationText() {
        return locationField.getText();
    }
    public String getZipText() {
        return zipField.getText();
    }
    public String getBalanceText() {
        return balanceField.getText();
    }
    public void refresh() {
          nameField.setText("");
          passwordField.setText("");
          passwordFieldTwo.setText("");
          locationField.setText("");
          zipField.setText("");
          balanceField.setText("");
    }


}
