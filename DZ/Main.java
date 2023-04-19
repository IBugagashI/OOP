package OOP.DZ;

import java.util.Scanner;

import OOP.DZ.SuccessorClasses.*;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("***Продукция на складе***\n-----------------------------@------------------------------");
        
        Products milk = new Milk("Молоко \"Грустный молочник\"", 60, 6, "Литр", "3 дня", 3.222);
        Products limonade = new Lemonade("Напиток \"Буратиборг\"", 50, 6, "Литр", 1.5);
        Products bread = new Bread("Хлеб \"Бородинский\"", 30, 10, "Граммы", "36 часов", "Второй сорт");
        Products eggs = new Eggs("Яйцо диетическое \"Не золотой петушок\"", 70, 10, "Штука", "7 дней", 10);
        Products masks = new Masks("Маска медицинская \"Чумной доктор\"", 100, 10, "Штука", 50);
        Products toiletPaper = new ToiletPaper("Туалетная бумага \"Услада\"(с запахом лайма)", 20, 50, "Штука", 6, 3);
        Products diapers = new Diapers("Подгузники \"Детская неожиданность\"", 500, 20, "Шутка", 1, "Да", "XXXL", 3, 100, "Многоразовые");
        Products nipple = new Nipple("Пустышка \"Mute\"", 120, 33, "Штука", 0, "Да");

        Products[] roster = new Products[] {milk, limonade, bread, eggs, masks, toiletPaper, diapers, nipple};
        
        System.out.print("Для вывода всех позиции введи 0, для единичной 1: ");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();//!= 1 ? Program.PrintAll(roster) : Program.PrintOne(roster);

        if(choice < 1){Program.PrintAll(roster);}
        else{Program.PrintOne(roster);}

        sc.close();
    }
}