

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ButtonListenerAddFarmer implements ActionListener {
   private FarmBank farmBank;
   private TabbedPane tabbedPane;
   private RegisterFarmerPanel registerFarmerPanel;
   private ButtonListenerAddLocationsFarmer buttonListenerAddLocationsFarmer;
   public ButtonListenerAddFarmer(FarmBank bank , TabbedPane tabbedPane , RegisterFarmerPanel panel){
       farmBank = bank;
       this.tabbedPane = tabbedPane;
       registerFarmerPanel = panel;

   }




    @Override
    public void actionPerformed(ActionEvent e) {
        Farmer newFarmer = new Farmer(registerFarmerPanel.getName());
        boolean registerControl = true;
        for(int i=0;i<farmBank.getFarmers().size();i++) {
            if(registerFarmerPanel.getName().equals(farmBank.getFarmers().get(i).getName())) {
                registerControl = false;
                JOptionPane.showMessageDialog(null, "This Name Already Taken");
            }
        }

        if(registerFarmerPanel.getPasswordOne().equals(registerFarmerPanel.getPasswordTwo()) && !registerFarmerPanel.getPasswordOne().equals("") && !registerFarmerPanel.getName().equals("") && registerControl == true){
            for(int i = 0;i<farmBank.getTempFarmerLocation().size();i++) {
                newFarmer.addLocation(farmBank.getTempFarmerLocation().get(i));
            }
            for(int i = 0;i<farmBank.getTempProductFarmer().size();i++){
                newFarmer.addProduct(farmBank.getTempProductFarmer().get(i));
            }
            newFarmer.setPassWord(registerFarmerPanel.getPasswordOne());


            farmBank.addFarmer(newFarmer);

            System.out.println("Farmer Added");
            farmBank.getTempProductFarmer().clear();
            farmBank.getTempFarmerLocation().clear();
            registerFarmerPanel.refresh();
            JOptionPane.showMessageDialog(null, "Account Created");
        }

    }
}
