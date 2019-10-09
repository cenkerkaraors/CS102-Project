

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ButtonListenerAddLocationsFarmer implements ActionListener {
   private JTextField zipCode;
   private JTextField locationName;
   private FarmBank farmBank;
    public ButtonListenerAddLocationsFarmer(FarmBank farmBank,JTextField locationName,JTextField zipCode){
        this.locationName = locationName;
        this.zipCode = zipCode;
        this.farmBank = farmBank;
   }








    @Override
    public void actionPerformed(ActionEvent e) {
       double tempZip = Double.parseDouble(zipCode.getText());
       Location tempLocation = new Location(locationName.getText(),(int) tempZip);
       farmBank.addTempFarmerLocations(tempLocation);
       System.out.println(farmBank.getTempFarmerLocation());
       zipCode.setText("");
       locationName.setText("");

    }

    public ArrayList<Location> getTempLocationList(){
        return farmBank.getTempFarmerLocation();
    }

}
