package OOP.DZ2.Animals;

import OOP.DZ2.AnimalClasses.Wild;

public class Wolf extends Wild{

    private String leader;

    public Wolf(String typeOFanimal, double height, double weight, String eyeColor, String habitat, String dateOfLocation, String leader) {
        super(typeOFanimal, height, weight, eyeColor, habitat, dateOfLocation);
        this.leader = leader;
    }

    @Override
    public String toString(){
        return super.toString() + String.format("\nВожак стаи: %s", leader);
    }

    @Override
    public void Voice() {
        System.out.println("Аууу!");;
    }
}
