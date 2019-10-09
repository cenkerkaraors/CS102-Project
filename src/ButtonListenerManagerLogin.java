import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ButtonListenerManagerLogin implements ActionListener {
    private ArrayList<String> names;
    private ArrayList<String> passwords;
    private String name;
    private String password;
    private JPanel mainPanel;
    private FarmBankPanel farmBankPanel;
    private FarmBank farmbank;
    public ButtonListenerManagerLogin(FarmBankPanel bankPanel,JPanel panel,ArrayList<String> n,ArrayList<String> p,FarmBank bank) {
        mainPanel = panel;
        this.names = n;
        this.passwords = p;
        farmBankPanel = bankPanel;
        farmbank = bank;
    }
    public void actionPerformed(ActionEvent e) {
        for(int i=0;i<names.size();i++) {
            if(names.get(i).equals(farmBankPanel.getNameText()) && passwords.get(i).equals(farmBankPanel.getPasswordText())) {
                displayPanel(mainPanel,names.get(i));
                System.out.println("Logged in");
            }

        }
    }
    public void loginManager(String name) {
        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.WHITE);
        centerPanel.setSize(600,200);
        centerPanel.setLayout(new GridLayout(1,1));
        centerPanel.setVisible(true);
        mainPanel.add(centerPanel,BorderLayout.CENTER);


        JLabel welcome = new JLabel("Welcome " + name);
        welcome.setBackground(Color.WHITE);
        welcome.setSize(50,50);
        centerPanel.add(welcome);
    }
    public void displayPanel(JPanel panel,String n) {
        JPanel bankPanel = new JPanel();
        bankPanel.setBackground(Color.WHITE);
        bankPanel.setSize(100,100);
        bankPanel.setLayout(new GridLayout(4,1));
        panel.add(bankPanel,BorderLayout.CENTER);

        JLabel welcome = new JLabel("Welcome: " + n);
        welcome.setBackground(Color.WHITE);
        welcome.setSize(100,100);
        bankPanel.add(welcome);
        System.out.println("evieeerr");

        JLabel balanceLabel = new JLabel("FarmBanks Balance: " + farmbank.getBalance());
        balanceLabel.setBackground(Color.WHITE);
        balanceLabel.setSize(100,100);
        bankPanel.add(balanceLabel);

        JPanel customerListPanel = new JPanel();
        customerListPanel.setBackground(Color.WHITE);
        customerListPanel.setSize(100,100);
        customerListPanel.setLayout(new GridLayout(farmbank.getCustomers().size()+1,1));
        bankPanel.add(customerListPanel,BorderLayout.CENTER);

        JLabel listName = new JLabel("Customer List: ");
        listName.setBackground(Color.WHITE);
        listName.setSize(100,100);
        customerListPanel.add(listName);
        for(int i=0;i<farmbank.getCustomers().size();i++) {
            JLabel label = new JLabel(farmbank.getCustomers().get(i).getName());
            label.setBackground(Color.WHITE);
            label.setSize(100,100);
            customerListPanel.add(label);
        }
        JPanel farmerListPanel = new JPanel();
        farmerListPanel.setBackground(Color.WHITE);
        farmerListPanel.setSize(100,100);
        farmerListPanel.setLayout(new GridLayout(farmbank.getCustomers().size()+1,1));
        bankPanel.add(farmerListPanel,BorderLayout.CENTER);

        JLabel listNameTwo = new JLabel("Farmer List: ");
        listNameTwo.setBackground(Color.WHITE);
        listNameTwo.setSize(100,100);
        farmerListPanel.add(listNameTwo);

        for(int i=0;i<farmbank.getFarmers().size();i++) {
            JLabel label = new JLabel(farmbank.getFarmers().get(i).getName());
            label.setBackground(Color.WHITE);
            label.setSize(100,100);
            farmerListPanel.add(label);
        }

    }
}
