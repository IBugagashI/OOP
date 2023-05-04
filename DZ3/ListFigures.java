package OOP.DZ3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import OOP.DZ3.Shape.*;
import OOP.DZ3.Trait.Figure;
import OOP.DZ3.Trait.Circumference;
import OOP.DZ3.Trait.Perimetr;

public class ListFigures {
    public  ArrayList<Figure> allFigure = new ArrayList<>();
    {
        allFigure.add(new Square(3));
        allFigure.add(new Rectangle(2, 4));
        allFigure.add(new Triangle(6, 4, 4));
        allFigure.add(new Circle(4));
    }

    public int FindSize(){
        return allFigure.size();
    }

    public void showAll(){
        int count = 1;
        for(Figure figure: allFigure){
            System.out.printf("%d. %s: , %s ", count, figure.getClass().getSimpleName(), figure.toString());
            if (figure instanceof Perimetr){
                System.out.printf("Периметр: %.1f, ", ((Perimetr)figure).FindPerimetr());
            }
            if (figure instanceof Circumference){
                System.out.printf("Длина: %.1f, ", ((Circumference)figure).FindLength());
            }
            System.out.printf("Площадь: %.1f \n", figure.FindArea()); 
            System.out.println("-------------------------***@***--------------------------");
            count++;
        }
    }

    public Figure addSquare(Scanner sc){
        System.out.print("Введите сторону квадрата: ");
        double side = sc.nextDouble();
        return new Square(side);
    }
    public Figure addCircle(Scanner sc){
        System.out.print("Введите радиус: ");
        double radius = sc.nextDouble();
        return (new Circle(radius));
    }
    public Figure addRectangle(Scanner sc){
        System.out.print("Введите длину прямоугольника: ");
        double length = sc.nextDouble();
        System.out.print("Введите вес прямоугольника: ");
        double weigth = sc.nextDouble();
        return (new Rectangle(length, weigth));
    }
    public Figure addTriangle(Scanner sc){
        System.out.print("Введите первую сторону треугольника: ");
        double sideA = sc.nextDouble();
        System.out.print("Введите вторую сторону треугольника: ");
        double sideB = sc.nextDouble();
        System.out.print("Введите третью сторону треугольника: ");
        double sideC = sc.nextDouble();
        return (new Triangle(sideA, sideB, sideC));
    }
    public void addFigure(Scanner sc){
        System.out.print("1. Добавить квадрат\n2. Добавить прямоугольник\n3. Добавить треугольник\n4. Добавить круг\nВыбери действие: ");
        int num = sc.nextInt();
        switch(num){
            case 1:
                this.allFigure.add(addSquare(sc));
                break;
            case 2:
                this.allFigure.add(addRectangle(sc));
                break;
            case 3:
                this.allFigure.add(addTriangle(sc));
                break;
            case 4:
                this.allFigure.add(addCircle(sc));
                break;
        }
    }
    public void removeFigure(int num){
        allFigure.remove(num);
    }

    public void changeFigure(int num, Scanner sc){
        if (num < this.allFigure.size()) {
            System.out.print("1. Добавить квадрат\n2. Добавить прямоугольник\n3. Добавить треугольник\n4. Добавить круг\nВыбери номер фигуры для изменения: ");
            int numberFigure = sc.nextInt();
            Figure newFigure = new Circle(1);
            switch(numberFigure){
                case 1:
                    newFigure = addSquare(sc);
                    break;
                case 2: 
                    newFigure = addRectangle(sc);
                    break;
                case 3: 
                    newFigure = addTriangle(sc);
                    break;
                case 4: 
                    newFigure = addCircle(sc);
                    break;
            }
            this.allFigure.set(num, newFigure);
        }
    }
    public void sortOfArea(){
        Comparator<Figure> byArea = Comparator.comparing(Figure::FindArea);
        this.allFigure.sort(byArea);
    }
    
}
