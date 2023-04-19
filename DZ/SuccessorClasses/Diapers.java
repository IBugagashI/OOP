package OOP.DZ.SuccessorClasses;

import OOP.DZ.Classes.Baby;

public class Diapers extends Baby{
    private String size;
    private int minWeight;
    private int maxWeight;
    private String type;
    
    public Diapers(String name, double price, int quantity, String measureUnit, int minAge, String hypoallergenic, String size, int minWeight, int maxWeight, String type){
        super(name, price, quantity, measureUnit, minAge, hypoallergenic);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }
        
        @Override
        
    public String toString(){
        return super.toString() + String.format("\nМинимальный возраст: %d\nГипоаллергенный: %s\nРазмер: %s\nМинимальный вес: %d\nМаксимальный вес: %d\nТип: %s", 
        MinAge(), Allerg(), size, minWeight, maxWeight, type);        
    }
}
