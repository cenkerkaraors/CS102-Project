import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class ComboBoxListenerFarmers implements ItemListener {
    private ArrayList<Farmer> list;
    private FarmBank empty = new FarmBank();
    private JPanel southPanel;
    private Customer account;
    public ComboBoxListenerFarmers(ArrayList<Farmer> l,JPanel panel,Customer a) {
        list = l;
        southPanel = panel;
        account = a;


    }
    public void itemStateChanged(ItemEvent e) {
        if(e.getStateChange() == ItemEvent.SELECTED) {
            southPanel.removeAll();
            if(!((String)e.getItem()).equals("Farmer(Default)")) {
                String text = (String) e.getItem();
                System.out.println(text);
                for(int i=0;i<list.size();i++) {
                    if(text.equals(list.get(i).getName())) {
                        Farmer farmer = list.get(i);
                        OrderPanel orderPanel = new OrderPanel(southPanel,farmer,account);
                    }
                }


            }


        }

    }
}
