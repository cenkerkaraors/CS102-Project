import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String[] args) {
        FarmBank farmbank = new FarmBank();
        Farmer hüso = new Farmer("Hüso");
        Location locman = new Location("1",1);
        hüso.addLocation(locman);
        farmbank.addFarmer(hüso);
        Apple apple = new Apple("Apple",10,"Red");
        hüso.addProduct(apple);
        Artichoke artichoke = new Artichoke("Artichoke",10,"Not Okey");
        hüso.addProduct(artichoke);
        Cheese cheese = new Cheese("Cheese",10,"Cheesy");
        hüso.addProduct(cheese);
        Egg egg = new Egg("Egg",10,"How to Basic");
        hüso.addProduct(egg);
        Meat meat = new Meat("Meat",10,"Yummy");
        hüso.addProduct(meat);
        Milk milk = new Milk("Milk",10,"Luck Luck");
        hüso.addProduct(milk);
        Oil oil = new Oil("Oil",10,"Liquid");
        hüso.addProduct(oil);
        Olive olive = new Olive("Olive",10,"Dark");
        hüso.addProduct(olive);
        Patato patato = new Patato("Patato",10,"You are a patato");
        hüso.addProduct(patato);
        Tomato tomato = new Tomato("Tomato",10,"Red");




        //Home
        HomeMainPanel homeMainPanel = new HomeMainPanel();









        //Register Customer
        RegisterCustomerPanel registerCustomerMainPanel = new RegisterCustomerPanel();




        //Register Farmer
        RegisterFarmerPanel registerFarmerMainPanel = new RegisterFarmerPanel(farmbank);






        //Tabs
        TabbedPane tabbedPane = new TabbedPane(farmbank,homeMainPanel,registerCustomerMainPanel,registerFarmerMainPanel);
        tabbedPane.setSize(300,300);
        tabbedPane.setBackground(Color.WHITE);
        tabbedPane.setEnabled(true);





        // Home-ButtonListeners
        ButtonListenerRegisterCustomer registerCustomerButtonListener = new ButtonListenerRegisterCustomer(farmbank,tabbedPane);
        ButtonListenerLoginCustomer loginCustomerButtonListener = new ButtonListenerLoginCustomer(farmbank,tabbedPane);
        ButtonListenerLoginManager loginManagerButtonListener = new ButtonListenerLoginManager(farmbank,tabbedPane);
        ButtonListenerRegisterFarmer registerFarmerButtonListener = new ButtonListenerRegisterFarmer(farmbank,tabbedPane);
        ButtonListenerLoginFarmer loginFarmerButtonListener = new ButtonListenerLoginFarmer(farmbank,tabbedPane);


        // Home-Buttons
        JButton registerCustomerButton = new JButton("Register Customer");
        registerCustomerButton.setBackground(Color.CYAN);
        registerCustomerButton.setSize(50,50);
        homeMainPanel.addButtonRegister(registerCustomerButtonListener,registerCustomerButton);

        JButton loginCustomerButton = new JButton("Login Customer");
        loginCustomerButton.setBackground(Color.CYAN);
        loginCustomerButton.setSize(50,50);
        homeMainPanel.addloginCustomerButton(loginCustomerButtonListener,loginCustomerButton);

        JButton loginManagerButton = new JButton("Login Manager");
        loginManagerButton.setBackground(Color.CYAN);
        loginManagerButton.setSize(50,50);
        homeMainPanel.addLoginManagerButton(loginManagerButton,loginManagerButtonListener);


        JButton loginFarmerButton = new JButton("Login Farmer");
        loginFarmerButton.setBackground(Color.CYAN);
        loginFarmerButton.setSize(50,50);
        homeMainPanel.addLoginFarmerButton(loginFarmerButton,loginFarmerButtonListener);


        JButton registerFarmerButton = new JButton("Register Farmer ");
        registerFarmerButton.setBackground(Color.CYAN);
        registerFarmerButton.setSize(50,50);
        homeMainPanel.addButtonFarmerRegister(registerFarmerButtonListener,registerFarmerButton);



        // Extra Listener
        ButtonListenerReturnHome returnHomeButtonListener = new ButtonListenerReturnHome(farmbank,tabbedPane,1);
        ButtonListenerReturnHome returnHomeButtonListenerTwo = new ButtonListenerReturnHome(farmbank,tabbedPane,2);
        ButtonListenerAddCustomer addCustomerListener = new ButtonListenerAddCustomer(farmbank,tabbedPane,registerCustomerMainPanel);


        JButton returnHomeButton = new JButton("Home");
        returnHomeButton.setSize(150,50);
        returnHomeButton.setBackground(Color.WHITE);
        registerCustomerMainPanel.addReturnHomeButton(returnHomeButton,returnHomeButtonListener);

        JButton returnHomeButtonTwo = new JButton("Home");
        returnHomeButtonTwo.setSize(150,50);
        returnHomeButtonTwo.setBackground(Color.WHITE);



        JButton addCustomerButton = new JButton("Create Account");
        addCustomerButton.setSize(150,50);
        addCustomerButton.setBackground(Color.WHITE);
        registerCustomerMainPanel.addCustomerButton(addCustomerButton,addCustomerListener);




        // Login-Buttons

        JButton accountLoginCustomerButton = new JButton("Login");
        accountLoginCustomerButton.setSize(150,50);
        accountLoginCustomerButton.setBackground(Color.WHITE);


        JButton accountLoginFarmerButton = new JButton("Login");
        accountLoginFarmerButton.setSize(150,50);
        accountLoginFarmerButton.setBackground(Color.WHITE);







        //Extra
        ButtonListenerAddFarmer addFarmerListener = new ButtonListenerAddFarmer(farmbank,tabbedPane,registerFarmerMainPanel);
        registerFarmerMainPanel.addReturnHomeButton(returnHomeButtonTwo,returnHomeButtonListenerTwo);
        JButton addFarmerButton = new JButton("Create Account");
        addFarmerButton.setSize(150,50);
        addFarmerButton.setBackground(Color.WHITE);
        registerFarmerMainPanel.addFarmerButton(addFarmerButton,addFarmerListener);



        //End
        tabbedPane.setVisible(true);
        tabbedPane.setEnabled(true);
        tabbedPane.setDefaultCloseOperation(TabbedPane.EXIT_ON_CLOSE);
        tabbedPane.setDefaultCloseOperation(TabbedPane.DISPOSE_ON_CLOSE);

    }






}


