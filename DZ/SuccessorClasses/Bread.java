package OOP.DZ.SuccessorClasses;

import OOP.DZ.Classes.Food;

public class Bread extends Food{
        private String flourGrade;

    public Bread(String name, double price, int quantity, String measureUnit, String shelfLife, String flourGrade){
        super(name, price, quantity, measureUnit, shelfLife);
        this.flourGrade = flourGrade;
    }

    @Override
    public String toString(){
        return String.format("Наименование: %s\nЦена: %.2f\nКоличество: %d\nЕденица измерения: %s\nСрок годности: %s\nСорт муки: %s", 
        Name(), Price(), Quantity(), MeasuString(), ShelfLife(), flourGrade);
    }
}