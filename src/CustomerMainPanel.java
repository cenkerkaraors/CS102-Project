import javax.swing.*;
import java.awt.*;




public class CustomerMainPanel extends JPanel{
    private JButton returnHomeButton;
    private JButton loginButton;
    private FarmBank farmbank;
    private JPanel customerCenterPanel;
    private JPanel customerNorthPanel;
    private JPanel customerSouthPanel;
    private JPanel loginPanel;
    private JTextField accNameField;
    private JPasswordField accPasswordField;
    JLabel welcomee;
    private Customer activeAccount;
    JPanel customerMainPanel = new JPanel();
    public CustomerMainPanel() {
        customerMainPanel.setLayout(new BorderLayout());
        customerMainPanel.setBackground(Color.WHITE);
        customerMainPanel.setSize(2000,2000);




        customerCenterPanel = new JPanel();
        customerCenterPanel.setLayout(new GridLayout(2,2));
        customerCenterPanel.setBackground(Color.WHITE);
        customerCenterPanel.setSize(600,600);
        customerCenterPanel.setVisible(false);
        customerMainPanel.add(customerCenterPanel,BorderLayout.CENTER);


        customerNorthPanel = new JPanel();
        customerNorthPanel.setLayout(new FlowLayout());
        customerNorthPanel.setBackground(Color.WHITE);
        customerNorthPanel.setSize(600,600);
        customerMainPanel.add(customerNorthPanel,BorderLayout.NORTH);


        customerSouthPanel = new JPanel();
        customerSouthPanel.setLayout(new FlowLayout());
        customerSouthPanel.setBackground(Color.WHITE);
        customerSouthPanel.setSize(600,600);
        customerMainPanel.add(customerSouthPanel,BorderLayout.SOUTH);




        // Components
        JLabel welcome = new JLabel("Customer Panel");
        welcome.setBackground(Color.WHITE);
        welcome.setSize(50,50);
        customerNorthPanel.add(welcome);

        loginPanel = new JPanel();
        loginPanel.setLayout(new GridLayout(4,2));
        loginPanel.setBackground(Color.GRAY);
        loginPanel.setSize(400,200);
        customerNorthPanel.add(loginPanel);

        JLabel acclogin = new JLabel("Login Account");
        acclogin.setBackground(Color.WHITE);
        acclogin.setSize(50,50);
        loginPanel.add(acclogin);

        JLabel accEmpty = new JLabel("");
        accEmpty.setBackground(Color.WHITE);
        accEmpty.setSize(50,50);
        loginPanel.add(accEmpty);

        JLabel accName = new JLabel("Name: ");
        accName.setBackground(Color.WHITE);
        accName.setSize(50,50);
        loginPanel.add(accName);

        accNameField = new JTextField();
        accNameField.setBackground(Color.WHITE);
        accNameField.setSize(150,50);
        loginPanel.add(accNameField);

        JLabel accPassword = new JLabel("Password: ");
        accPassword.setBackground(Color.WHITE);
        accPassword.setSize(50,50);
        loginPanel.add(accPassword);

        accPasswordField = new JPasswordField();
        accPasswordField.setBackground(Color.WHITE);
        accPasswordField.setSize(150,50);
        loginPanel.add(accPasswordField);

        // Components











        add(customerMainPanel);


    }
    public String getNameText() {
        return accNameField.getText();
    }
    public String getPasswordText() {
        String passText = "";
        char[] pass = accPasswordField.getPassword();
        for(int i=0;i<pass.length;i++) {
            passText += pass[i];
        }
        return passText;
    }

    public void completeButtons(JButton button) {
        customerNorthPanel.add(button);

    }
    public void login(Customer customer) {

        customerCenterPanel = new JPanel();
        customerCenterPanel.setLayout(new GridLayout(2,2));
        customerCenterPanel.setBackground(Color.WHITE);
        customerCenterPanel.setSize(600,600);
        customerCenterPanel.setVisible(true);
        customerMainPanel.add(customerCenterPanel,BorderLayout.CENTER);

        welcomee = new JLabel("Guest");
        welcomee.setBackground(Color.WHITE);
        welcomee.setSize(50,50);
        customerCenterPanel.add(welcomee);


        activeAccount = customer;
        welcomee.setText("Welcome " + customer.getName());

        JLabel accountsLabel = new JLabel("Customer");
        accountsLabel.setBackground(Color.WHITE);
        accountsLabel.setSize(50,50);
        customerCenterPanel.add(accountsLabel);











    }
    public void completeLoginButton(JButton button) {
        loginPanel.add(button);
    }
    public void completeComboBoxFarmers(FarmBank bank) {
        ComboBoxFarmers farmerList = new ComboBoxFarmers(customerCenterPanel,bank,activeAccount,customerSouthPanel);

    }
}
