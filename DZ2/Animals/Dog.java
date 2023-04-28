package OOP.DZ2.Animals;

import OOP.DZ2.AnimalClasses.Pets;
import OOP.DZ2.AnimalClasses.Commands.ComDog;

public class Dog extends Pets implements ComDog{
    private String training;// Наличие дрессировки
    
    public Dog(String typeOFanimal, double height, double weight, String eyeColor, String nickName, String species, 
                    String vaccinations, String coatColor, String birthday, String training){
        super(typeOFanimal, height, weight, eyeColor, nickName, species, vaccinations, coatColor, birthday);
        this.training = training;
    }

    @Override
    public String toString(){
        return super.toString() + String.format("\nПёс дрессирован: %s", training);
    }

    @Override
    public void Voice(){
        System.out.println("Гав");
    }

    @Override
    public void petting(){
        System.out.println("\"Проявляет ласку\"");
    }

    public void Training(){
        System.out.println("\"Дрессируем\"");
    }
}