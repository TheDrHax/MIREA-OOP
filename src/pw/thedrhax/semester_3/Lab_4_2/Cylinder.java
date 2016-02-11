package pw.thedrhax.semester_3.Lab_4_2;

import pw.thedrhax.semester_3.Lab_4_1.Circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder (double radius, double height) {
        super(radius);
        this.height = height;
    }
    public Cylinder (double radius) {this(radius, 1);}
    public Cylinder () {this(1, 1);}

    public void setHeight(double height) {this.height = height;}

    public double getHeight() {return height;}
    public double getVolume() {return getArea() * getHeight();}

    @Override
    public String toString() {
        return "cylinder with base=(" + super.toString() + "), height=" + getHeight() + " and volume=" + getVolume();
    }
}
