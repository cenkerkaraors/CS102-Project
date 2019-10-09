import javax.swing.*;
import java.awt.*;

public class HomeMainPanel extends JPanel {
    private ButtonListenerRegisterCustomer listenerRegisterCustomer;
    private ButtonListenerRegisterFarmer listenerRegisterFarmer;
    private JButton buttonRegisterCustomer;
    private JButton buttonRegisterFarmer;
    private ButtonListenerLoginCustomer listenerLoginCustomer;
    private JButton buttonLoginCustomer;
    private JButton buttonLoginManager;
    private JPanel panelHomeCenterPanel;
    private JButton buttonLoginFarmer;


    JPanel homeMainPanel = new JPanel();
    public HomeMainPanel() {
        // Home-Main-Panel
        homeMainPanel.setLayout(new BorderLayout());
        homeMainPanel.setBackground(Color.WHITE);
        homeMainPanel.setSize(600,600);

        // Home-Center-Panel
        JPanel homeCenterPanel = new JPanel();
        homeCenterPanel.setLayout(new GridLayout(5,1));
        homeCenterPanel.setBackground(Color.WHITE);
        homeCenterPanel.setSize(300,300);
        panelHomeCenterPanel = homeCenterPanel;
        homeMainPanel.add(panelHomeCenterPanel,BorderLayout.CENTER);



        // Home-Labels
        JLabel welcome = new JLabel("Welcome to FarmBank");
        welcome.setBackground(Color.WHITE);
        welcome.setSize(50,50);
        homeMainPanel.add(welcome,BorderLayout.NORTH);


        JLabel developers = new JLabel("Created by: Cenker Karaörs - Burak Deniz");
        developers.setBackground(Color.WHITE);
        developers.setSize(50,50);
        homeMainPanel.add(developers,BorderLayout.SOUTH);

        add(homeMainPanel);


    }
    public void addButtonRegister(ButtonListenerRegisterCustomer listenerRegisterC,JButton buttonRegisterC) {
        this.listenerRegisterCustomer = listenerRegisterC;
        this.buttonRegisterCustomer = buttonRegisterC;
        buttonRegisterCustomer.addActionListener(listenerRegisterCustomer);
        panelHomeCenterPanel.add(buttonRegisterCustomer);

    }
    public void addloginCustomerButton(ButtonListenerLoginCustomer listener,JButton button) {
        listenerLoginCustomer = listener;
        buttonLoginCustomer = button;
        buttonLoginCustomer.addActionListener(listenerLoginCustomer);
        panelHomeCenterPanel.add(buttonLoginCustomer);
    }
    public void addLoginManagerButton(JButton button,ButtonListenerLoginManager listener) {
        buttonLoginManager = button;
        buttonLoginManager.addActionListener(listener);
        panelHomeCenterPanel.add(buttonLoginManager);
    }
    public void addButtonFarmerRegister(ButtonListenerRegisterFarmer listenerRegisterFarmer,JButton buttonRegisterFarmer){
        this.listenerRegisterFarmer = listenerRegisterFarmer;
        this.buttonRegisterFarmer = buttonRegisterFarmer;
        this.buttonRegisterFarmer.addActionListener(this.listenerRegisterFarmer);
        panelHomeCenterPanel.add(this.buttonRegisterFarmer);
    }
    public void addLoginFarmerButton(JButton button,ButtonListenerLoginFarmer listener){
        buttonLoginFarmer = button;
        buttonLoginFarmer.addActionListener(listener);
        panelHomeCenterPanel.add(buttonLoginFarmer);
    }

}
