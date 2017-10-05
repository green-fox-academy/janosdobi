import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

    Map map;
    Wall wall;
    Floor floor;
    Hero hero;
    ListOfEnemies enemies;
    private int keysPressed;

    public Board() {
        // set the size of your draw board
        setPreferredSize(new Dimension(720, 870));
        setVisible(true);
        map = new Map(Wanderer.LEVEL);
        hero = new Hero(Wanderer.LEVEL);
        enemies = new ListOfEnemies();
        enemies.add(new Boss(Wanderer.LEVEL));
        while (map.isItaWall(enemies.get(0).posX, enemies.get(0).posY) || ((hero.posY == enemies.get(0).posY) && (hero.posX == enemies.get(0).posY))) {
            enemies.get(0).setCharPos();
        }
        for (int i = 0; i < 3; i++) {
            enemies.add(new Skeleton(Wanderer.LEVEL));
        }
        for (int i = 1; i < enemies.size(); i++) {
            enemies.get(i).setName((i == 1) ? "Skeleton " + i + ", the Keyholder!" : "Skeleton " + i);
            while (map.isItaWall(enemies.get(i).posX, enemies.get(i).posY) || (isBoss(enemies.get(i).posX, enemies.get(i).posY)) || isHero(enemies.get(i).posX, enemies.get(i).posY)) {
                enemies.get(i).setCharPos();
            }
        }
        keysPressed = 0;
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);

        //Drawing floor
        for (int i = 0; i < map.tilesX; i++) {
            for (int j = 0; j < map.tilesY; j++) {
                floor = new Floor(i, j);
                floor.draw(graphics);
            }
        }

        //Drawing walls
        for (int i = 0; i < map.walls.length; i++) {
            wall = new Wall(map.walls[i][0], map.walls[i][1]);
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
        for (int i = 0; i < enemies.size(); i++) {
            if (enemies.get(i).posY == hero.posY && enemies.get(i).posX == hero.posX && enemies.get(i).alive) {
                enemies.get(i).drawStats(graphics, 10, 840);
            }
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
            if (hero.posY > 0 && !map.isItaWall(hero.posX, (hero.posY - 1))) {
                hero.moveChar(0);
            } else {
                hero.setImage(0);
            }
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            keysPressed++;
            if (hero.posY < map.tilesY - 1 && !map.isItaWall(hero.posX, (hero.posY + 1))) {
                hero.moveChar(2);
            } else {
                hero.setImage(2);
            }
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            keysPressed++;
            if (hero.posX < map.tilesX - 1 && !map.isItaWall((hero.posX + 1), hero.posY)) {
                hero.moveChar(1);
            } else {
                hero.setImage(1);
            }
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            keysPressed++;
            if (hero.posX > 0 && !map.isItaWall((hero.posX - 1), hero.posY)) {
                hero.moveChar(3);
            } else {
                hero.setImage(3);
            }
        }

        //Battle

        for (int i = 0; i < enemies.size(); i++) {
            if (hero.posX == enemies.get(i).posX && hero.posY == enemies.get(i).posY && enemies.get(i).alive && e.getKeyCode() == KeyEvent.VK_SPACE) {
                battle(enemies.get(i));
            }
        }

        //Next level

        if (!enemies.get(0).alive && !enemies.get(1).alive) {
            nextLevel();
        }

        //Move enemies
        if (keysPressed % 2 == 0) {
            for (int i = 0; i < enemies.size(); i++) {
                int temp = (int) (Math.random() * 3);
                if (temp == 0) {
                    if (enemies.get(i).posY > 0 && !map.isItaWall(enemies.get(i).posX, (enemies.get(i).posY - 1))) {
                        enemies.get(i).moveChar(temp);
                    }
                }
                if (temp == 1) {
                    if (enemies.get(i).posX < map.tilesX - 1 && !map.isItaWall((enemies.get(i).posX + 1), enemies.get(i).posY)) {
                        enemies.get(i).moveChar(temp);
                    }
                }
                if (temp == 2) {
                    if (enemies.get(i).posY < map.tilesY - 1 && !map.isItaWall(enemies.get(i).posX, (enemies.get(i).posY + 1))) {
                        enemies.get(i).moveChar(temp);
                    }
                }
                if (temp == 3) {
                    if (enemies.get(i).posX > 0 && !map.isItaWall((enemies.get(i).posX - 1), enemies.get(i).posY)) {
                        enemies.get(i).moveChar(temp);
                    }
                }
            }
        }
        // and redraw to have a new picture with the new coordinates
        repaint();
    }

    public boolean isHero(int posX, int posY) {
        if (posX == hero.posX && posY == hero.posY) {
            return true;
        }
        return false;
    }

    public boolean isBoss(int posX, int posY) {
        if (posX == enemies.get(0).posX && posY == enemies.get(0).posY) {
            return true;
        }
        return false;
    }

    public void battle(Character character) {
        hero.strike(character);
        character.strike(hero);
        if (hero.actHP <= 0) {
            hero.die();
        } else if (character.actHP <= 0) {
            character.die();
        }

    }
    public void nextLevel () {
        Wanderer.LEVEL++;
        enemies = new ListOfEnemies();
        enemies.add(new Boss(Wanderer.LEVEL));
        while (map.isItaWall(enemies.get(0).posX, enemies.get(0).posY) || ((hero.posY == enemies.get(0).posY) && (hero.posX == enemies.get(0).posY))) {
            enemies.get(0).setCharPos();
        }
        for (int i = 0; i < Wanderer.LEVEL + 2; i++) {
            enemies.add(new Skeleton(Wanderer.LEVEL));
        }
        for (int i = 1; i < enemies.size(); i++) {
            enemies.get(i).setName((i == 1) ? "Skeleton " + i + ", the Keyholder!" : "Skeleton " + i);
            while (map.isItaWall(enemies.get(i).posX, enemies.get(i).posY) || (isBoss(enemies.get(i).posX, enemies.get(i).posY)) || isHero(enemies.get(i).posX, enemies.get(i).posY)) {
                enemies.get(i).setCharPos();
            }
        }
    }
}