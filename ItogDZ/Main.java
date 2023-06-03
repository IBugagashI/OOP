package OOP.ItogDZ;

import java.util.Scanner;
import OOP.ItogDZ.presenter.Arena;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----Арена-----");

        Arena heroes = new Arena();
        Scanner input = new Scanner(System.in);
        showMenu(heroes, input);
        input.close();
    }
    
    private static void showMenu(Arena heroes, Scanner input) {
        System.out.println("1. Просмотреть информацию о всех героях");
        System.out.println("2. Начать бой");
        System.out.println("0. Стоп");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                heroes.showAll();
                showMenu(heroes, input);
            case 2:
                System.out.println("Укажите позиции бойцов");
                heroes.Fight(input.nextInt() -1, input.nextInt() -1);
                showMenu(heroes, input);
            case 0:
                break;
        }
    }
}