import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ButtonListenerFarmerLogin implements ActionListener {
    private FarmBank farmBank;
    private LoginFarmerPanel farmerPanel;
    private boolean loginControl;

    public ButtonListenerFarmerLogin(FarmBank bank,LoginFarmerPanel panel){
        farmBank = bank;
        farmerPanel = panel;
        loginControl = false;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String userName = farmerPanel.getNameText();
        String userPassword = farmerPanel.getPasswordText();
        ArrayList<Farmer> list = farmBank.getFarmers();
        for(int i = 0 ;i<list.size();i++){
            Farmer guyF = list.get(i);
            if(guyF.getName().equals(userName) && guyF.getPassWord().equals(userPassword)){
                farmerPanel.login(guyF);
                loginControl = true;
                System.out.println("Logged in ");
                break;
            }
        }


    }
}
