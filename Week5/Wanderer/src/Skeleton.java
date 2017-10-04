public class Skeleton extends PositionedImage {

    public Skeleton() {
        super("images/skeleton.png");
        setSkeletonPos();
    }

    public void setSkeletonPos() {
        super.posX = ((int) (Math.random() * 10));
        super.posY = ((int) (Math.random() * 11));
    }
}
