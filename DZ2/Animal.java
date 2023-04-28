package OOP.DZ2;

public abstract class Animal {

    private String typeOFanimal; // тип животного
    private double height; //Рост
    private double weight; //Вес
    private String eyeColor; //Цвет глаз

    protected Animal(String typeOFanimal, double height, double weight, String eyeColor){
        this.typeOFanimal = typeOFanimal;
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
    }

    public double Height(){return height;}
    public double Weight(){return weight;}
    public String EyeCollor(){return eyeColor;}

    @Override
    public String toString(){
        return String.format("Тип животного: %s\nРост животного: %s\nВес животного: %s\nЦвет глаз: %s", typeOFanimal, height, weight, eyeColor);
    }   

    public abstract void Voice();// Подать голос
}