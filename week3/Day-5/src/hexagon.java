import com.sun.prism.shader.DrawRoundRect_Color_AlphaTest_Loader;

import javax.swing.*;

import java.awt.*;

import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class hexagon {

    public static void mainDraw(Graphics graphics){
        graphics.setColor(Color.black);

        hexagon(graphics, 5, 15,HEIGHT / 2, 190, (int) (Math.sqrt(3.0) * 190 / 2));
    }
    public static void hexagon(Graphics graphics,int n, int x1, int y1, int side, int triHeight) {

        graphics.setColor(Color.BLACK);
        graphics.drawLine(x1, y1, x1 + side / 2, y1 - triHeight);
        graphics.drawLine(x1 + side / 2, y1 - triHeight, x1 + side / 2 + side, y1 - triHeight);
        graphics.drawLine(x1 + side / 2 + side, y1 - triHeight, x1 + 2 * side, y1);
        graphics.drawLine(x1 + 2 * side, y1, x1 + side + side / 2, y1 + triHeight);
        graphics.drawLine(x1 + side + side / 2, y1 + triHeight, x1 + side /2, y1 + triHeight);
        graphics.drawLine(x1 + side /2, y1 + triHeight, x1, y1);
        if (n == 0) {
            return;
        } else {
            hexagon(graphics, n - 1, x1, y1, side / 3, triHeight / 3);
            hexagon(graphics, n - 1, x1 + 2 * side / 6, y1 - 2 * triHeight / 3, side / 3, triHeight / 3);
            hexagon(graphics, n - 1, x1 + side, y1 - 2 * triHeight / 3, side / 3, triHeight / 3);
            hexagon(graphics, n - 1, x1 + 4 * side / 3, y1, side / 3, triHeight / 3);
            hexagon(graphics, n - 1, x1 + 2 * side / 6, y1 + 2* triHeight / 3, side / 3, triHeight / 3);
            hexagon(graphics, n - 1, x1 + side, y1 + 2 * triHeight / 3, side / 3, triHeight / 3);
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
