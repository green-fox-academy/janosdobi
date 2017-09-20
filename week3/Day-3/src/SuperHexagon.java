import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {

    public static void mainDraw(Graphics graphics){
      // reproduce this:
      // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/super-hexagon/r6.gif]

        int x1 = 25;
        int y1 = 60;
        int x2 = 45;
        int y2 = 60;
        int x3 = 54;
        int y3 = 76;
        int x4 = 45;
        int y4 = 92;
        int x5 = 25;
        int y5 = 92;
        int x6 = 16;
        int y6 = 76;
        for (int j = 0; j < 4; j++) {
            graphics.drawLine(x1, y1, x2, y2);
            graphics.drawLine(x2, y2, x3, y3);
            graphics.drawLine(x3, y3, x4, y4);
            graphics.drawLine(x4, y4, x5, y5);
            graphics.drawLine(x5, y5, x6, y6);
            graphics.drawLine(x1, y1, x6, y6);
            for (int i = 0; i < 3; i++) {
                x1 += 28;
                x2 += 28;
                x3 += 28;
                x4 += 28;
                x5 += 28;
                x6 += 28;
                y1 -= 16;
                y2 -= 16;
                y3 -= 16;
                y4 -= 16;
                y5 -= 16;
                y6 -= 16;
                graphics.drawLine(x1, y1, x2, y2);
                graphics.drawLine(x2, y2, x3, y3);
                graphics.drawLine(x3, y3, x4, y4);
                graphics.drawLine(x4, y4, x5, y5);
                graphics.drawLine(x5, y5, x6, y6);
                graphics.drawLine(x1, y1, x6, y6);
            }
            for (int i = 0; i < 3; i++) {
                x1 += 28;
                x2 += 28;
                x3 += 28;
                x4 += 28;
                x5 += 28;
                x6 += 28;
                y1 += 16;
                y2 += 16;
                y3 += 16;
                y4 += 16;
                y5 += 16;
                y6 += 16;
                graphics.drawLine(x1, y1, x2, y2);
                graphics.drawLine(x2, y2, x3, y3);
                graphics.drawLine(x3, y3, x4, y4);
                graphics.drawLine(x4, y4, x5, y5);
                graphics.drawLine(x5, y5, x6, y6);
                graphics.drawLine(x1, y1, x6, y6);
            }
            x1 -= 28 * 6;
            x2 -= 28 * 6;
            x3 -= 28 * 6;
            x4 -= 28 * 6;
            x5 -= 28 * 6;
            x6 -= 28 * 6;
            y1 += 32;
            y2 += 32;
            y3 += 32;
            y4 += 32;
            y5 += 32;
            y6 += 32;
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
