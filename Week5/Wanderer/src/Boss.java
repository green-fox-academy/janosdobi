public class Boss extends Character {

    public Boss() {
        super("images/boss.png");
        setCharPos();
        super.fullHP = 2 * Main.level * super.d6 + super.d6;
        super.actHP = fullHP;
        super.dp = Main.level / 2 * super.d6 + super.d6 / 2;
        super.sp = Main.level * super.d6 + Main.level;
        super.setName("Dr. Evil");
    }
}
