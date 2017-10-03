import javax.swing.*;
        import java.awt.*;
        import java.awt.event.KeyEvent;
        import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Arrays;

public class Board extends JComponent implements KeyListener {

    int posX;
    int posY;
    int [] [] board;
    int [] [] wallPos;
    Hero hero = new Hero();

    public Board() {
        // set the size of your draw board
        setPreferredSize(new Dimension(720, 792));
        setVisible(true);
        board = new int[11] [10];
        wallPos = new int[][] {{3, 0}, {3, 1}, {3, 2}, {2, 2}, {1, 2}, {5, 0}, {5, 1}, {5, 2}, {5, 3}, {5, 4}, {7, 1}, {8, 1}, {7, 2}, {8, 2},
                {0, 4}, {1, 4}, {2, 4}, {3, 4}, {6, 4}, {7, 4}, {8, 4}, {1, 5}, {3, 5}, {8, 5}, {1, 6}, {3, 6}, {5, 6}, {6, 6}, {8, 6},
                {5, 7}, {6, 7}, {8, 7}, {1, 8}, {2, 8}, {3, 8}, {8, 8}, {3, 9}, {5, 9}, {6, 9}, {8, 9}, {1, 10}, {3, 10}, {5, 10}};
    }

    public void drawWall(Graphics g, int wallPosX, int wallPosY) {
        PositionedImage image = new PositionedImage("images/wall.png", wallPosX, wallPosY);
        image.draw(g);
    }

    public void drawFloor(Graphics g, int floorPosX, int floorPosY) {
        PositionedImage image = new PositionedImage("images/floor.png", floorPosX, floorPosY);
        image.draw(g);
        image.isItaWall = true;
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);

        // Drawing floor

        for (int i = 0; i < board[i].length; i++) {
            for (int j = 0; j < board.length; j++) {
                drawFloor(graphics, i, j);
            }
        }

        //Drawing walls

        for (int i = 0; i < wallPos.length; i++) {
            drawWall(graphics, wallPos[i][0], wallPos[i][1]);
        }


        //draw hero

        if (hero.direction == "down") {
            PositionedImage drawHeroDown = new PositionedImage("images/hero-down.png", hero.charPosX, hero.charPosY);
            drawHeroDown.draw(graphics);
        } else if (hero.direction == "up") {
            PositionedImage drawHeroUp = new PositionedImage("images/hero-up.png", hero.charPosX, hero.charPosY);
            drawHeroUp.draw(graphics);
        } else if (hero.direction == "right") {
            PositionedImage drawHeroRight = new PositionedImage("images/hero-right.png", hero.charPosX, hero.charPosY);
            drawHeroRight.draw(graphics);
        } else {
            PositionedImage drawHeroLeft = new PositionedImage("images/hero-left.png", hero.charPosX, hero.charPosY);
            drawHeroLeft.draw(graphics);
        }
    }


    // To be a KeyListener the class needs to have these 3 methods in it
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    // But actually we can use just this one for our goals here
    @Override
    public void keyReleased(KeyEvent e) {
        // When the up or down keys hit, we change the position of our box
        if (e.getKeyCode() == KeyEvent.VK_W) {
            hero.charPosY--;
            hero.direction = "up";
        } else if(e.getKeyCode() == KeyEvent.VK_S) {
            hero.charPosY++;
            hero.direction = "down";
        } else if(e.getKeyCode() == KeyEvent.VK_D) {
            hero.charPosX++;
            hero.direction = "right";
        } else if(e.getKeyCode() == KeyEvent.VK_A) {
            hero.charPosX--;
            hero.direction = "left";
        }
        // and redraw to have a new picture with the new coordinates
        repaint();
    }
}