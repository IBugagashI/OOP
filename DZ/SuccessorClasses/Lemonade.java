package OOP.DZ.SuccessorClasses;

import OOP.DZ.Classes.Drinks;

public class Lemonade extends Drinks{
    
    public Lemonade(String name, double price, int quantity, String measureUnit, double volume){
        super(name, price, quantity, measureUnit, volume);
    }
    
    @Override
    public String toString(){
        return String.format("Наименование: %s\nЦена: %.2f\nКоличество: %d\nЕденица измерения: %s\nОбъём: %.1f", 
        Name(), Price(), Quantity(), MeasuString(), Volume());
    }
}
