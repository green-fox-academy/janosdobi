import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {

    public static void mainDraw(Graphics graphics){
      // reproduce this:
      // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/line-play/r1.png]

        int x1 = 0;
        int y1 = 0;
        int x2 = WIDTH;
        int y2 = 20;
        for (int i = 0; i < (HEIGHT / 20); i++) {
            graphics.setColor(Color.MAGENTA);
            graphics.drawLine(x1, y1, x2, y2);
            y2 += 20;
            x1 += 20;
        }
        x1 = WIDTH;
        y1 = HEIGHT;
        x2 = 0;
        y2 = HEIGHT - 20;
        for (int i = 0; i < (WIDTH / 20); i++) {
            graphics.setColor(Color.GREEN);
            graphics.drawLine(x1, y1, x2, y2);
            y2 -= 20;
            x1 -= 20;
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
