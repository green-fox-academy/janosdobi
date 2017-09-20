import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
      // draw four different size and color rectangles.

        graphics.setColor(Color.RED);
        graphics.fillRect(50, 50, 100, 100);

        graphics.setColor(Color.GREEN);
        graphics.fillRect(50, 0, 90, 40);

        graphics.setColor(Color.PINK);
        graphics.fillRect(150, 50, 200, 17);

        graphics.setColor(Color.LIGHT_GRAY);
        graphics.fillRect(10, 100, 10, 10);

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
