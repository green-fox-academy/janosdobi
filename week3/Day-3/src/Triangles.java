import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {

    public static void mainDraw(Graphics graphics){
      // reproduce this:
      // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/triangles/r5.png]

        int x1 = WIDTH / 2;
        int y1 = 0;
        int x2 = WIDTH / 2 - 12;
        int y2 = 21;
        int x3 = WIDTH / 2 + 12;
        int y3 = 21;
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < i; j++) {
                graphics.drawLine(x1, y1, x2, y2);
                graphics.drawLine(x1, y1, x3, y3);
                graphics.drawLine(x2, y2, x3, y3);
                x1 += 24;
                x2 += 24;
                x3 += 24;
            }
            graphics.drawLine(x1, y1, x2, y2);
            graphics.drawLine(x1, y1, x3, y3);
            graphics.drawLine(x2, y2, x3, y3);
            x1 = x1 - 12 - 24 * i;
            y1 += 21;
            x2 = x2 - 12 - 24 * i;
            y2 += 21;
            x3 = x3 - 12 - 24 * i;
            y3 += 21;
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