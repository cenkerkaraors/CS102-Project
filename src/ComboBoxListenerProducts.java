import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ComboBoxListenerProducts implements ItemListener {
    private FarmBank farmBank;

    public ComboBoxListenerProducts(FarmBank bank){
        farmBank = bank;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getItem().equals("Apple") ){
            Apple apple = new Apple("Apple",0,"");
            farmBank.addTempProductCombo(apple);


        }
        if(e.getItem().equals("Artichoke")){
            Artichoke artichoke = new Artichoke("Artichoke",0.00,"");
            farmBank.addTempProductCombo(artichoke);

        }
        if(e.getItem().equals("Cheese")){
            Cheese cheese = new Cheese("Cheese",0.00,"");
            farmBank.addTempProductCombo(cheese);

        }
        if(e.getItem().equals("Egg")){
            Egg  egg = new Egg("Egg",0.00,"");
            farmBank.addTempProductCombo(egg);
        }
        if (e.getItem().equals("Meat")){
            Meat meat = new Meat("Meat",0,"");
            farmBank.addTempProductCombo(meat);
        }
        if(e.getItem().equals("Milk")){
            Milk milk = new Milk("Milk",0,"");
            farmBank.addTempProductCombo(milk);
        }
        if (e.getItem().equals("Oil")){
            Oil oil = new Oil("Oil",0,"");
            farmBank.addTempProductCombo(oil);
        }
        if (e.getItem().equals("Olive")){
            Olive olive = new Olive("Olive",0,"");
            farmBank.addTempProductCombo(olive);

        }
        if(e.getItem().equals("Patato")){
            Patato patato = new Patato("Patato", 0,"");
            farmBank.addTempProductCombo(patato);
        }
        if(e.getItem().equals("Tomato")){
            Tomato tomato = new Tomato("Tomato",0,"");
            farmBank.addTempProductCombo(tomato);
        }



    }

}
