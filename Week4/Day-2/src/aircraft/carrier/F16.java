package aircraft.carrier;

public class F16 extends Aircraft {

    public F16() {
        type = "F16";
        maxAmmo = 8;
        baseDamage = 30;
    }

    public F16(String type) {
        super.type = type;
        maxAmmo = 8;
        baseDamage = 30;
    }

}
