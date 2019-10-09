
import javax.swing.*;
import java.awt.*;

public class RegisterFarmerPanel extends JPanel {
    private ButtonListenerReturnHome listenerReturnHome;
    private ButtonListenerAddFarmer listenerAddFarmer;
    private JTextField farmerLocationName;
    private JTextField farmerLocationZipCode;
    private JButton returnHomeButton;
    private JButton addFarmerButton;
    private JPanel registerFarmerNorthPanel;
    private JPanel registerFarmerCenterPanel;
    private JTextField nameField;
    private JPasswordField passwordField;
    private JPasswordField passwordFieldTwo;
    private JButton locationListButton;
    private FarmBank farmBank;
    private JTextField unitPriceText;
    //   private ButtonListenerLocationList buttonListenerLocationList;
    private JButton productListButton;
    private JTextField descriptionText;


    /* private ArrayList<Product> productArrayList;
     private ArrayList<Location> deliverLocationList;
     private ArrayLis<>
 */
    JPanel registerFarmerMainPanel = new JPanel();

    public RegisterFarmerPanel(FarmBank farmBank) {
        this.farmBank = farmBank;
        registerFarmerMainPanel.setLayout(new BorderLayout());
        registerFarmerMainPanel.setBackground(Color.WHITE);
        registerFarmerMainPanel.setSize(600, 600);

        registerFarmerNorthPanel = new JPanel();
        registerFarmerNorthPanel.setSize(600, 50);
        registerFarmerNorthPanel.setBackground(Color.WHITE);
        registerFarmerNorthPanel.setLayout(new FlowLayout());
        registerFarmerMainPanel.add(registerFarmerNorthPanel, BorderLayout.NORTH);

        registerFarmerCenterPanel = new JPanel();
        registerFarmerCenterPanel.setSize(600, 50);
        registerFarmerCenterPanel.setBackground(Color.WHITE);
        registerFarmerCenterPanel.setLayout(new GridLayout(10, 2));
        registerFarmerMainPanel.add(registerFarmerCenterPanel, BorderLayout.CENTER);

        //Components
        JLabel welcomeRegisterFarmer = new JLabel(" Register Farmer ");
        welcomeRegisterFarmer.setBackground(Color.WHITE);
        welcomeRegisterFarmer.setSize(150, 50);
        registerFarmerNorthPanel.add(welcomeRegisterFarmer);

        JLabel nameLabel = new JLabel("Enter Name: ");
        nameLabel.setBackground(Color.WHITE);
        nameLabel.setSize(150, 50);
        registerFarmerCenterPanel.add(nameLabel);

        nameField = new JTextField();
        nameField.setBackground(Color.WHITE);
        nameField.setSize(150, 50);
        registerFarmerCenterPanel.add(nameField);

        JLabel passwordLAbel = new JLabel("Enter Password: ");
        passwordLAbel.setBackground(Color.WHITE);
        passwordLAbel.setSize(150, 50);
        registerFarmerCenterPanel.add(passwordLAbel);

        passwordField = new JPasswordField();
        passwordField.setBackground(Color.WHITE);
        passwordField.setSize(150, 50);
        registerFarmerCenterPanel.add(passwordField);

        JLabel passwordLabelTwo = new JLabel("Enter Password: ");
        passwordLabelTwo.setBackground(Color.WHITE);
        passwordLabelTwo.setSize(150, 50);
        registerFarmerCenterPanel.add(passwordLabelTwo);

        passwordFieldTwo = new JPasswordField();
        passwordFieldTwo.setBackground(Color.WHITE);
        passwordFieldTwo.setSize(150, 50);
        registerFarmerCenterPanel.add(passwordFieldTwo);

        JLabel locationNameLabel = new JLabel("Enter your delivery place name ");
        locationNameLabel.setBackground(Color.WHITE);
        locationNameLabel.setSize(150,50);
        registerFarmerCenterPanel.add(locationNameLabel);

        farmerLocationName = new JTextField();
        farmerLocationName.setSize(150,50);
        farmerLocationName.setBackground(Color.WHITE);
        registerFarmerCenterPanel.add(farmerLocationName);


        JLabel locationZipCodeLabel = new JLabel("Enter your delivery place  zip code: ");
        locationZipCodeLabel.setBackground(Color.WHITE);
        locationZipCodeLabel.setSize(150, 50);
        registerFarmerCenterPanel.add(locationZipCodeLabel);

        farmerLocationZipCode = new JTextField();
        farmerLocationZipCode.setBackground(Color.WHITE);
        farmerLocationZipCode.setSize(150,50);
        registerFarmerCenterPanel.add(farmerLocationZipCode);

        JLabel emptyLabel1 = new JLabel("Press To add Locations");
        emptyLabel1.setSize(150,50);
        emptyLabel1.setBackground(Color.BLACK);
        registerFarmerCenterPanel.add(emptyLabel1);

        locationListButton = new JButton("Press to add locations: ");
        locationListButton.setBackground(Color.BLUE);
        locationListButton.setSize(150, 50);
        locationListButton.addActionListener(new ButtonListenerAddLocationsFarmer(this.farmBank,farmerLocationName, farmerLocationZipCode));
        registerFarmerCenterPanel.add(locationListButton);



        JLabel productLabel = new JLabel("Chose your products: ");
        productLabel.setSize(150, 50);
        productLabel.setBackground(Color.WHITE);
        registerFarmerCenterPanel.add(productLabel);

        ComboBoxProducts productsList = new ComboBoxProducts(registerFarmerCenterPanel,this.farmBank);

        JLabel unitPriceLabel = new JLabel("Enter the unit Price");
        unitPriceLabel.setSize(150,50);
        unitPriceLabel.setBackground(Color.WHITE);
        registerFarmerCenterPanel.add(unitPriceLabel);

        unitPriceText = new JTextField();
        unitPriceText.setSize(150,50);
        unitPriceText.setBackground(Color.WHITE);
        registerFarmerCenterPanel.add(unitPriceText);

        JLabel descriptionLabel = new JLabel("Enter The description");
        descriptionLabel.setSize(150,50);
        descriptionLabel.setBackground(Color.WHITE);
        registerFarmerCenterPanel.add(descriptionLabel);

        descriptionText = new JTextField();
        descriptionText.setSize(150,50);
        descriptionText.setBackground(Color.WHITE);
        registerFarmerCenterPanel.add(descriptionText);


        productListButton = new JButton("Product List");
        productListButton.addActionListener(new ButtonListenerAddProductsRegister(this.farmBank,productsList,unitPriceText,descriptionText));
        productListButton.setSize(150, 50);
        productListButton.setBackground(Color.BLUE);
        registerFarmerCenterPanel.add(productListButton);

        add(registerFarmerMainPanel);
    }

    public void addReturnHomeButton(JButton button, ButtonListenerReturnHome listener) {
        listenerReturnHome = listener;
        returnHomeButton = button;
        returnHomeButton.addActionListener(listenerReturnHome);
        registerFarmerNorthPanel.add(returnHomeButton);
    }
   public void addFarmerButton(JButton button,ButtonListenerAddFarmer listener) {
        addFarmerButton = button;
        listenerAddFarmer = listener;
        addFarmerButton.addActionListener(listenerAddFarmer);
        registerFarmerMainPanel.add(addFarmerButton,BorderLayout.SOUTH);
    }
    public String getName(){
        return nameField.getText();
    }
    public String  getPasswordOne(){
        String passwordOne = "";
        char [] pass = passwordField.getPassword();
        for(int i = 0 ; i<pass.length;i++){
            passwordOne += pass[i];
        }
        return passwordOne;
    }
    public String getPasswordTwo(){
        String passWordTwo = "";
        char[] passTwo = passwordFieldTwo.getPassword();
        for(int i= 0 ; i<passTwo.length;i++){
            passWordTwo += passTwo[i];
        }
        return passWordTwo;
    }
    public void refresh() {
        farmerLocationName.setText("");
        farmerLocationZipCode.setText("");
        nameField.setText("");
        passwordField.setText("");
        passwordFieldTwo.setText("");
        unitPriceText.setText("");
        descriptionText.setText("");
    }



}