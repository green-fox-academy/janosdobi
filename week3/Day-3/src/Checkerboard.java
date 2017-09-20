import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {

    public static void mainDraw(Graphics graphics){
      // fill the canvas with a checkerboard pattern.

        int x = 0;
        int y = 0;
        int size = 20;
        for (int i = 0; i < (HEIGHT / size); i++) {
            if (i % 2 == 1){
                x = 20;
            } else x = 0;
            for (int j = 0; j < (WIDTH / size / 2); j++) {
                graphics.setColor(Color.BLACK);
                graphics.fillRect(x, y, size, size);
                x += size * 2;
            }
            y += size;
        }
    }

//    Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}
