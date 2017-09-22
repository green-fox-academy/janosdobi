import com.sun.prism.shader.DrawRoundRect_Color_AlphaTest_Loader;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class fractal2 {

    public static void mainDraw(Graphics graphics){
        graphics.setColor(Color.black);
        graphics.drawRect(0, 0, 400, 400);

        fractal2(graphics, 4, WIDTH / 4, WIDTH / 4, WIDTH/2);
    }
    public static void fractal2(Graphics graphics, int n, int x, int y, int size) {

        graphics.setColor(Color.BLACK);
        for (int i = 0; i < n; i++) {
            graphics.drawRect(x - i, y - i, size , size);
            graphics.drawRect(x + i, y + i, size , size);
            graphics.drawRect(x - i, y + i, size , size);
            graphics.drawRect(x + i, y - i, size , size);
        }

        if (n == 0) {
            return;
        } else {

            fractal2(graphics, n - 1, x - size / 4, y - size / 4, size / 2);
            fractal2(graphics, n - 1, x + 3 * size / 4, y - size / 4, size / 2);
            fractal2(graphics, n - 1, x - size / 4, y + 3 * size / 4, size / 2);
            fractal2(graphics, n - 1, x +  3 *size / 4, y + 3 * size / 4, size / 2);

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
