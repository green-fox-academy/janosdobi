// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`

public class Reverse {
    public static void main(String[] args) {

        int[] aj = {3, 4, 5, 6, 7};
        int c = 0;
        for(int i = 0; i < aj.length - 1; i++) {
            for (int j = 0; j < aj.length - i -1; j++) {
                if (aj[j] < aj[j + 1]) {
                    c = aj[j];
                    aj[j] = aj[j + 1];
                    aj[j + 1] = c;
                }
            }
        }

        for(int i = 0; i < aj.length; i++) {
            System.out.println(aj[i]);
        }

    }
}
