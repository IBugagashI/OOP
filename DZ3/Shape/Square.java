package OOP.DZ3.Shape;

public class Square extends Rectangle{
    public Square(double side){
        super(side, side);
    }
    
    @Override
    public String toString() {
        return String.format("Сторона: %s, ", this.getSides()[0]);
    }
}