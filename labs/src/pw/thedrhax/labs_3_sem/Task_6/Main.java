package pw.thedrhax.labs_3_sem.Task_6;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static boolean beats (int first, int second) {
        return first > second && first != 9 && second != 0 || first == 0 && second == 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> first = new LinkedList<>();
        LinkedList<Integer> second = new LinkedList<>();

        for (int i = 0; i < 5; i++)
            first.addLast(sc.nextInt());
        for (int i = 0; i < 5; i++)
            second.addLast(sc.nextInt());

        int count = 0;
        while (!first.isEmpty() && !second.isEmpty()) {
            if (beats(first.get(0), second.get(0))) {
                second.addLast(first.get(0));
                second.addLast(second.get(0));
                first.remove(0);
                second.remove(0);
            } else {
                first.addLast(first.get(0));
                first.addLast(second.get(0));
                first.remove(0);
                second.remove(0);
            }

            if (count++ == 105) {
                System.out.println("botva");
                return;
            }
        }

        System.out.println((first.isEmpty() ? "first" : "second") + " " + count);
    }

}
