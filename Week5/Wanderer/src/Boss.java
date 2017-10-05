public class Boss extends Character {

    public Boss(int level) {
        super("images/boss.png");
        setCharPos();
        super.level = level;
        super.fullHP = 2 * super.level * super.d6 + super.d6;
        super.actHP = fullHP;
        super.dp = super.level / 2 * super.d6 + super.d6 / 2;
        super.sp = super.level * super.d6 + super.level;
        super.setName("Dr. Evil");
    }
}
