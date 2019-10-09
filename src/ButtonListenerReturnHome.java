import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListenerReturnHome implements ActionListener {
    private FarmBank farmbank;
    private TabbedPane tabbedPane;
    private int index;
    public ButtonListenerReturnHome(FarmBank bank,TabbedPane tabbedPane,int i) {
        farmbank = bank;
        this.tabbedPane = tabbedPane;
        index = i;
    }
    public void actionPerformed(ActionEvent e) {
        tabbedPane.swapTab(0);
        tabbedPane.closeTab(index);
        tabbedPane.openTab(0);





        System.out.println("Returning Home");
    }
}
