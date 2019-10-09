import javax.swing.*;
import java.awt.*;

public class LoginFarmerPanel extends JPanel {
    private JPanel farmerCenterPanel;
    private JPanel farmerNorthPanel;
    private JPanel farmerSouthPanel;
    private JPanel loginPanel;
    private JTextField accNameField;
    private JPasswordField accPasswordField;
    private JButton loginButton;
    JLabel welcomee;


    JPanel farmerMainPanel = new JPanel();
    private Farmer activeAccount;
    public LoginFarmerPanel() {

        farmerMainPanel.setBackground(Color.WHITE);
        farmerMainPanel.setSize(300,300);
        farmerMainPanel.setLayout(new FlowLayout());

        farmerCenterPanel = new JPanel();
        farmerCenterPanel.setLayout(new GridLayout(2,2));
        farmerCenterPanel.setBackground(Color.WHITE);
        farmerCenterPanel.setSize(600,600);
        farmerCenterPanel.setVisible(false);
        farmerMainPanel.add(farmerCenterPanel,BorderLayout.CENTER);

        farmerNorthPanel = new JPanel();
        farmerNorthPanel.setLayout(new FlowLayout());
        farmerNorthPanel.setBackground(Color.WHITE);
        farmerNorthPanel.setSize(600,600);
        farmerMainPanel.add(farmerNorthPanel,BorderLayout.NORTH);

        farmerSouthPanel = new JPanel();
        farmerSouthPanel.setLayout(new FlowLayout());
        farmerSouthPanel.setBackground(Color.WHITE);
        farmerSouthPanel.setSize(600,600);
        farmerMainPanel.add(farmerSouthPanel,BorderLayout.SOUTH);


        //Components
        JLabel welcome = new JLabel("Farmer panel");
        welcome.setBackground(Color.WHITE);
        welcome.setSize(50,50);
        farmerNorthPanel.add(welcome);

        loginPanel = new JPanel();
        loginPanel.setLayout(new GridLayout(4,2));
        loginPanel.setBackground(Color.GRAY);
        loginPanel.setSize(400,400);
        farmerNorthPanel.add(loginPanel);

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




        farmerMainPanel.setVisible(true);
        farmerMainPanel.setEnabled(true);
        add(farmerMainPanel);
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
        farmerNorthPanel.add(button);
    }
    public void login(Farmer farmer) {

        farmerCenterPanel = new JPanel();
        farmerCenterPanel.setLayout(new GridLayout(2,2));
        farmerCenterPanel.setBackground(Color.WHITE);
        farmerCenterPanel.setSize(600,600);
        farmerCenterPanel.setVisible(true);
        farmerMainPanel.add(farmerCenterPanel,BorderLayout.CENTER);

        welcomee = new JLabel("Guest");
        welcomee.setBackground(Color.WHITE);
        welcomee.setSize(50,50);
        farmerCenterPanel.add(welcomee);


        activeAccount = farmer;
        welcomee.setText("Welcome " + farmer.getName() + " " + activeAccount.getBalance());

        JLabel accountsLabel = new JLabel("Farmer");
        accountsLabel.setBackground(Color.WHITE);
        accountsLabel.setSize(50,50);

        farmerCenterPanel.add(accountsLabel);

    }
}
