package OOP.DZ4;

import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayClass<Integer> intMas = new ArrayClass<>();

        boolean cheaker = true;
            while(cheaker){
            System.out.println("-------------------------***@***--------------------------");
            System.out.print("1. Показать массив\n"
                            +"2. Заполнить массив\n"
                            +"3. Добавить один элемент в массив\n"
                            +"4. Удаление элемента по индексу\n"
                            +"5. Удаление всех элементов с заданным значением\n"
                            +"6. Поиск минимума\n"
                            +"7. Поиск максимума\n"
                            +"8. Поиск произведения элементов массива\n"
                            +"9. Поиск индекса указанного элемента\n"
                            +"10. Проверить наличие в массиве\n"
                            +"11. Сортировка пузырьком\n"
                            +"12. Завершить работу\n"
                            +"Выбери действие: ");    
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    intMas.PrintArray();
                    break;
                case 2:
                    System.out.print("Введите размер списка: ");
                    int size = sc.nextInt();
                    Random dot = new Random();
                    for(int i = 0; i < size; i++){
                        int x = dot.nextInt(100);
                        intMas.add(x);
                    }
                    break;
                case 3:
                    System.out.print("Введите значение: ");
                    intMas.add(sc.nextInt());
                    break;
                case 4:
                    intMas.DeletByIndex(sc.nextInt()); // Удаление элемента по индексу
                    intMas.PrintArray();
                    break;
                case 5:
                    intMas.DeletData(sc.nextInt()); // Удаление всех элементов с заданным значением
                    intMas.PrintArray();
                    break;   
                case 6:
                    System.out.println(intMas.FindMinData()); // Поиск минимума
                    break;
                case 7:
                    System.out.println(intMas.FindMaxData()); // Поиск максимума
                    break;
                case 8:
                    System.out.println(intMas.FindMultData()); // Поиск произведения элементов массива
                    break;
                case 9:
                    System.out.print("Введите значение элемента: ");
                    System.out.printf("Индекс элемента: %d\n", intMas.FindIndex(sc.nextInt()));
                    break;
                case 10:
                    System.out.print("Введите значение элемента: ");
                    System.out.println(intMas.FindData(sc.nextInt()));
                    break;
                case 11:
                    try {
                        intMas.BubbleSort();
                        System.out.print("Отсортированный массив => "); 
                        intMas.PrintArray();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 12:
                    sc.close();
                    cheaker = false;
                    break;
            }   

        }

        ArrayClass<String> stringMas = new ArrayClass<>();
        stringMas.add("Самолёт");
        stringMas.add("Машина");
        stringMas.add("Мотоцикл");
        stringMas.add("Лесапед");
        stringMas.PrintArray();
        stringMas.DeletByIndex(3);
        stringMas.PrintArray();
    }
}
