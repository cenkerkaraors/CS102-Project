

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListenerRegisterFarmer implements ActionListener {
    private FarmBank farmBank;
    private TabbedPane tabbedPane;
    public ButtonListenerRegisterFarmer(FarmBank farmBank ,TabbedPane tabbedPane){
        this.farmBank = farmBank;
        this.tabbedPane = tabbedPane;
    }





    @Override
    public void actionPerformed(ActionEvent e) {
        tabbedPane.openTab(2);
        tabbedPane.swapTab(2);
        System.out.println("Register Farmer");
    }
}
