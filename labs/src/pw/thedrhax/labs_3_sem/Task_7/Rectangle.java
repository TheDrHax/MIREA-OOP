package pw.thedrhax.labs_3_sem.Task_7;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        setWidth(width);
        setLength(length);
    }

    public Rectangle(double width, double length) {
        super();
        setWidth(width);
        setLength(length);
    }

    public Rectangle() {
        this(1, 1);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    public String toString() {
        return "Rectangle with width=" + width +
                ", length=" + length +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter();
    }
}
