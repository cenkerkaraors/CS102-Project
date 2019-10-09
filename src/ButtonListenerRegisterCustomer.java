import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListenerRegisterCustomer implements ActionListener {
    private FarmBank farmbank;
    private TabbedPane tabbedPane;
    public ButtonListenerRegisterCustomer(FarmBank bank,TabbedPane tabbedPane) {
        farmbank = bank;
        this.tabbedPane = tabbedPane;
    }
    public void actionPerformed(ActionEvent e) {
        tabbedPane.openTab(1);
        tabbedPane.swapTab(1);
        tabbedPane.closeTab(0);



        System.out.println("Registering Customer");
    }
}
