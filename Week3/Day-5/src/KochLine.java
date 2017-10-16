import com.sun.prism.shader.DrawRoundRect_Color_AlphaTest_Loader;

import javax.swing.*;

import java.awt.*;

import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class KochLine {

    public static void mainDraw(Graphics graphics){
        graphics.setColor(Color.black);

        kochLine(graphics, 5, 25, 120);
    }
    public static void kochLine(Graphics graphics,int n, int x1, int y1) {
        int line = 10;
        int height = (int) (Math.sqrt(3) * 10 / 2);
        graphics.setColor(Color.BLACK);
        graphics.drawLine(x1, y1, x1 + line, y1);
        graphics.drawLine(x1 + line, y1, x1 + line + line / 2, y1 - height);
        graphics.drawLine(x1 + line + line / 2, y1 - height,x1 + 2 * line, y1);
        graphics.drawLine(x1 + 2 * line, y1, x1 + 3 * line, y1);




        if (n == 0) {
            return;
        } else {
            kochLine(graphics, n - 1, x1 + 3 * line, y1);
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
