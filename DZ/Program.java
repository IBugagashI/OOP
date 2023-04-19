package OOP.DZ;

import java.util.Scanner;

public class Program {

    public static void PrintAll(Products[] roster){
        
        for(Products i: roster){
            System.out.println(i);
            System.out.println("-----------------------------@------------------------------");
        }
    }
    
    public static void PrintOne(Products[] roster){
        System.out.print("Укажите позицию продукта: ");
        Scanner sc = new Scanner(System.in);
        int words = sc.nextInt();
        while(words < 0 || words > roster.length){
            System.out.printf("Нет такой позиции. Укажи от 0 до %d\nУкажите позицию продукта: ", roster.length);
            words = sc.nextInt();
        }
        System.out.println(roster[words]);
        sc.close();
    }
}