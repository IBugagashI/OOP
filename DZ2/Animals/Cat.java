package OOP.DZ2.Animals;

import OOP.DZ2.AnimalClasses.Pets;

public class Cat extends Pets{
    private String wool;// Наличие шерсти

    public Cat(String typeOFanimal, double height, double weight, String eyeColor, String nickName, String species, 
                String vaccinations, String coatColor, String birthday, String wool) {
        super(typeOFanimal, height, weight, eyeColor, nickName, species, vaccinations, coatColor, birthday);
        this.wool = wool;
    }

    public String Wool(){
        return wool;
    }

    @Override
    public String toString(){
        return super.toString() + String.format("\nНаличие шерсти: %s", wool);
    }

    @Override
    public void Petting() {
        System.out.println("\"Дозволяю любить меня\"\n");;
    }

    @Override
    public void Voice() {
        System.out.println("Мяу");;
    }
}
