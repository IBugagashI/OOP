package OOP.DZ2;

import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        
        System.out.println("-------------------------***ZOO***--------------------------");

        ZOO animals = new ZOO();
        Scanner input = new Scanner(System.in);
        showMenu(animals, input);
        input.close();

    }

    private static void showMenu(ZOO animals, Scanner input) {
        System.out.println("1. Просмотреть информацию о конкретном животном");
        System.out.println("2. Просмотреть информацию о всех животных в зоопарке");
        System.out.println("3. Заставить конкретное животное издать звук");
        System.out.println("4. Заставить все животные в зоопарке издать звук");
        System.out.println("5. Добавить животное в зоопарк");
        System.out.println("6. Удалить животное из зоопарка");
        System.out.println("7. Выйти");
        System.out.print("Выберите пункт меню: ");

        int choice = input.nextInt();
        switch (choice) {
            case 1:
                infoAnimal(animals, input);
                showMenu(animals, input);
            case 2:
                animals.showAll();
                showMenu(animals, input);
            case 3:
                sayAnimal(animals, input);
                showMenu(animals, input);
            case 4:
                animals.AllVoice();
                showMenu(animals, input);
            case 5:
                addAnimal(animals, input);
                showMenu(animals, input);
            case 6:
                removeAnimal(animals, input);
                showMenu(animals, input);
            case 7:
                break;
        }
    }

    private static void addAnimal(ZOO animals, Scanner input) {
        System.out.println("1. Добавить кота");
        System.out.println("2. Добавить тигра");
        System.out.println("3. Добавить собаку");
        System.out.println("4. Добавить волка");
        System.out.println("5. Добавить курицу");
        System.out.println("6. Добавить аиста");
        System.out.println("7. Назад");
        System.out.print("Выберите пункт меню: ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                animals.addCat(input);
                showMenu(animals, input);
            case 2:
                animals.addTiger(input);
                showMenu(animals, input);
            case 3:
                animals.addDog(input);
                showMenu(animals, input);
            case 4:
                animals.addWolf(input);
                showMenu(animals, input);
            case 5:
                animals.addChicken(input);
                showMenu(animals, input);
            case 6:
                animals.addStork(input);
                showMenu(animals, input);
            case 7:
                showMenu(animals, input);
        }

    }

    private static void removeAnimal(ZOO animal, Scanner input) {
        System.out.printf("В списке %s позиции.\n", animal.size());
        System.out.printf("Для возврата в МЕНЮ введите %d\n", animal.size());
        System.out.print("Введите цифру позиции для удаления (отсчет начинается с 0): ");
        int choice = input.nextInt();
        if (choice < ZOO.animal.size()) {
            animal.removeAnimal(choice);
            System.out.println("Вы успешно удалили животное!");
            showMenu(animal, input);
        } else
            showMenu(animal, input);
    }

    private static void infoAnimal(ZOO animal, Scanner input) {
        System.out.printf("В списке %s позиции.\n", animal.size());
        System.out.printf("Для возврата в МЕНЮ введите %d\n", animal.size());
        System.out.print("Введите цифру позиции для просмотра (отсчет начинается с 0): ");
        int choice = input.nextInt();
        if (choice < ZOO.animal.size()) {
            animal.showAnimal(choice);
            infoAnimal(animal, input);
        } else
            showMenu(animal, input);
    }

    private static void sayAnimal(ZOO animal, Scanner input) {
        System.out.printf("\nВ списке %s позиции.\n", animal.size());
        System.out.printf("Для возврата в МЕНЮ введите %d\n", animal.size());
        System.out.print("Введите цифру позиции для вызова (отсчет начинается с 0): ");
        int choice = input.nextInt();
        if (choice < ZOO.animal.size()) {
            animal.animalSay(choice);
            sayAnimal(animal, input);
        } else
            showMenu(animal, input);
    }
}