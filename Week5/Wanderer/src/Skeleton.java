public class Skeleton extends Character {

    public Skeleton(int level) {
        super("images/skeleton.png");
        setCharPos();
        super.level = level;
        super.fullHP = 2 * super.level * super.d6;
        super.actHP = fullHP;
        super.dp = super.level / 2 * super.d6;
        super.sp = super.level * super.d6 + super.level;
    }
}
