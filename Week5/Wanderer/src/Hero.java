import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Hero extends Character {

    private String direction;


    public Hero(int posX, int posY) {
        super();
        super.posX = posX * 72;
        super.posY = posY * 72;
        direction = "down";
        setImage(direction);
        super.fullHP = 20 + 3 * super.d6;
        super.dp = 2 * super.d6;
        super.sp = 5 + super.d6;
        super.actHP = super.fullHP;
        super.level = 1;
    }

    public void setImage(String direction) {
        try {
            if (direction == "down") {
                super.image = ImageIO.read(new File("images/hero-down.png"));
            } else if (direction == "up") {
                super.image = ImageIO.read(new File("images/hero-up.png"));
            } else if (direction == "right") {
                super.image = ImageIO.read(new File("images/hero-right.png"));
            } else if (direction == "left"){
                super.image = ImageIO.read(new File("images/hero-left.png"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
