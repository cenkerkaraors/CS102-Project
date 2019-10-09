import javax.swing.*;
import java.util.ArrayList;

public class ComboBoxProducts extends JComboBox<Product> {
    private JPanel mainPanel;
    private FarmBank farmBank;
    private ArrayList<Product> products;

    public ComboBoxProducts(JPanel panel , FarmBank bank ) {
        mainPanel = panel;
        farmBank = bank;
        products = new ArrayList<>();

        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("");

        farmBank.setInitialProductList();
        products = farmBank.getInitialProductList();
        for (int i = 0; i < products.size(); i++) {
            comboBox.addItem(products.get(i).getName());
        }
        comboBox.addItemListener(new ComboBoxListenerProducts(farmBank));

        mainPanel.add(comboBox);
        mainPanel.setVisible(true);



    }

}
