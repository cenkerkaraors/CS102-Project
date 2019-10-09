import javax.swing.*;
import java.awt.*;

public class TabbedPane extends JFrame {
    private FarmBank farmbank;




    //Defines Elements - İçine konacak elemanları alıyor örn: Bir plane koyup içini main methoda doldurabilirsin
    private HomeMainPanel homeMainPanel;
    private RegisterCustomerPanel registerCustomerMainPanel;
    private RegisterFarmerPanel registerFarmerMainPanel;




    //Defines Pane - Pane oluşturmak için lazım
    JTabbedPane tabbedPane = new JTabbedPane();


    //Constructor
    public TabbedPane(FarmBank bank,HomeMainPanel homePanel,RegisterCustomerPanel registerCustomerPanel,RegisterFarmerPanel registerFarmerPanel) {

        // Constructor - La bilgiğimiz constructor içi

        farmbank = bank;
        homeMainPanel = homePanel;
        registerCustomerMainPanel = registerCustomerPanel;
        registerFarmerMainPanel = registerFarmerPanel;







        // Add tab - Tab ekleniyor
        tabbedPane.addTab("Home",homeMainPanel);
        tabbedPane.addTab("Register Customer",registerCustomerMainPanel);
        tabbedPane.addTab("Register Farmer",registerFarmerMainPanel);


        // Default Statement
        tabbedPane.setEnabledAt(1,false);
        tabbedPane.setEnabledAt(2,false);







        // Add pane - Pane ekleniyor
        add(tabbedPane);







    }
    public void openTab(int index) {
        tabbedPane.setEnabledAt(index,true);

    }
    public void closeTab(int index) {
        tabbedPane.setEnabledAt(index,false);
    }

    public void swapTab(int index) {
        tabbedPane.setSelectedIndex(index);

    }

    public void removeTab(int index) {
        tabbedPane.removeTabAt(index);

    }

    public void completeCustomerMainPanel(CustomerMainPanel panel,JButton button) {
        panel.completeButtons(button);
        tabbedPane.addTab("Customer",panel);


    }
    public void completeFarmBankMainPanel(FarmBankPanel panel,JButton button) {
        panel.completeButtons(button);
        tabbedPane.addTab("Manager",panel);
    }
    public void completeFarmerLoginPanel(LoginFarmerPanel panel,JButton button) {
        panel.completeButtons(button);
        tabbedPane.addTab("Farmer",panel);
    }






}
