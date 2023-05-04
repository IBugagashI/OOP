package OOP.DZ3.Shape;

import OOP.DZ3.Trait.Polygon;

public class Rectangle extends Polygon{
    public Rectangle(double length, double weigth){
        super(new double[] {length, weigth, length, weigth});
    }

    public double FindArea(){
        return this.getSides()[0]*this.getSides()[1];
    }
    @Override
    public String toString() {
        return String.format("Длина: %s, Ширина: %s", this.getSides()[0], this.getSides()[1]);
    }    
}