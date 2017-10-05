import java.awt.*;

public class Character extends PositionedImage {

    protected int fullHP;
    protected int actHP;
    protected int dp;
    protected int sp;
    protected int d6;
    protected boolean alive;
    private String name;
    protected int level;
    private boolean keyHolder;

    public Character() {
        d6 = (int) (1 + Math.random() * 6);
        alive = true;
    }

    public Character(String filename) {
        super(filename);
        d6 = (int) (1 + Math.random() * 6);
        alive = true;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void drawStats(Graphics graphics, int posX, int posY) {
        graphics.setFont(new Font("TimesRoman", Font.PLAIN, 18));
        graphics.drawString(name + " (Level " + Wanderer.LEVEL + ") HP: " + actHP + "/" + fullHP +
                " | DP: " + dp + " | SP: " + sp, posX, posY);
    }

    public void strike(Character another) {
        if (another.dp < (this.sp + 2 * this.d6)) {
            another.actHP -= (this.sp + 2 * d6 - another.dp);
        }
    }

    public void setCharPos() {
        super.posX = ((int) (Math.random() * 10));
        super.posY = ((int) (Math.random() * 11));
    }

    public void moveChar(int direction) {
        if (direction == 0) {
            super.posY--;
        } else if (direction == 2) {
            super.posY++;
        } else if (direction == 1) {
            super.posX++;
        } else {
            super.posX--;
        }
    }

    public void die() {
        this.alive = false;
        this.image = null;
    }
}