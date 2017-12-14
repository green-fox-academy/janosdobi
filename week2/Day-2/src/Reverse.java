// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`

import java.util.Arrays;
import java.util.Collections;

public class Reverse {
    public static void main(String[] args) {

        Integer[] aj = {3, 4, 5, 6, 7};
/*        int c = 0;
        for(int i = 0; i < (aj.length - 1)/2; i++) {
            c = aj[i];
            aj[i] = aj[aj.length - 1 - i];
            aj[aj.length - 1 - i] = c;
        }*/

        Collections.reverse(Arrays.asList(aj));

       /* for(int i = 0; i < aj.length; i++) {
            System.out.println(aj[i]);
        }*/

       Arrays.stream(aj).forEach(System.out::println);
    }
}
