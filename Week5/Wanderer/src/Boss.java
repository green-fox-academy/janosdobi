public class Boss extends PositionedImage {

    public Boss() {
        super("images/boss.png");
        setBossPos();
    }

    public void setBossPos() {
        super.posX = ((int) (Math.random() * 10));
        super.posY = ((int) (Math.random() * 11));
    }

}
