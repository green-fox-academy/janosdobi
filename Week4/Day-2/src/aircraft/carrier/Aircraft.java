package aircraft.carrier;

public class Aircraft {

    protected String type;
    protected int maxAmmo;
    protected int actAmmo;
    protected int baseDamage;

    public Aircraft() {
        actAmmo = 0;
    }

    public Aircraft(String type) {
        this.type = type;
        actAmmo = 0;
    }

    public int fight() {
        int totalDamage = actAmmo * baseDamage;
        actAmmo = 0;
        return totalDamage;
    }

    public int refill(int refillAmmo) {
        int remainingAmmo = refillAmmo;
        this.actAmmo = maxAmmo;
        remainingAmmo = refillAmmo - maxAmmo + actAmmo;
        return remainingAmmo;
    }

    public String getType() {
        return type;
    }

    public String getStatus() {
        return "Type: " + type + ", Ammo: " + actAmmo + ", Base Damage: " + baseDamage + ", All Damage: " + baseDamage * actAmmo;
    }
}