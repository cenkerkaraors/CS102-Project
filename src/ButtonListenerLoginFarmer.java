

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListenerLoginFarmer implements ActionListener {
    private FarmBank farmBank;
    private TabbedPane tabbedPane;
    public ButtonListenerLoginFarmer(FarmBank bank,TabbedPane pane) {
        farmBank = bank;
        tabbedPane = pane;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Login Farmer");
        completePanel();
        tabbedPane.openTab(3);
        tabbedPane.swapTab(3);
        tabbedPane.closeTab(0);

    }
    public void completePanel(){
        LoginFarmerPanel loginFarmerPanel = new LoginFarmerPanel();
        ButtonListenerReturnHomeTwo listener = new ButtonListenerReturnHomeTwo(farmBank,tabbedPane,3);
        JButton button = new JButton("Home");
        button.setSize(150,50);
        button.setBackground(Color.WHITE);
        button.addActionListener(listener);
        ButtonListenerFarmerLogin listenerFarmerLogin = new ButtonListenerFarmerLogin(farmBank,loginFarmerPanel);
        JButton loginAccountButton = new JButton("Login");
        loginAccountButton.setSize(50,50);
        loginAccountButton.setBackground(Color.WHITE);
        loginAccountButton.addActionListener(listenerFarmerLogin);
        loginFarmerPanel.completeButtons(loginAccountButton);

        loginFarmerPanel.setBackground(Color.WHITE);
        loginFarmerPanel.setSize(100,100);
        tabbedPane.completeFarmerLoginPanel(loginFarmerPanel,button);

    }
}
