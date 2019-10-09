import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListenerAddProductsRegister implements ActionListener {
    private JTextField describeText;
    private double price;
    private JTextField priceString;
    private FarmBank farmBank;
    private ComboBoxProducts productsList;
    private String describe;

    public ButtonListenerAddProductsRegister(FarmBank bank,ComboBoxProducts products, JTextField priceText, JTextField describeText) {
        farmBank = bank;
        productsList = products;
        priceString = priceText;
        this.describeText = describeText;

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        price = Double.parseDouble(priceString.getText());
        describe = describeText.getText();
        if (farmBank.getTempProductsFarmerCombo().get(farmBank.getTempProductsFarmerCombo().size() - 1) instanceof Apple) {
            Apple apple = (Apple) farmBank.getTempProductsFarmerCombo().get(farmBank.getTempProductsFarmerCombo().size() - 1);
            apple.setDescription(describe);
            apple.setPerKgPrice(price);
            farmBank.addTempProductFarmer(apple);
            System.out.println(farmBank.getTempProductFarmer());
        }
        if (farmBank.getTempProductsFarmerCombo().get(farmBank.getTempProductsFarmerCombo().size() - 1) instanceof Artichoke) {
            Artichoke artichoke = (Artichoke) farmBank.getTempProductsFarmerCombo().get(farmBank.getTempProductsFarmerCombo().size() - 1);
            artichoke.setDescription(describe);
            artichoke.setPerKgPrice(price);
            farmBank.addTempProductFarmer(artichoke);
            System.out.println(farmBank.getTempProductFarmer());
        }
        if (farmBank.getTempProductsFarmerCombo().get(farmBank.getTempProductsFarmerCombo().size() - 1) instanceof Cheese) {
            Cheese cheese = (Cheese) farmBank.getTempProductsFarmerCombo().get(farmBank.getTempProductsFarmerCombo().size() - 1);
            cheese.setDescription(describe);
            cheese.setPerKgPrice(price);
            farmBank.addTempProductFarmer(cheese);
            System.out.println(farmBank.getTempProductFarmer());
        }
        if (farmBank.getTempProductsFarmerCombo().get(farmBank.getTempProductsFarmerCombo().size() - 1) instanceof Egg) {
            Egg egg = (Egg) farmBank.getTempProductsFarmerCombo().get(farmBank.getTempProductsFarmerCombo().size() - 1);
            egg.setDescription(describe);
            egg.setPerKgPrice(price);
            farmBank.addTempProductFarmer(egg);
            System.out.println(farmBank.getTempProductFarmer());
        }
        if (farmBank.getTempProductsFarmerCombo().get(farmBank.getTempProductsFarmerCombo().size() - 1) instanceof Meat) {
            Meat meat = (Meat) farmBank.getTempProductsFarmerCombo().get(farmBank.getTempProductsFarmerCombo().size() - 1);
            meat.setDescription(describe);
            meat.setPerKgPrice(price);
            farmBank.addTempProductFarmer(meat);
            System.out.println(farmBank.getTempProductFarmer());
        }
        if (farmBank.getTempProductsFarmerCombo().get(farmBank.getTempProductsFarmerCombo().size() - 1) instanceof Milk) {
            Milk milk = (Milk) farmBank.getTempProductsFarmerCombo().get(farmBank.getTempProductsFarmerCombo().size() - 1);
            milk.setDescription(describe);
            milk.setPerKgPrice(price);
            farmBank.addTempProductFarmer(milk);
            System.out.println(farmBank.getTempProductFarmer());
        }
        if (farmBank.getTempProductsFarmerCombo().get(farmBank.getTempProductsFarmerCombo().size() - 1) instanceof Oil) {
            Oil oil = (Oil) farmBank.getTempProductsFarmerCombo().get(farmBank.getTempProductsFarmerCombo().size() - 1);
            oil.setDescription(describe);
            oil.setPerKgPrice(price);
            farmBank.addTempProductFarmer(oil);
            System.out.println(farmBank.getTempProductFarmer());
        }
        if (farmBank.getTempProductsFarmerCombo().get(farmBank.getTempProductsFarmerCombo().size() - 1) instanceof Olive) {
            Olive olive = (Olive) farmBank.getTempProductsFarmerCombo().get(farmBank.getTempProductsFarmerCombo().size() - 1);
            olive.setDescription(describe);
            olive.setPerKgPrice(price);
            farmBank.addTempProductFarmer(olive);
            System.out.println(farmBank.getTempProductFarmer());
        }
        if (farmBank.getTempProductsFarmerCombo().get(farmBank.getTempProductsFarmerCombo().size() - 1) instanceof Patato) {
            Patato patato = (Patato) farmBank.getTempProductsFarmerCombo().get(farmBank.getTempProductsFarmerCombo().size() - 1);
            patato.setDescription(describe);
            patato.setPerKgPrice(price);
            farmBank.addTempProductFarmer(patato);
            System.out.println(farmBank.getTempProductFarmer());
        }
        if (farmBank.getTempProductsFarmerCombo().get(farmBank.getTempProductsFarmerCombo().size() - 1) instanceof Tomato) {
            Tomato tomato = (Tomato) farmBank.getTempProductsFarmerCombo().get(farmBank.getTempProductsFarmerCombo().size() - 1);
            tomato.setDescription(describe);
            tomato.setPerKgPrice(price);
            farmBank.addTempProductFarmer(tomato);
            System.out.println(farmBank.getTempProductFarmer());
        }
        describeText.setText("");
        priceString.setText("");


    }
}