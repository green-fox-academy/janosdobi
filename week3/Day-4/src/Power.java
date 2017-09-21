// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

public class Power {
    public static void main(String[] args) {
        System.out.println(power(3,3));
    }
    public static int power(int base, int exp) {
        if(exp == 1) {
            return base;
        }
        return base * power(base, exp -1);
    }
}