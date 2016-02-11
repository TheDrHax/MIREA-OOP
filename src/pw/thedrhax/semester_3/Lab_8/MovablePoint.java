package pw.thedrhax.semester_3.Lab_8;

public class MovablePoint implements Movable {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint (int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {return "Point (" + x + ", " + y + ")";}

    @Override
    public void moveUp() {y++;}
    @Override
    public void moveDown() {y--;}
    @Override
    public void moveRight() {x++;}
    @Override
    public void moveLeft() {x--;}
}
