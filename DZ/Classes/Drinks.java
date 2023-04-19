package OOP.DZ.Classes;

import OOP.DZ.Products;

public class Drinks extends Products{
    private double volume;

    public Drinks(String name, double price, int quantity, String measureUnit, double volume){
        super(name, price, quantity, measureUnit);
        this.volume = volume;
    }

    public double Volume(){return volume;}
}
