public class Skeleton extends Character {

    public Skeleton() {
        super("images/skeleton.png");
        setSkeletonPos();
        super.fullHP = 2 * level * super.d6;
        super.dp = level / 2 * super.d6;
        super.sp = level * super.d6 + level;
        level = 1;

    }

    public void setSkeletonPos() {
        super.posX = ((int) (Math.random() * 10));
        super.posY = ((int) (Math.random() * 11));
    }
}
