import com.sun.prism.shader.DrawRoundRect_Color_AlphaTest_Loader;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class fractal1 {

    public static void mainDraw(Graphics graphics){
        graphics.setColor(Color.black);
        graphics.drawRect(0, 0, 600, 600);
        graphics.fillRect(200, 200, 200, 200);

        fractal1(graphics, 5, 0, 0, WIDTH);
    }
    public static void fractal1(Graphics graphics, int n, int x, int y, int size) {

        graphics.setColor(Color.BLACK);
        graphics.fillRect(x + size / 3, y + size / 3, size / 3, size / 3);
        if (n == 0) {
            return;
        } else {

            fractal1(graphics, n - 1, x, y, size / 3);
            fractal1(graphics, n - 1, x + size / 3, y, size / 3);
            fractal1(graphics, n - 1, x + 2 * size / 3, y, size / 3);
            fractal1(graphics, n - 1, x, y + size / 3, size / 3);
            fractal1(graphics, n - 1, x + 2 * size / 3, y + size / 3, size / 3);
            fractal1(graphics, n - 1, x, y + 2 * size / 3, size / 3);
            fractal1(graphics, n - 1, x + size / 3, y + 2 * size / 3, size / 3);
            fractal1(graphics, n - 1, x + 2 * size / 3, y + 2 * size / 3, size / 3);
        }
    }

    //    Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 600;

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
