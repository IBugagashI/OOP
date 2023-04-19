package OOP.DZ.Classes;

import OOP.DZ.Products;

public class Baby extends Products{
    private int minAge;
    private String hypoallergenic;

    public Baby(String name, double price, int quantity, String measureUnit, int minAge, String hypoallergenic){
        super(name, price, quantity, measureUnit);
        this.minAge = minAge;
        this.hypoallergenic = hypoallergenic;
    }

    public int MinAge(){return minAge;}
    public String Allerg(){return hypoallergenic;}
}