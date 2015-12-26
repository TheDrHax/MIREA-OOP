package pw.thedrhax.semester_3.Lab_8;

public class MovableCircle implements Movable {
    protected int radius;
    protected MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public String toString() {return "Circle (" + center.x + ", " + center.y + ") with radius=" + radius;}

    @Override
    public void moveUp() {center.moveUp();}
    @Override
    public void moveDown() {center.moveDown();}
    @Override
    public void moveRight() {center.moveRight();}
    @Override
    public void moveLeft() {center.moveLeft();}
}
