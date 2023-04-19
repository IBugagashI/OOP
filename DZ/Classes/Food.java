package OOP.DZ.Classes;

import OOP.DZ.Products;

public class Food extends Products {
    private String shelfLife;

    public Food(String name, double price, int quantity, String measureUnit, String shelfLife){
        super(name, price, quantity, measureUnit);
        this.shelfLife = shelfLife;
    }
    
    public String ShelfLife(){return shelfLife;}
}
