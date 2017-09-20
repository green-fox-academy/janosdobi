import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {

    public static void mainDraw(Graphics graphics){
      // reproduce this:
      // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/envelope-star/r2.png]

        int x1 = WIDTH / 2;
        int y1 = 0;
        int x2 = WIDTH / 2;
        int y2 = HEIGHT / 2;
        for (int i = 0; i < HEIGHT / 2 /10; i++) {
            graphics.setColor(Color.GREEN);
            graphics.drawLine(x1, y1, x2, y2);
            y1 += 10;
            x2 -= 10;
        }

        x1 = WIDTH / 2;
        y1 = 0;
        x2 = WIDTH / 2;
        y2 = HEIGHT / 2;
        for (int i = 0; i < HEIGHT / 2 /10; i++) {
            graphics.setColor(Color.GREEN);
            graphics.drawLine(x1, y1, x2, y2);
            y1 += 10;
            x2 += 10;
        }

        x1 = WIDTH / 2;
        y1 = HEIGHT;
        x2 = WIDTH / 2;
        y2 = HEIGHT / 2;
        for (int i = 0; i < HEIGHT / 2 /10; i++) {
            graphics.setColor(Color.GREEN);
            graphics.drawLine(x1, y1, x2, y2);
            y1 -= 10;
            x2 -= 10;
        }

        x1 = WIDTH / 2;
        y1 = HEIGHT;
        x2 = WIDTH / 2;
        y2 = HEIGHT / 2;
        for (int i = 0; i < HEIGHT / 2 /10; i++) {
            graphics.setColor(Color.GREEN);
            graphics.drawLine(x1, y1, x2, y2);
            y1 -= 10;
            x2 += 10;
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
