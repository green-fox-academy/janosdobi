import com.sun.prism.shader.DrawRoundRect_Color_AlphaTest_Loader;

import javax.swing.*;

import java.awt.*;

import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class circles {

    public static void mainDraw(Graphics graphics){
        graphics.setColor(Color.black);
        graphics.drawOval(0, 0, 400, 400);

        oval(graphics, 3, 0,0, WIDTH);
    }
    public static void oval(Graphics graphics, int n, int x, int y, int size) {

        graphics.setColor(Color.BLACK);
        graphics.drawOval(x + size / 4, y, size / 2, size / 2);
        graphics.drawOval(x + size / 54, y + size / 3, size / 2, size / 2);
        graphics.drawOval(x + (size / 2) - (size / 54), y + size / 3, size / 2, size / 2);
        if (n == 0) {
            return;
        } else {
            oval(graphics, n - 1, x + size / 4, y, size / 2);
            oval(graphics, n - 1, x + size / 54, y + size / 3, size / 2);
            oval(graphics, n - 1, x + (size / 2) - (size / 54), y + size / 3, size / 2);
        }
    }

    //    Don't touch the code below
    static int WIDTH = 400;
    static int HEIGHT = 400;

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
