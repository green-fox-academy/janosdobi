import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

    private int tilesX;
    private int tilesY;
    private int[][] wallPos;
    private int keysPressed;
    Hero hero;
    Wall wall;
    Floor floor;
    Boss boss;
    ListofSkeletons skeletons;
    JTextField stats;

    public Board() {
        // set the size of your draw board
        setPreferredSize(new Dimension(720, 850));
        setVisible(true);
        keysPressed = 0;
        tilesX = 10;
        tilesY = 11;
        wallPos = new int[][]{{3, 0}, {3, 1}, {3, 2}, {2, 2}, {1, 2}, {5, 0}, {5, 1}, {5, 2}, {5, 3}, {5, 4}, {7, 1}, {8, 1}, {7, 2}, {8, 2},
                {0, 4}, {1, 4}, {2, 4}, {3, 4}, {6, 4}, {7, 4}, {8, 4}, {1, 5}, {3, 5}, {8, 5}, {1, 6}, {3, 6}, {5, 6}, {6, 6}, {8, 6},
                {5, 7}, {6, 7}, {8, 7}, {1, 8}, {2, 8}, {3, 8}, {8, 8}, {3, 9}, {5, 9}, {6, 9}, {8, 9}, {1, 10}, {3, 10}, {5, 10}};

        hero = new Hero( 0, 0);

        boss = new Boss();
        while(isItaWall(boss.posX, boss.posY) || ((hero.posY == boss.posY) && (hero.posX == boss.posY))) {
            boss.setCharPos();
        }

        skeletons = new ListofSkeletons();
        for (int i = 0; i < 3; i++) {
            skeletons.add(new Skeleton());
            while(isItaWall(skeletons.get(i).posX, skeletons.get(i).posY) || (isItOccupied(skeletons.get(i).posX, skeletons.get(i).posY))) {
                skeletons.get(i).setCharPos();
            }
        }
        stats = new JTextField();
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

        //Draw boss
        boss.draw(graphics);

        //Draw skeletons
        for (int i = 0; i < skeletons.size(); i++) {
            skeletons.get(i).draw(graphics);
        }

        //Draw statBox
        graphics.setFont(new Font("TimesRoman", Font.PLAIN, 20));
        graphics.drawString("Hero (Level " + hero.level + ") HP: " + hero.actHP + "/" + hero.fullHP +
                " | DP: " + hero.dp + " | SP: " + hero.sp, 10, 820);
    }


    // To be a KeyListener the class needs to have these 3 methods in it
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    // Move hero

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            keysPressed++;
            if (hero.posY > 0 && !isItaWall(hero.posX, (hero.posY - 1))) {
                hero.moveChar(0);
                hero.setImage(0);
            } else {
                hero.setImage(0);
            }
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            keysPressed++;
            if (hero.posY < tilesY - 1 && !isItaWall(hero.posX, (hero.posY + 1))) {
                hero.moveChar(2);
                hero.setImage(2);
            } else {
                hero.setImage(2);
            }
        } else if(e.getKeyCode() == KeyEvent.VK_D) {
            keysPressed++;
            if (hero.posX < tilesX - 1 && !isItaWall((hero.posX + 1), hero.posY)) {
                hero.moveChar(1);
                hero.setImage(1);
            } else {
                hero.setImage(1);
            }
        } else if(e.getKeyCode() == KeyEvent.VK_A) {
            keysPressed++;
            if (hero.posX > 0 && !isItaWall((hero.posX - 1), hero.posY)) {
                hero.moveChar(3);
                hero.setImage(3);
            } else {
                hero.setImage(3);
            }
        }

        //Move enemies

        if (keysPressed % 2 == 0) {
            int tempBoss = (int) (Math.random() * 3);
            if (tempBoss == 0) {
                if (boss.posY > 0 && !isItaWall(boss.posX, (boss.posY - 1))) {
                    boss.moveChar(tempBoss);
                }
            }
            if (tempBoss == 1) {
                if (boss.posX < tilesX - 1 && !isItaWall((boss.posX + 1), boss.posY)) {
                    boss.moveChar(tempBoss);
                }
            }
            if (tempBoss == 2) {
                if (boss.posY < tilesY - 1 && !isItaWall(boss.posX, (boss.posY + 1))) {
                    boss.moveChar(tempBoss);
                }
            }

            if (tempBoss == 3) {
                if (boss.posX > 0 && !isItaWall((boss.posX - 1), boss.posY)) {
                    boss.moveChar(tempBoss);
                }
            }
        }
/*            for (int i = 0; i < skeletons.size(); i++) {
                int tempSkeletons = (int) (Math.random() * 3);
                skeletons.get(i).moveChar(tempSkeletons);
            }*/

        // and redraw to have a new picture with the new coordinates
        repaint();
    }

    public boolean isItaWall(int posX, int posY) {
        for (int i = 0; i < wallPos.length; i++) {
            if (wallPos[i][0] == posX && wallPos[i][1] == posY) {
                return true;
            }
        }
        return false;
    }

    public boolean isItOccupied(int posX, int posY) {
        if((posX == hero.posX && posY == hero.posY) || (posX == boss.posX && posY == boss.posY)) {
            return true;
        }
        return false;
    }
}