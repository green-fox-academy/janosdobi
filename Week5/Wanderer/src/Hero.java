import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Hero extends Character {

    private int direction;


    public Hero(int posX, int posY) {
        super();
        super.posX = posX * 72;
        super.posY = posY * 72;
        direction = 2;
        setImage(direction);
        super.fullHP = 20 + 3 * super.d6;
        super.dp = 2 * super.d6;
        super.sp = 5 + super.d6;
        super.actHP = super.fullHP;
        super.level = 1;
    }

    public void setImage(int direction) {
        try {
            if (direction == 2) {
                super.image = ImageIO.read(new File("images/hero-down.png"));
            } else if (direction == 0) {
                super.image = ImageIO.read(new File("images/hero-up.png"));
            } else if (direction == 1) {
                super.image = ImageIO.read(new File("images/hero-right.png"));
            } else if (direction == 3){
                super.image = ImageIO.read(new File("images/hero-left.png"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
