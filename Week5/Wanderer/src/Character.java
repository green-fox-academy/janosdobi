public class Character extends PositionedImage {

    protected int fullHP;
    protected int actHP;
    protected int dp;
    protected int sp;
    protected int d6;
    protected int level;

    public Character() {
        d6 = (int) (1 + Math.random() * 6);
    }

    public Character(String filename) {
        super(filename);
        d6 = (int) (1 + Math.random() * 6);
    }

    public void strike(Character another) {
        if (another.dp < (sp + 2 * d6)) {
            another.actHP -= (sp + 2 * d6 - another.dp);
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
}