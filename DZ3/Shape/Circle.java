package OOP.DZ3.Shape;

import OOP.DZ3.Trait.Figure;
import OOP.DZ3.Trait.Circumference;

public class Circle extends Figure implements Circumference{
    private double radius;
    
    public Circle(double radius){
        this.radius = radius;
        if (this.radius <= 0) throw new IllegalArgumentException("Радиус не может быть отрицательным!");
    }

    @Override
    public double FindArea() {
        return Math.PI*Math.pow(this.radius, 2);
    }

    public double FindLength(){
        return 2*Math.PI*this.radius;
    }
    @Override
    public String toString() {
        return String.format("Радиус: %s", this.radius);
    }
}
