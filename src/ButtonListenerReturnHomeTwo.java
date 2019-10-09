import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListenerReturnHomeTwo implements ActionListener {
    private FarmBank farmbank;
    private TabbedPane tabbedPane;
    private int index;
    public ButtonListenerReturnHomeTwo(FarmBank bank,TabbedPane tabbedPane,int i) {
        farmbank = bank;
        this.tabbedPane = tabbedPane;
        index = i;
    }
    public void actionPerformed(ActionEvent e) {
        tabbedPane.swapTab(0);
        tabbedPane.closeTab(index);
        tabbedPane.openTab(0);
        tabbedPane.removeTab((index));




        System.out.println("Returning Home");
    }
}
