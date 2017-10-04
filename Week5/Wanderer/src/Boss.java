public class Boss extends Character {

    public Boss() {
        super("images/boss.png");
        setCharPos();
        super.fullHP = 2 * level * super.d6 + super.d6;
        super.dp = level / 2 * super.d6 + super.d6 / 2;
        super.sp = level * super.d6 + level;
        level = 1;
    }
}
