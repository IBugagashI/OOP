package OOP.DZ.SuccessorClasses;

import OOP.DZ.Classes.Food;

public class Eggs extends Food{//
    private int inPack;

    public Eggs(String name, double price, int quantity, String measureUnit, String shelfLife,int inPack) {
        super(name, price, quantity, measureUnit, shelfLife);
        this.inPack = inPack;
    }
    
    @Override
    public String toString(){
        return String.format("Наименование: %s\nЦена: %.2f\nКоличество: %d\nЕденица измерения: %s\nСрок годности: %s\nКоличество в упаковке: %d", 
        Name(), Price(), Quantity(), MeasuString(), ShelfLife(), inPack);
    }
}
