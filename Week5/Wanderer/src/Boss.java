public class Boss extends Character {

    public Boss() {
        super("images/boss.png");
        setBossPos();
        super.fullHP = 2 * level * super.d6 + super.d6;
        super.dp = level / 2 * super.d6 + super.d6 / 2;
        super.sp = level * super.d6 + level;
        level = 1;
    }

    public void setBossPos() {
        super.posX = ((int) (Math.random() * 10));
        super.posY = ((int) (Math.random() * 11));
    }
}
