package OOP.DZ.SuccessorClasses;

import OOP.DZ.Classes.Hygiene;

public class Masks extends Hygiene{

    public Masks(String name, double price, int quantity, String measureUnit, int inPack){
        super(name, price, quantity, measureUnit, inPack);
    }
    
    public String toString(){
        return super.toString() + ("\nКоличество в упаковке: " + InPack());
        
        //String.format("Наименование: %s\nЦена: %.2f\nКоличество: %d\nЕденица измерения: %s\nКоличество в упаковке: %d", 
        //Name(), Price(), Quantity(), MeasuString(), InPack());
    }
}