package pw.thedrhax.labs_3_sem.Task_7;

public class Square extends Rectangle {
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    public Square(double side) {
        super(side, side);
    }
    public Square() {
        this(1);
    }

    public double getSide() {return width;}
    public void setSide(double side) {width = side; length = side;}

    public void setWidth(double side) {setSide(side);}
    public void setLength(double side) {setSide(side);}

    public String toString() {
        return "Square with side=" + getSide() +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter();
    }
}
