import com.sun.prism.shader.DrawRoundRect_Color_AlphaTest_Loader;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class excercise12 {

    public static void mainDraw(Graphics graphics){

        graphics.setColor(Color.black);
        int xpoints[] = {90, 270, 360, 270, 90, 0};
        int ypoints[] = {0, 0, 160, 310, 310, 160};
        int npoints = 6;
        graphics.drawPolygon(xpoints, ypoints, npoints);
        hexaDrawer(graphics, 5, xpoints, ypoints);
    }
    public static void hexaDrawer(Graphics graphics, int n, int[] x, int[] y) {

        int xpoints[] = {90, 180, 230, 180, 90, 45};
        int ypoints[] = {0, 0, 78, 160, 160, 78};
        int npoints = 6;
        graphics.drawPolygon(xpoints, ypoints, npoints);
        for (int i = 0; i < 6; i++) {
            ypoints[i] += 160;
        }
        graphics.drawPolygon(xpoints, ypoints, npoints);
        for (int i = 0; i < 6; i++) {
            ypoints[i] -= 78;
            xpoints[i] += 135;
        }
        graphics.drawPolygon(xpoints, ypoints, npoints);
        if (n == 0) {
            return;
        }
        hexaDrawer();

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