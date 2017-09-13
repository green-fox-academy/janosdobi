import java.util.*;

public class AppendLetter{
    public static void main(String... args){
        ArrayList<String> far = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk"));
        // Add "a" to every string in the far list.

        ArrayList<String> newFar = new ArrayList<>();

        String temp = "";
        for(int i = 0; i < far.size(); i++) {
            temp = far.get(i);
            newFar.add(temp.concat("a"));
        }

        System.out.println(newFar);
    }
}