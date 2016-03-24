package pw.thedrhax.semester_4.Task_3;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Display d = new Display();
        boolean[][] mask = new boolean[200][200];
        boolean[][] new_mask;

        Random r = new Random();

        for (int x = 0; x < mask.length; x++) {
            for (int y = 0; y < mask[x].length; y++) {
                mask[x][y] = r.nextBoolean();
            }
        }

        // Main loop
        while (true) {
            d.setMask(mask);

            new_mask = new boolean[200][200];

            for (int x = 0; x < mask.length; x++) {
                for (int y = 0; y < mask[x].length; y++) {
                    // Neighbours
                    int sum = 0;
                    for (int i = x-1; i <= x+1; i++) {
                        for (int j = y-1; j <= y+1; j++) {
                            if (i < 0 || i >= mask.length ||
                                j < 0 || j >= mask[i].length)
                                continue;

                            if (mask[i][j]) sum++;
                        }
                    }

                    if (mask[x][y]) {
                        sum--;

                        // Kill the cell
                        new_mask[x][y] = (sum == 2 || sum == 3);
                    } else {
                        // Create the cell
                        new_mask[x][y] = (sum == 3);
                    }
                }
            }

            mask = new_mask;
        }
    }
}
