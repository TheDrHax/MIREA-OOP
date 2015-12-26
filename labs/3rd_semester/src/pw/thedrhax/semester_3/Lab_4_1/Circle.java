package pw.thedrhax.semester_3.Lab_4_1;

public class Circle {
    private double radius;
    private String color;

    public Circle (double radius, String color) {
        setRadius(radius);
        setColor(color);
    }
    public Circle (double radius) {this(radius, "red");}
    public Circle () {this(1.0);}

    public void setColor(String color) {this.color = color;}
    public void setRadius(double radius) {this.radius = radius;}

    public String getColor() {return color;}
    public double getRadius() {return radius;}
    public double getArea() {return Math.PI * Math.pow(getRadius(), 2);}

    @Override
    public String toString() {
        return getColor() + " circle with radius=" + getRadius() + " and area=" + getArea();
    }
}
