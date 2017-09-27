import java.util.HashMap;

public class CountLetters {

    public static HashMap<String, Integer> countLetters(String s) {
        HashMap dictionary = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        for (int i = 0; i < sb.length(); i++) {
            dictionary.put(sb.charAt(i), i);
        }

        return dictionary;
    }
}
