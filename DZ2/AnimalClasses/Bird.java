package OOP.DZ2.AnimalClasses;

import OOP.DZ2.Animal;

public abstract class Bird extends Animal{
    private int flying; // Высота полёта
    
    public Bird(String typeOFanimal, double height, double weight, String eyeColor, int flying) {
        super(typeOFanimal, height, weight, eyeColor);
        this.flying = flying;
    }

    public int HigFly(){
        return this.flying;
    }

    public abstract void Up();
}
