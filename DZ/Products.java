package OOP.DZ;

public class Products {
    private String name;// Название товара
    private double price;// Цена товара
    private int quantity;// Количество
    private String measureUnit;// Единица измерения(?)
    
    public Products(String name, double price, int quantity, String measureUnit){        
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.measureUnit = measureUnit;
    }

    public String Name(){return name;}
    public double Price(){return price;}
    public int Quantity(){return quantity;}
    public String MeasuString(){return measureUnit;}

    @Override
    public String toString(){
        return String.format("Наименование: %s\nЦена: %.2f\nКоличество: %d\nЕденица измерения: %s", name, price, quantity, measureUnit);
    }
}
