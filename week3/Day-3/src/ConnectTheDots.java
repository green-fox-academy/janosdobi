import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {

    public static void mainDraw(Graphics graphics){
      // create a function that takes 1 parameter:
      // an array of {x, y} points
      // and connects them with green lines.
      // connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
      // connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
      // {120, 100}, {85, 130}, {50, 100}}
        int[][] points = {{10, 10}, {290,  10}, {290, 290}, {10, 290}};
        conDot(graphics, points);
    }

    public static void conDot(Graphics graphics, int[][] points) {

        int x1 = points[0][0];
        int y1 = points[0][1];
        int x2 = points[1][0];
        int y2 = points[1][1];
        int x3 = points[2][0];
        int y3 = points[2][1];
        int x4 = points[3][0];
        int y4 = points[3][1];

        graphics.setColor(Color.GREEN);
        graphics.drawLine(x1, y1, x2, y2);

        graphics.setColor(Color.GREEN);
        graphics.drawLine(x2, y2, x3, y3);

        graphics.setColor(Color.GREEN);
        graphics.drawLine(x3, y3, x4, y4);

        graphics.setColor(Color.GREEN);
        graphics.drawLine(x1, y1, x4, y4);

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


// create a 300x300 canvas.
