// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

public class Bunny1 {
    public static void main(String[] args) {
        System.out.println(bunny1(67));
    }
    public static int bunny1(int numBunny) {
        if(numBunny == 0) {
            return 0;
        }
        return (2 + bunny1(numBunny - 1));
    }
}
