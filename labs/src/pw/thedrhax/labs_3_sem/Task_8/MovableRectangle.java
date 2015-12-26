package pw.thedrhax.labs_3_sem.Task_8;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle (int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "Rectangle (" + topLeft.x + ", " + topLeft.y + ", " +
                bottomRight.x + ", " + bottomRight.y + ")";
    }

    @Override
    public void moveUp() {topLeft.moveUp(); bottomRight.moveUp();}
    @Override
    public void moveDown() {topLeft.moveDown(); bottomRight.moveDown();}
    @Override
    public void moveRight() {topLeft.moveRight(); bottomRight.moveRight();}
    @Override
    public void moveLeft() {topLeft.moveLeft(); bottomRight.moveLeft();}
}
