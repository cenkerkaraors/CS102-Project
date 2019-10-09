import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class FarmBankPanel extends JPanel {
    private FarmBank farmbank;
    private JLabel label;
    private JPanel loginPanel;
    private JTextField managerNameField;
    private JPasswordField managerPasswordField;
    private JPanel northPanel;
    private ArrayList<String> names;
    private ArrayList<String> passwords;
    JPanel mainPanel = new JPanel();
    public FarmBankPanel(FarmBank f) {
        farmbank = f;

        names = new ArrayList<String>();
        passwords = new ArrayList<String>();

        names.add("Cenker Karaörs");
        names.add("Burak Deniz");
        names.add("a");
        //passwords.add("a");
        passwords.add("1999");
        passwords.add("1998");
        passwords.add("a");


        mainPanel.setBackground(Color.WHITE);
        mainPanel.setSize(600,600);
        mainPanel.setLayout(new BorderLayout());

        northPanel = new JPanel();
        northPanel.setBackground(Color.WHITE);
        northPanel.setSize(600,200);
        northPanel.setLayout(new FlowLayout());
        mainPanel.add(northPanel,BorderLayout.NORTH);


        loginPanel = new JPanel();
        loginPanel.setLayout(new GridLayout(4,2));
        loginPanel.setBackground(Color.GRAY);
        loginPanel.setSize(400,200);
        northPanel.add(loginPanel);

        JLabel managerLogin = new JLabel("Login Manager");
        managerLogin.setBackground(Color.WHITE);
        managerLogin.setSize(50,50);
        loginPanel.add(managerLogin);

        JLabel accEmpty = new JLabel("");
        accEmpty.setBackground(Color.WHITE);
        accEmpty.setSize(50,50);
        loginPanel.add(accEmpty);

        JLabel managerLoginName = new JLabel("Name: ");
        managerLoginName.setBackground(Color.WHITE);
        managerLoginName.setSize(50,50);
        loginPanel.add(managerLoginName);

        managerNameField = new JTextField();
        managerNameField.setBackground(Color.WHITE);
        managerNameField.setSize(150,50);
        loginPanel.add(managerNameField);

        JLabel managerPassword = new JLabel("Password: ");
        managerPassword.setBackground(Color.WHITE);
        managerPassword.setSize(50,50);
        loginPanel.add(managerPassword);

        managerPasswordField = new JPasswordField();
        managerPasswordField.setBackground(Color.WHITE);
        managerPasswordField.setSize(150,50);
        loginPanel.add(managerPasswordField);








        mainPanel.setVisible(true);
        mainPanel.setEnabled(true);
        add(mainPanel);
    }
    public String getNameText() {
        return managerNameField.getText();
    }
    public String getPasswordText() {
        String passText = "";
        char[] pass = managerPasswordField.getPassword();
        for(int i=0;i<pass.length;i++) {
            passText += pass[i];
        }
        return passText;
    }
    public void completeButtons(JButton button) {
       northPanel.add(button);
    }
    public void completerButtonsTwo(FarmBankPanel panel) {
        System.out.println("we");
        ButtonListenerManagerLogin listener = new ButtonListenerManagerLogin(panel,mainPanel,names,passwords,farmbank);
        System.out.println("we2");
        JButton loginButton = new JButton("Login");
        System.out.println("we3");
        loginButton.setBackground(Color.WHITE);
        loginButton.setSize(50,50);
        loginButton.addActionListener(listener);
        System.out.println("we4");
        loginPanel.add(loginButton);
        System.out.println("we5");
    }


}
