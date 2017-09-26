package aircraft.carrier;

public class F35 extends Aircraft {

    public F35 () {
        type = "F35";
        maxAmmo = 12;
        baseDamage = 50;
    }

    public F35(String type) {
        super.type = type;
        maxAmmo = 12;
        baseDamage = 50;
    }

}
