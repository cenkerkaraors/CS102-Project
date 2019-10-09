import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListenerLoginManager implements ActionListener {
    private FarmBank farmbank;
    private TabbedPane tabbedPane;
    public ButtonListenerLoginManager(FarmBank bank,TabbedPane pane) {
        farmbank = bank;
        tabbedPane = pane;
    }
    public void actionPerformed(ActionEvent e) {
        System.out.println("Login Manager");
        completePanel();
        tabbedPane.openTab(3);
        tabbedPane.swapTab(3);
        tabbedPane.closeTab(0);


    }
    public void completePanel() {
        FarmBankPanel panel = new FarmBankPanel(farmbank);
        ButtonListenerReturnHomeTwo listener = new ButtonListenerReturnHomeTwo(farmbank,tabbedPane,3);
        JButton button = new JButton("Home");
        button.setSize(150,50);
        button.setBackground(Color.WHITE);
        button.addActionListener(listener);
        tabbedPane.completeFarmBankMainPanel(panel,button);
        panel.completerButtonsTwo(panel);
    }

}
