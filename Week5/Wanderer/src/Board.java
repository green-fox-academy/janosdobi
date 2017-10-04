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
    ListOfEnemies enemies;
    protected int level;
    protected boolean levelUp;

    public Board(int level) {
        // set the size of your draw board
        setPreferredSize(new Dimension(720, 870));
        setVisible(true);
        keysPressed = 0;
        this.level = level;
        tilesX = 10;
        tilesY = 11;
        wallPos = new int[][]{{3, 0}, {3, 1}, {3, 2}, {2, 2}, {1, 2}, {5, 0}, {5, 1}, {5, 2}, {5, 3}, {5, 4}, {7, 1}, {8, 1}, {7, 2}, {8, 2},
                {0, 4}, {1, 4}, {2, 4}, {3, 4}, {6, 4}, {7, 4}, {8, 4}, {1, 5}, {3, 5}, {8, 5}, {1, 6}, {3, 6}, {5, 6}, {6, 6}, {8, 6},
                {5, 7}, {6, 7}, {8, 7}, {1, 8}, {2, 8}, {3, 8}, {8, 8}, {3, 9}, {5, 9}, {6, 9}, {8, 9}, {1, 10}, {3, 10}, {5, 10}};

        hero = new Hero( 0, 0);

        enemies = new ListOfEnemies();
        enemies.add(new Boss());
        while(isItaWall(enemies.get(0).posX, enemies.get(0).posY) || ((hero.posY == enemies.get(0).posY) && (hero.posX == enemies.get(0).posY))) {
            enemies.get(0).setCharPos();
        }
        for (int i = 0; i < 3; i++) {
            enemies.add(new Skeleton());
        }
        for (int i = 1; i < enemies.size(); i++) {
            enemies.get(i).setName((i == 1) ? "Skeleton " + i + ", the Keyholder!" : "Skeleton " + i);
            while(isItaWall(enemies.get(i).posX, enemies.get(i).posY) || (isItOccupied(enemies.get(i).posX, enemies.get(i).posY))) {
                enemies.get(i).setCharPos();
            }
        }
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

        //Draw enemies
        for (int i = 0; i < enemies.size(); i++) {
            enemies.get(i).draw(graphics);
        }

        //Draw statBox
        hero.drawStats(graphics, 10, 820);

        //Battle
        for (int i = 0; i < enemies.size(); i++) {
            if (hero.posX == enemies.get(i).posX && hero.posY == enemies.get(i).posY) {
                enemies.get(i).drawStats(graphics, 10, 840);
                battle(enemies.get(i));
            }
        }

        if (!enemies.get(0).alive) {
            levelUp = true;
        }

    }

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
            for (int i = 0; i < enemies.size(); i++) {
                int temp = (int) (Math.random() * 3);
                if (temp == 0) {
                    if (enemies.get(i).posY > 0 && !isItaWall(enemies.get(i).posX, (enemies.get(i).posY - 1))) {
                        enemies.get(i).moveChar(temp);
                    }
                }
                if (temp == 1) {
                    if (enemies.get(i).posX < tilesX - 1 && !isItaWall((enemies.get(i).posX + 1), enemies.get(i).posY)) {
                        enemies.get(i).moveChar(temp);
                    }
                }
                if (temp == 2) {
                    if (enemies.get(i).posY < tilesY - 1 && !isItaWall(enemies.get(i).posX, (enemies.get(i).posY + 1))) {
                        enemies.get(i).moveChar(temp);
                    }
                }
                if (temp == 3) {
                    if (enemies.get(i).posX > 0 && !isItaWall((enemies.get(i).posX - 1), enemies.get(i).posY)) {
                        enemies.get(i).moveChar(temp);
                    }
                }
            }
        }
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
        if((posX == hero.posX && posY == hero.posY) || (posX == enemies.get(0).posX && posY == enemies.get(0).posY)) {
            return true;
        }
        return false;
    }

    public void battle(Character character) {
        while (character.actHP > 0 && hero.actHP > 0) {
            hero.strike(character);
            character.strike(hero);
        }
        if (character.actHP <= 0) {
            character.die();
        } else if (hero.actHP <= 0) {
            hero.die();
        }
    }
}