package OOP.DZ2.Animals;

import OOP.DZ2.AnimalClasses.Wild;

public class Tiger extends Wild{

    public Tiger(String typeOFanimal, double height, double weight, String eyeColor, String habitat, String dateOfLocation) {
        super(typeOFanimal, height, weight, eyeColor, habitat, dateOfLocation);
    }

    @Override
    public String toString(){
        return super.toString();
    }

    @Override
    public void Voice() {
        System.out.println("Раааар");;
    }
}
