package OOP.DZ.SuccessorClasses;

import OOP.DZ.Classes.Baby;

public class Nipple extends Baby{

    public Nipple(String name, double price, int quantity, String measureUnit, int minAge, String hypoallergenic){
        super(name, price, quantity, measureUnit, minAge, hypoallergenic);
    }

    @Override
    public String toString(){
        return super.toString() + String.format("\nМинимальный возраст: %d\nГипоаллергенный: %s", MinAge(), Allerg());
    }
}
