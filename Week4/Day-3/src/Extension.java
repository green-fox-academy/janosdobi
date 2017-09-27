import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {

    int add(int a, int b) {
        return a + b;
    }

    int maxOfThree(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (c > a && c > b) {
            return c;
        } else if (b > a && b > c) {
            return b;
        } else {
            return 0;
        }
    }

    static int median(List<Integer> pool) {
        for (int i = 0; i < pool.size() - 1; i++) {
            for (int j = 0; j < pool.size() - i - 1; j++) {
                if (pool.get(j) > pool.get(j + 1)) {
                    int c = pool.get(j);
                    pool.set(j, pool.get(j + 1));
                    pool.set(j + 1, c);
                }
            }
        }
        System.out.println(pool);
        if (pool.size() % 2 == 0) {
            return ((pool.get((pool.size() - 1) / 2) + pool.get((pool.size() / 2))) / 2);
        } else {
            return pool.get((pool.size() - 1) / 2);
        }
    }

    boolean isVowel(char c) {
        return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(c);
    }

    String translate(String hungarian) {
        StringBuilder teve = new StringBuilder();
        teve.append(hungarian);
        int length = teve.length();
        StringBuilder teveNew = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char c = teve.charAt(i);
            if (isVowel(c)) {
                String tempc = c + "v";
                String temp = teve.substring(i + 1, length);
                teveNew = teve.insert(i, tempc).append(temp);
                i += 2;
                length += 2;
            }
        }
        return teveNew.substring(0, length);
    }
}