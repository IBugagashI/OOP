package OOP.DZ2.AnimalClasses;

import OOP.DZ2.Animal;

public abstract class Wild extends Animal{ // Дикие звери

    private String habitat; // Место обитания
    private String dateOfLocation; // Дата нахождения (?) - не понятно, что значит. Возможно дату когда животное обнаружили впервые

    public Wild(String typeOFanimal, double height, double weight, String eyeColor, String habitat, String dateOfLocation){
        super(typeOFanimal, height, weight, eyeColor);
        this.habitat = habitat;
        this.dateOfLocation = dateOfLocation;
    }
    
    @Override
    public String toString(){
        return super.toString() + String.format("\nМесто обитания: %s\nДата нахождения: %s", habitat, dateOfLocation);
    }

    public abstract void Voice();// Подать голос
}

