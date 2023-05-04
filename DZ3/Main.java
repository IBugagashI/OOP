package OOP.DZ3;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        ListFigures allFigure = new ListFigures();
        Scanner sc = new Scanner(System.in);
        ShowMenu(allFigure, sc);
        sc.close();
        }        

        private static void ShowMenu(ListFigures allFigure, Scanner sc){
            boolean cheaker = true;
            while(cheaker){
            System.out.print("1. Показать информацию о фигурах\n2. Удаление фигуры\n3. Сортировка по площади\n4. Добавить фигуру\n5. Изменение фигуры по индексу\n6. Выход\nВыбери действие: ");    
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    allFigure.showAll();
                    break;
                case 2:
                    System.out.print("Введите позицию для удаления: ");
                    allFigure.removeFigure(sc.nextInt());
                    break;
                case 3:
                    allFigure.sortOfArea();
                    break;
                case 4:
                    allFigure.addFigure(sc);
                    break;   
                case 5:
                    System.out.print("Введите позицию для изменения: ");
                    allFigure.changeFigure(sc.nextInt(), sc);
                    break;
                case 6:
                    cheaker = false;
                    break;
            }   
        }
    }    
}