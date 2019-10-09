import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class OrderPanel extends JPanel {
    private Customer account;
    private Farmer farmer;
    private JPanel panel;
    private ArrayList<Product> products;
    private final ArrayList<JTextField> fields;
    private final ArrayList<Double> prices;
    JPanel orderMainPanel = new JPanel();
    JPanel orderPanel = new JPanel();
    public OrderPanel(JPanel p,Farmer f,Customer c) {
        panel = p;
        farmer = f;
        account = c;
        products = farmer.getProducts();
        fields = new ArrayList<JTextField>();
        prices = new ArrayList<Double>();

        orderPanel.setLayout(new GridLayout(3,1));
        orderPanel.setBackground(Color.CYAN);
        orderPanel.setSize(100,100);

        JPanel labelPanel = new JPanel();
        labelPanel.setLayout(new FlowLayout());
        labelPanel.setBackground(Color.CYAN);
        labelPanel.setSize(100,50);


        orderMainPanel.setLayout(new GridLayout(products.size(),5));
        orderMainPanel.setBackground(Color.CYAN);
        orderMainPanel.setSize(100,100);

        JLabel farmerLabel = new JLabel(farmer.getName()+"'s Products: ");
        farmerLabel.setBackground(Color.WHITE);
        farmerLabel.setSize(25,25);
        labelPanel.add(farmerLabel);

        JLabel balanceLabel = new JLabel("Your Balance: "+ account.getBalance());
        balanceLabel.setBackground(Color.WHITE);
        balanceLabel.setSize(25,25);
        labelPanel.add(balanceLabel);
        orderPanel.add(labelPanel);




        int count = 0;

        for(int i=0;i<products.size();i++) {
            if(products.get(i).getName().equals("Apple")) {

                count +=1;
                JLabel empty = new JLabel(count+". ");
                empty.setBackground(Color.WHITE);
                empty.setSize(25,25);
                orderMainPanel.add(empty);
                count +=1;

                Apple product = (Apple)products.get(i);
                JLabel productLabel = new JLabel(product.getName());
                productLabel.setBackground(Color.WHITE);
                productLabel.setSize(25,25);
                orderMainPanel.add(productLabel);

                JLabel descriptionLabel = new JLabel(product.getDescription());
                descriptionLabel.setBackground(Color.WHITE);
                descriptionLabel.setSize(25,25);
                orderMainPanel.add(descriptionLabel);

                JLabel priceLabel = new JLabel(product.getPerKgPrice() + "Per/Kg");
                priceLabel.setBackground(Color.WHITE);
                priceLabel.setSize(25,25);
                orderMainPanel.add(priceLabel);


                JTextField ammountField = new JTextField();
                ammountField.setBackground(Color.CYAN);
                ammountField.setSize(25,25);
                orderMainPanel.add(ammountField);
                fields.add(ammountField);
                prices.add(product.getPerKgPrice());



            }
            if(products.get(i).getName().equals("Artichoke")) {

                JLabel empty = new JLabel(count+". ");
                empty.setBackground(Color.WHITE);
                empty.setSize(25,25);
                orderMainPanel.add(empty);
                count +=1;


                Artichoke product = (Artichoke)products.get(i);
                JLabel productLabel = new JLabel(product.getName());
                productLabel.setBackground(Color.WHITE);
                productLabel.setSize(25,25);
                orderMainPanel.add(productLabel);

                JLabel descriptionLabel = new JLabel(product.getDescription());
                descriptionLabel.setBackground(Color.WHITE);
                descriptionLabel.setSize(25,25);
                orderMainPanel.add(descriptionLabel);

                JLabel priceLabel = new JLabel(product.getPerKgPrice() + "Per/Kg");
                priceLabel.setBackground(Color.WHITE);
                priceLabel.setSize(25,25);
                orderMainPanel.add(priceLabel);

                JTextField ammountField = new JTextField();
                ammountField.setBackground(Color.CYAN);
                ammountField.setSize(25,25);
                orderMainPanel.add(ammountField);
                fields.add(ammountField);
                prices.add(product.getPerKgPrice());
            }
            if(products.get(i).getName().equals("Cheese")) {
                JLabel empty = new JLabel(count+". ");
                empty.setBackground(Color.WHITE);
                empty.setSize(25,25);
                orderMainPanel.add(empty);
                count +=1;


                Cheese product = (Cheese)products.get(i);
                JLabel productLabel = new JLabel(product.getName());
                productLabel.setBackground(Color.WHITE);
                productLabel.setSize(25,25);
                orderMainPanel.add(productLabel);

                JLabel descriptionLabel = new JLabel(product.getDescription());
                descriptionLabel.setBackground(Color.WHITE);
                descriptionLabel.setSize(25,25);
                orderMainPanel.add(descriptionLabel);

                JLabel priceLabel = new JLabel(product.getPerKgPrice() + "Per/Kg");
                priceLabel.setBackground(Color.WHITE);
                priceLabel.setSize(25,25);
                orderMainPanel.add(priceLabel);

                JTextField ammountField = new JTextField();
                ammountField.setBackground(Color.CYAN);
                ammountField.setSize(25,25);
                orderMainPanel.add(ammountField);
                fields.add(ammountField);
                prices.add(product.getPerKgPrice());
            }
            if(products.get(i).getName().equals("Egg")) {

                JLabel empty = new JLabel(count+". ");
                empty.setBackground(Color.WHITE);
                empty.setSize(25,25);
                orderMainPanel.add(empty);
                count +=1;


                Egg product = (Egg)products.get(i);
                JLabel productLabel = new JLabel(product.getName());
                productLabel.setBackground(Color.WHITE);
                productLabel.setSize(25,25);
                orderMainPanel.add(productLabel);

                JLabel descriptionLabel = new JLabel(product.getDescription());
                descriptionLabel.setBackground(Color.WHITE);
                descriptionLabel.setSize(25,25);
                orderMainPanel.add(descriptionLabel);

                JLabel priceLabel = new JLabel(product.getPerPiecePrice() + "Per/Piece");
                priceLabel.setBackground(Color.WHITE);
                priceLabel.setSize(25,25);
                orderMainPanel.add(priceLabel);

                JTextField ammountField = new JTextField();
                ammountField.setBackground(Color.CYAN);
                ammountField.setSize(25,25);
                orderMainPanel.add(ammountField);
                fields.add(ammountField);
                prices.add(product.getPerPiecePrice());
            }
            if(products.get(i).getName().equals("Meat")) {

                JLabel empty = new JLabel(count+". ");
                empty.setBackground(Color.WHITE);
                empty.setSize(25,25);
                orderMainPanel.add(empty);
                count +=1;


                Meat product = (Meat)products.get(i);
                JLabel productLabel = new JLabel(product.getName());
                productLabel.setBackground(Color.WHITE);
                productLabel.setSize(25,25);
                orderMainPanel.add(productLabel);

                JLabel descriptionLabel = new JLabel(product.getDescription());
                descriptionLabel.setBackground(Color.WHITE);
                descriptionLabel.setSize(25,25);
                orderMainPanel.add(descriptionLabel);

                JLabel priceLabel = new JLabel(product.getPerKgPrice() + "Per/Kg");
                priceLabel.setBackground(Color.WHITE);
                priceLabel.setSize(25,25);
                orderMainPanel.add(priceLabel);

                JTextField ammountField = new JTextField();
                ammountField.setBackground(Color.CYAN);
                ammountField.setSize(25,25);
                orderMainPanel.add(ammountField);
                fields.add(ammountField);
                prices.add(product.getPerKgPrice());
            }
            if(products.get(i).getName().equals("Milk")) {
                JLabel empty = new JLabel(count+". ");
                empty.setBackground(Color.WHITE);
                empty.setSize(25,25);
                orderMainPanel.add(empty);
                count +=1;


                Milk product = (Milk)products.get(i);
                JLabel productLabel = new JLabel(product.getName());
                productLabel.setBackground(Color.WHITE);
                productLabel.setSize(25,25);
                orderMainPanel.add(productLabel);

                JLabel descriptionLabel = new JLabel(product.getDescription());
                descriptionLabel.setBackground(Color.WHITE);
                descriptionLabel.setSize(25,25);
                orderMainPanel.add(descriptionLabel);

                JLabel priceLabel = new JLabel(product.getPerLiterPrice() + "Per/Liter");
                priceLabel.setBackground(Color.WHITE);
                priceLabel.setSize(25,25);
                orderMainPanel.add(priceLabel);

                JTextField ammountField = new JTextField();
                ammountField.setBackground(Color.CYAN);
                ammountField.setSize(25,25);
                orderMainPanel.add(ammountField);
                fields.add(ammountField);
                prices.add(product.getPerLiterPrice());
            }
            if(products.get(i).getName().equals("Oil")) {
                JLabel empty = new JLabel(count+". ");
                empty.setBackground(Color.WHITE);
                empty.setSize(25,25);
                orderMainPanel.add(empty);
                count +=1;


                Oil product = (Oil)products.get(i);
                JLabel productLabel = new JLabel(product.getName());
                productLabel.setBackground(Color.WHITE);
                productLabel.setSize(25,25);
                orderMainPanel.add(productLabel);

                JLabel descriptionLabel = new JLabel(product.getDescription());
                descriptionLabel.setBackground(Color.WHITE);
                descriptionLabel.setSize(25,25);
                orderMainPanel.add(descriptionLabel);

                JLabel priceLabel = new JLabel(product.getPerLiterPrice() + "Per/Liter");
                priceLabel.setBackground(Color.WHITE);
                priceLabel.setSize(25,25);
                orderMainPanel.add(priceLabel);

                JTextField ammountField = new JTextField();
                ammountField.setBackground(Color.CYAN);
                ammountField.setSize(25,25);
                orderMainPanel.add(ammountField);
                fields.add(ammountField);
                prices.add(product.getPerLiterPrice());
            }
            if(products.get(i).getName().equals("Olive")) {

                JLabel empty = new JLabel(count+". ");
                empty.setBackground(Color.WHITE);
                empty.setSize(25,25);
                orderMainPanel.add(empty);
                count +=1;


                Olive product = (Olive)products.get(i);
                JLabel productLabel = new JLabel(product.getName());
                productLabel.setBackground(Color.WHITE);
                productLabel.setSize(25,25);
                orderMainPanel.add(productLabel);

                JLabel descriptionLabel = new JLabel(product.getDescription());
                descriptionLabel.setBackground(Color.WHITE);
                descriptionLabel.setSize(25,25);
                orderMainPanel.add(descriptionLabel);

                JLabel priceLabel = new JLabel(product.getPerKgPrice() + "Per/Kg");
                priceLabel.setBackground(Color.WHITE);
                priceLabel.setSize(25,25);
                orderMainPanel.add(priceLabel);

                JTextField ammountField = new JTextField();
                ammountField.setBackground(Color.CYAN);
                ammountField.setSize(25,25);
                orderMainPanel.add(ammountField);
                fields.add(ammountField);
                prices.add(product.getPerKgPrice());
            }
            if(products.get(i).getName().equals("Patato")) {

                JLabel empty = new JLabel(count+". ");
                empty.setBackground(Color.WHITE);
                empty.setSize(25,25);
                orderMainPanel.add(empty);
                count +=1;


                Patato product = (Patato)products.get(i);
                JLabel productLabel = new JLabel(product.getName());
                productLabel.setBackground(Color.WHITE);
                productLabel.setSize(25,25);
                orderMainPanel.add(productLabel);

                JLabel descriptionLabel = new JLabel(product.getDescription());
                descriptionLabel.setBackground(Color.WHITE);
                descriptionLabel.setSize(25,25);
                orderMainPanel.add(descriptionLabel);

                JLabel priceLabel = new JLabel(product.getPerKgPrice() + "Per/Kg");
                priceLabel.setBackground(Color.WHITE);
                priceLabel.setSize(25,25);
                orderMainPanel.add(priceLabel);

                JTextField ammountField = new JTextField();
                ammountField.setBackground(Color.CYAN);
                ammountField.setSize(25,25);
                orderMainPanel.add(ammountField);
                fields.add(ammountField);
                prices.add(product.getPerKgPrice());
            }
            if(products.get(i).getName().equals("Tomato")) {

                JLabel empty = new JLabel(count+". ");
                empty.setBackground(Color.WHITE);
                empty.setSize(25,25);
                orderMainPanel.add(empty);
                count +=1;


                Tomato product = (Tomato)products.get(i);
                JLabel productLabel = new JLabel(product.getName());
                productLabel.setBackground(Color.WHITE);
                productLabel.setSize(25,25);
                orderMainPanel.add(productLabel);

                JLabel descriptionLabel = new JLabel(product.getDescription());
                descriptionLabel.setBackground(Color.WHITE);
                descriptionLabel.setSize(25,25);
                orderMainPanel.add(descriptionLabel);

                JLabel priceLabel = new JLabel(product.getPerKgPrice() + "Per/Kg");
                priceLabel.setBackground(Color.WHITE);
                priceLabel.setSize(25,25);
                orderMainPanel.add(priceLabel);

                JTextField ammountField = new JTextField();
                ammountField.setBackground(Color.CYAN);
                ammountField.setSize(25,25);
                orderMainPanel.add(ammountField);
                fields.add(ammountField);
                prices.add(product.getPerKgPrice());
            }




        }
        orderMainPanel.setVisible(true);
        orderMainPanel.setEnabled(true);
        orderPanel.add(orderMainPanel);


        ButtonListenerOrder listenerOrder = new ButtonListenerOrder(account,farmer,fields,prices,balanceLabel);
        JButton orderButton = new JButton("Order");
        orderButton.setBackground(Color.WHITE);
        orderButton.setSize(25,25);
        orderButton.addActionListener(listenerOrder);
        orderPanel.add(orderButton);


        panel.add(orderPanel);
        //repaint();


    }


}
