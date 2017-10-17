import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Hero extends Character implements Moveable {

    private int direction;


    public Hero(int level) {
        super();
        super.posX = 0;
        super.posY = 0;
        direction = 2;
        setImage(direction);
        super.level = level - 1;
        super.fullHP = 20 + 3 * super.d6 + level * super.d6;
        super.dp = 2 * super.d6 + level * super.d6;
        super.sp = 5 + super.d6 + level * super.d6;
        super.actHP = super.fullHP;
        super.setName("Jozsi a kiraly");
        super.level = level - 1;
    }

    public void setImage(int direction) {
        try {
            if (direction == 2 && alive) {
                super.image = ImageIO.read(new File("images/hero-down.png"));
            } else if (direction == 0 && alive) {
                super.image = ImageIO.read(new File("images/hero-up.png"));
            } else if (direction == 1 && alive) {
                super.image = ImageIO.read(new File("images/hero-right.png"));
            } else if (direction == 3 && alive) {
                super.image = ImageIO.read(new File("images/hero-left.png"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void moveChar(int direction) {
        if (direction == 0) {
            super.posY--;
            setImage(0);
        } else if (direction == 2) {
            super.posY++;
            setImage(2);
        } else if (direction == 1) {
            super.posX++;
            setImage(1);
        } else {
            super.posX--;
            setImage(3);
        }
    }
}
