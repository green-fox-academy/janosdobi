public class Wall extends PositionedImage {

    public Wall(int posX, int posY) {
        super("images/wall.png", posX, posY);
    }

    @Override
    public String toString() {
        return "[" + posX + ", " + posY + "]";
    }
}