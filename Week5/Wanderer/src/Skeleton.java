public class Skeleton extends Character {

    protected boolean keyHolder;


    public Skeleton() {
        super("images/skeleton.png");
        setCharPos();
        super.fullHP = 2 * Main.level * super.d6;
        super.actHP = fullHP;
        super.dp = Main.level / 2 * super.d6;
        super.sp = Main.level * super.d6 + Main.level;
    }
}
