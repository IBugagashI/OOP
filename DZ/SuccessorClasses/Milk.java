package OOP.DZ.SuccessorClasses;

import OOP.DZ.Classes.Food;

public class Milk extends Food{
    private double fat;

    public Milk(String name, double price, int quantity, String measureUnit, String shelfLife, double fat){
        super(name, price, quantity, measureUnit, shelfLife);
        this.fat = fat;
    }

    @Override
    public String toString(){
        return String.format("Наименование: %s\nЦена: %.2f\nКоличество: %d\nЕденица измерения: %s\nСрок годности: %s\nПроцент жирности: %.1f %%", 
        Name(), Price(), Quantity(), MeasuString(), ShelfLife(), fat);
    }
}