package OOP.DZ2.Animals;

import OOP.DZ2.AnimalClasses.Bird;
import OOP.DZ2.AnimalClasses.Commands.ComBird;

public class Chicken extends Bird implements ComBird{
    
    public Chicken(String typeOFanimal, double height, double weight, String eyeColor, int flying) {
        super(typeOFanimal, height, weight, eyeColor, flying);
    }

    @Override
    public String toString(){
        return super.toString();
    }

    @Override
    public void Up() {
        System.out.printf("\"Я лечу на %s метрах\"\n", HigFly());
    }

    @Override
    public void Voice() {
        System.out.println("Ко-ко-ко");
    }
}
