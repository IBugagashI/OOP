package OOP.DZ.Classes;

import OOP.DZ.Products;

public class Hygiene extends Products{
    private int inPack;

    public Hygiene(String name, double price, int quantity, String measureUnit, int inPack){
        super(name, price, quantity, measureUnit);
        this.inPack = inPack;
    }    

    public int InPack() {return inPack;}
}
