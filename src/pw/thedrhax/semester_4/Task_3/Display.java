package pw.thedrhax.semester_4.Task_3;

import javax.swing.*;
import java.awt.*;

public class Display extends JFrame {

    private class DisplayPanel extends JComponent {

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            int dy = Math.max(getHeight() / mask.length, 1);
            int dx = Math.max(getWidth() / mask[0].length, 1);
            for (int row = 0; row < mask.length; row++) {
                for (int col = 0; col < mask[row].length; col++) {
                    g.setColor(mask[row][col] ? Color.yellow : Color.black);
                    g.fillRect(col * dx, row * dy, dx, dy);
                }
            }
        }
    }

    private boolean[][] mask = new boolean[1][1];
    private DisplayPanel panel = new DisplayPanel();

    public Display() {
        super("Life");
        panel.setPreferredSize(new Dimension(800, 600));
        add(panel, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void setMask(final boolean[][] m) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                mask = m;
                panel.repaint();
            }
        });
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            // ignore
        }
    }
}