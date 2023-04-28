package OOP.DZ2.AnimalClasses;

import OOP.DZ2.Animal;
import OOP.DZ2.AnimalClasses.Commands.Petting;

public abstract class Pets extends Animal implements Petting{ // Домашнее животное
    private String nickName; // Кличка
    private String species; // Порода
    private String vaccinations; // Прививки
    private String coatColor; // Цвет шерсти
    private String birthday; // Дата рождения

    public Pets(String typeOFanimal, double height, double weight, String eyeColor, String nickName, String species, String vaccinations, String coatColor, String birthday){
        super(typeOFanimal, height, weight, eyeColor);
        this.nickName = nickName;
        this.species = species;
        this.vaccinations = vaccinations;
        this.coatColor = coatColor;
        this.birthday = birthday;
    }

    @Override
    public String toString(){
        return super.toString() + String.format("\nКличка: %s\nПорода: %s\nПрививки: %s\nЦвет шерсти: %s\nДата рождения: %s", 
        nickName, species, vaccinations, coatColor, birthday);
    }

}
