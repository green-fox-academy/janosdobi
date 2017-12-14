// - Create an array variable named `nimals`
//   with the following content: `["kuty", "macs", "cic"]`
// - Add all elements an `"a"` at the end

import java.util.Arrays;

public class AppendA2 {
    public static void main(String[] args) {

        String[] animals = {"kuty", "macsk", "cic"};

/*        for(int i = 0; i < animals.length; i++) {
            animals[i] += "a";
        }

        for(int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }*/

        Arrays.stream(animals)
                .map(a -> a += "a")
                .forEach(System.out::println);
    }
}
