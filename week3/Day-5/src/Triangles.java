import com.sun.prism.shader.DrawRoundRect_Color_AlphaTest_Loader;

import javax.swing.*;

import java.awt.*;

import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {

    public static void mainDraw(Graphics graphics){
        graphics.setColor(Color.black);

        triangle(graphics, 6, 5,5, WIDTH - 10, (int) (Math.sqrt(3.0) * (WIDTH - 10) / 2));
    }
   public static void triangle(Graphics graphics,int n, int x1, int y1, int side, int triHeight) {

        graphics.setColor(Color.BLACK);
        graphics.drawLine(x1, y1, x1 + side, y1);
        graphics.drawLine(x1 + side, y1, x1 + side / 2, y1 + triHeight);
        graphics.drawLine(x1 + side / 2, y1 + triHeight, x1, y1);
        if (n == 0) {
            return;
        } else {
            triangle(graphics, n - 1, x1, y1, side / 2, triHeight / 2);
            triangle(graphics, n - 1, x1 + side / 2, y1, side / 2, triHeight / 2);
            triangle(graphics, n - 1, x1 + side / 4, y1 + triHeight / 2, side / 2, triHeight / 2);
        }
    }

    //    Don't touch the code below
    static int WIDTH = 400;
    static int HEIGHT = 350;

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
