package pw.thedrhax.labs_3_sem.Task_1_1;

public class Main {

    public static void main(String[] args) {
        Ball ball = new Ball(1, 1);
        System.out.println(ball);

        ball.move(5, 5);
        System.out.println(ball);
    }
}
