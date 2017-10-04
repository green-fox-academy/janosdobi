public class Character extends PositionedImage {

    protected int fullHP;
    protected int actHP;
    protected int dp;
    protected int sp;
    protected int d6;

    public Character() {
        d6 = (int) (1 + Math.random() * 6);
    }

}
