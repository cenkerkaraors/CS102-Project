import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ComboBoxFarmers extends JComboBox<String> {
    private JPanel mainPanel;
    private FarmBank farmbank;
    private Customer activeAccount;
    private JPanel southPanel;
    private ArrayList<Farmer> availableFarmers;
    ArrayList<Farmer> farmers;



    // Constructor
    public ComboBoxFarmers(JPanel panel,FarmBank bank,Customer account,JPanel south) {
        mainPanel = panel;
        farmbank = bank;
        activeAccount = account;
        southPanel = south;
        availableFarmers = new ArrayList<Farmer>();


        //  Creates JComboBox
        JComboBox<String> comboBox = new JComboBox<String>();

        farmers = farmbank.getFarmers();
        comboBox.addItem("Farmer(Default)");
        Farmer defaultFarmer = new Farmer("");
        availableFarmers.add(defaultFarmer);
        for(int i=0;i<farmers.size();i++) {

            // farmers locationlist
            ArrayList<Location> locations = farmers.get(i).getLocations();
            for(int k=0;k<locations.size();k++) {
                if(locations.get(k).getName().equals(activeAccount.getLocation().getName())) {
                    comboBox.addItem(farmers.get(i).getName());
                    availableFarmers.add(farmers.get(i));
                }
            }
        }






        // Add listener to ComboBox
        ComboBoxListenerFarmers listener = new ComboBoxListenerFarmers(availableFarmers,southPanel,activeAccount);
        comboBox.addItemListener(listener);



        mainPanel.add(comboBox);
        mainPanel.setVisible(true);



    }
    public ArrayList<Farmer> getAvailableFarmers() {
        return availableFarmers;
    }

}
