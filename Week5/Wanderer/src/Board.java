import javax.swing.*;
        import java.awt.*;
        import java.awt.event.KeyEvent;
        import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

    int posX;
    int posY;
    int wallPosX;
    int wallPosY;
    int heroPosY;
    int heroPosX;


    public Board() {
        heroPosY = 0;
        heroPosX = 0;

        // set the size of your draw board
        setPreferredSize(new Dimension(720, 792));
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        // Drawing floor
        posX = 0;
        posY = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 10; j++) {
                PositionedImage image = new PositionedImage("images/floor.png", posX, posY);
                image.draw(graphics);
                posX += 72;
            }
            posX = 0;
            posY += 72;
        }
        //Drawing walls
        wallPosX = 3 * 72;
        wallPosY = 0;
        for (int i = 0; i < 2; i++) {
            PositionedImage image = new PositionedImage("images/wall.png", wallPosX, wallPosY);
            image.draw(graphics);
            wallPosY += 72;
        }
        for (int i = 0; i < 3; i++) {
            PositionedImage image = new PositionedImage("images/wall.png", wallPosX, wallPosY);
            image.draw(graphics);
            wallPosX -= 72;
        }
        wallPosY = 0;
        wallPosX = 5 * 72;
        for (int i = 0; i < 4; i++) {
            PositionedImage image = new PositionedImage("images/wall.png", wallPosX, wallPosY);
            image.draw(graphics);
            wallPosY += 72;
        }
        for (int i = 0; i < 3; i++) {
            PositionedImage image = new PositionedImage("images/wall.png", wallPosX, wallPosY);
            image.draw(graphics);
            wallPosX += 72;
        }
        for (int i = 0; i < 6; i++) {
            PositionedImage image = new PositionedImage("images/wall.png", wallPosX, wallPosY);
            image.draw(graphics);
            wallPosY += 72;
        }

        wallPosY = 4 * 72;
        wallPosX = 0;
        for (int i = 0; i < 3; i++) {
            PositionedImage image = new PositionedImage("images/wall.png", wallPosX, wallPosY);
            image.draw(graphics);
            wallPosX += 72;
        }
        for (int i = 0; i < 3; i++) {
            PositionedImage image = new PositionedImage("images/wall.png", wallPosX, wallPosY);
            image.draw(graphics);
            wallPosY += 72;
        }
        wallPosY = 5 * 72;
        wallPosX = 72;
        for (int i = 0; i < 2; i++) {
            PositionedImage image = new PositionedImage("images/wall.png", wallPosX, wallPosY);
            image.draw(graphics);
            wallPosY += 72;
        }

        wallPosY = 8 * 72;
        wallPosX = 72;
        for (int i = 0; i < 2; i++) {
            PositionedImage image = new PositionedImage("images/wall.png", wallPosX, wallPosY);
            image.draw(graphics);
            wallPosX += 72;
        }
        for (int i = 0; i < 3; i++) {
            PositionedImage image = new PositionedImage("images/wall.png", wallPosX, wallPosY);
            image.draw(graphics);
            wallPosY += 72;
        }

        wallPosY = 10 * 72;
        wallPosX = 5 * 72;
        for (int i = 0; i < 1; i++) {
            PositionedImage image = new PositionedImage("images/wall.png", wallPosX, wallPosY);
            image.draw(graphics);
            wallPosY -= 72;
        }
        for (int i = 0; i < 2; i++) {
            PositionedImage image = new PositionedImage("images/wall.png", wallPosX, wallPosY);
            image.draw(graphics);
            wallPosX += 72;
        }
        drawSquareWall(graphics, 7 * 72, 72, 2);
        drawSquareWall(graphics, 5 * 72, 6 * 72, 2);
        drawSquareWall(graphics, 72, 10 * 72, 1);

        //draw hero
        PositionedImage hero = new PositionedImage("images/hero-down.png", heroPosX, heroPosY);
        hero.draw(graphics);

    }

        public void drawSquareWall(Graphics g, int wallPosX, int wallPosY, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                PositionedImage image = new PositionedImage("images/wall.png", wallPosX, wallPosY);
                image.draw(g);
                wallPosX += 72;
            }
            wallPosX -= 2 * 72;
            wallPosY += 72;
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
            heroPosY -= 72;
        } else if(e.getKeyCode() == KeyEvent.VK_S) {
            heroPosY += 72;
        } else if(e.getKeyCode() == KeyEvent.VK_D) {
            heroPosX += 72;
        } else if(e.getKeyCode() == KeyEvent.VK_A) {
            heroPosX -= 72;
        }
        // and redraw to have a new picture with the new coordinates
        repaint();
    }
}