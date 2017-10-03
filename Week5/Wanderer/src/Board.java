import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

    private int tilesX;
    private int tilesY;
    private int[][] wallPos;
    Hero hero;
    Wall wall;
    Floor floor;

    public Board() {
        // set the size of your draw board
        setPreferredSize(new Dimension(720, 792));
        setVisible(true);
        tilesX = 10;
        tilesY = 11;
        wallPos = new int[][]{{3, 0}, {3, 1}, {3, 2}, {2, 2}, {1, 2}, {5, 0}, {5, 1}, {5, 2}, {5, 3}, {5, 4}, {7, 1}, {8, 1}, {7, 2}, {8, 2},
                {0, 4}, {1, 4}, {2, 4}, {3, 4}, {6, 4}, {7, 4}, {8, 4}, {1, 5}, {3, 5}, {8, 5}, {1, 6}, {3, 6}, {5, 6}, {6, 6}, {8, 6},
                {5, 7}, {6, 7}, {8, 7}, {1, 8}, {2, 8}, {3, 8}, {8, 8}, {3, 9}, {5, 9}, {6, 9}, {8, 9}, {1, 10}, {3, 10}, {5, 10}};
        hero = new Hero( 0, 0);
    }

    public boolean isItaWall(int PosX, int PosY) {
        for (int i = 0; i < wallPos.length; i++) {
            if (wallPos[i][0] == PosX && wallPos[i][1] == PosY) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);

        //Drawing floor
        for (int i = 0; i < tilesX; i++) {
            for (int j = 0; j < tilesY; j++) {
                floor = new Floor (i, j);
                floor.draw(graphics);
            }
        }

        //Drawing walls
        for (int i = 0; i < wallPos.length; i++) {
            wall = new Wall(wallPos[i][0], wallPos[i][1]);
            wall.draw(graphics);
        }

        //Draw hero
        hero.draw(graphics);
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
        if (e.getKeyCode() == KeyEvent.VK_W && hero.posY > 0) {
            if (hero.posY > 0 && isItaWall(hero.posX, (hero.posY - 1))) {
                hero.posY--;
                hero.setImage("up");
            } else {
                hero.setImage("up");
            }
        } else if(e.getKeyCode() == KeyEvent.VK_S) {
            if (hero.posY < tilesY - 1 && isItaWall(hero.posX, (hero.posY + 1))) {
                hero.posY++;
                hero.setImage("down");
            } else {
                hero.setImage("down");
            }
        } else if(e.getKeyCode() == KeyEvent.VK_D) {
            if (hero.posX < tilesX - 1 && isItaWall((hero.posX + 1), hero.posY)) {
                hero.posX++;
                hero.setImage("right");
            } else {
                hero.setImage("right");
            }
        } else if(e.getKeyCode() == KeyEvent.VK_A) {
            if (hero.posX > 0 && isItaWall((hero.posX - 1), hero.posY)) {
                hero.posX--;
                hero.setImage("left");
            } else {
                hero.setImage("left");
            }
        }
        // and redraw to have a new picture with the new coordinates
        repaint();
    }
}