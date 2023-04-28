package OOP.DZ2;

import java.util.ArrayList;
import java.util.Scanner;
import OOP.DZ2.AnimalClasses.Commands.*;

import OOP.DZ2.Animals.*;

public class ZOO {
    String typeOFanimal;//Тип животного
    double height;//Рост животного
    double weight;//Вес животного
    String eyeColor;//Цвет глаз
    String nickName;//Кличка
    String species;//Порода
    String vaccination;//Прививки
    String coatColor;//Цвет шерсти
    String birthday;//День рождения
    String training;//Дресировка
    int flying;//Высота полёта
    String habitat;//Место обитания
    String dataOfLocation;//Дата обнаружения

    static ArrayList<Animal> animal = new ArrayList<>();
    {
    animal.add(new Dog("Собака", 1.5, 20, "Карие", "Шарик","Двортеръер", "Да", "Чёрно-белый", "01.01.2020", "Нет"));
    animal.add(new Cat("Кошка", 0.3, 3, "Зелёные", "Барсик","Дворовая", "Да", "Серо-буро-покарябанный", "01.01.0000", "Да"));
    animal.add(new Wolf("Волк", 2, 30, "Серые", "Дремучий лес", "15.08.2015", "Да"));
    animal.add(new Tiger("Тигр", 2, 50, "Желтые", "Лимпопо", "22.02.2008"));
    animal.add(new Chicken("Курица", 0.3, 0.5, "Еде в глаза не смотрят", 0));
    animal.add(new Stork("Аист", 1.1, 5, "Неизвестно", 10));
    }

    public int size(){
        return animal.size();
    }

    public void addDog(Scanner input){

        System.out.print("Тип животного: ");
        typeOFanimal = input.next();
        System.out.print("Рост животного: ");
        height = input.nextDouble();
        System.out.print("Вес животного: ");
        weight = input.nextDouble();
        System.out.print("Цвет глаз: ");
        eyeColor = input.next();
        System.out.print("Кличка: ");
        nickName = input.next();
        System.out.print("Порода: ");
        species = input.next();
        System.out.print("Прививки: ");
        vaccination = input.next();
        System.out.print("Цвет шерсти: ");
        coatColor = input.next();
        System.out.print("Дата рождения: ");
        birthday = input.next();
        System.out.print("Наличие дресировки: ");
        training = input.next();

        animal.add(new Dog(typeOFanimal, height, weight, eyeColor, nickName, species, vaccination, coatColor, birthday, training));
    }

    public void addCat(Scanner input){
        String wool;//Наличие шерсти

        System.out.print("Тип животного: ");
        typeOFanimal = input.next();
        System.out.print("Рост животного: ");
        height = input.nextDouble();
        System.out.print("Вес животного: ");
        weight = input.nextDouble();
        System.out.print("Цвет глаз: ");
        eyeColor = input.next();
        System.out.print("Кличка: ");
        nickName = input.next();
        System.out.print("Порода: ");
        species = input.next();
        System.out.print("Прививки: ");
        vaccination = input.next();
        System.out.print("Цвет шерсти: ");
        coatColor = input.next();
        System.out.print("Дата рождения: ");
        birthday = input.next();
        System.out.print("Наличие дресировки: ");
        wool = input.next();

        animal.add(new Cat(typeOFanimal, height, weight, eyeColor, nickName, species, vaccination, coatColor, birthday, wool));
    }

    public void addWolf(Scanner input){
        String leader;//Вожак стаи

        System.out.print("Тип животного: ");
        typeOFanimal = input.next();
        System.out.print("Рост животного: ");
        height = input.nextDouble();
        System.out.print("Вес животного: ");
        weight = input.nextDouble();
        System.out.print("Цвет глаз: ");
        eyeColor = input.next();
        System.out.print("Место обитания: ");
        habitat = input.next();
        System.out.print("Дата нахождения: ");
        dataOfLocation = input.next();
        System.out.print("Вожак стаи: ");
        leader = input.next();

        animal.add(new Wolf(typeOFanimal, height, weight, eyeColor, habitat, dataOfLocation, leader));
    }

    public void addTiger(Scanner input){

        System.out.print("Тип животного: ");
        typeOFanimal = input.next();
        System.out.print("Рост животного: ");
        height = input.nextDouble();
        System.out.print("Вес животного: ");
        weight = input.nextDouble();
        System.out.print("Цвет глаз: ");
        eyeColor = input.next();
        System.out.print("Место обитания: ");
        habitat = input.next();
        System.out.print("Дата нахождения: ");
        dataOfLocation = input.next();

        animal.add(new Tiger(typeOFanimal, height, weight, eyeColor, habitat, dataOfLocation));
    }

    public void addChicken(Scanner input){

        System.out.print("Тип животного: ");
        typeOFanimal = input.next();
        System.out.print("Рост животного: ");
        height = input.nextDouble();
        System.out.print("Вес животного: ");
        weight = input.nextDouble();
        System.out.print("Цвет глаз: ");
        eyeColor = input.next();
        System.out.print("Высота полета: ");
        flying = input.nextInt();

        animal.add(new Chicken(typeOFanimal, height, weight, eyeColor, flying));
    }

    public void addStork(Scanner input){

        System.out.print("Тип животного: ");
        typeOFanimal = input.next();
        System.out.print("Рост животного: ");
        height = input.nextDouble();
        System.out.print("Вес животного: ");
        weight = input.nextDouble();
        System.out.print("Цвет глаз: ");
        eyeColor = input.next();
        System.out.print("Высота полета: ");
        flying = input.nextInt();

        animal.add(new Stork(typeOFanimal, height, weight, eyeColor, flying));
    }

    void showAll(){
        int index = 0;
        for (Animal animal : animal) {
            System.out.printf("Позиция в списке %d\n", index);
            System.out.println(animal);
            System.out.println("-----------------------------@------------------------------");
            index++;
        }
    }

    void removeAnimal(int num){
        animal.remove(num);
    }

   
    void showAnimal(int num){
       System.out.println(animal.get(num));
       if (animal.get(num) instanceof Petting){
        ((Petting)animal.get(num)).petting();
       }
       if (animal.get(num) instanceof ComBird){
        ((ComBird)animal.get(num)).Up();
       }
       if (animal.get(num) instanceof ComDog){
        ((ComDog)animal.get(num)).Training();
       }
    }

    void animalSay(int num) {
        animal.get(num).Voice();
    }

    void AllVoice(){
        for (Animal animal : animal) {
            animal.Voice();
        }
    }
}