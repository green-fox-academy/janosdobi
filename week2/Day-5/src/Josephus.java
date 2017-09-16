import java.util.ArrayList;

public class Josephus {

    public static void main(String[] args){

        System.out.println("Survivor: " + execute(12, 3));

    }

    public static int execute(int n, int k){

        int killed = k - 1;
        ArrayList<Integer> prisoners = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            prisoners.add(i);
        }

        prisoners.remove(killed);
        for (int i = prisoners.size(); i > 1; i--) {
            killed = (killed + k - 1);
            if (killed >= prisoners.size() - 1) {
                 killed = killed % prisoners.size();
            }
            prisoners.remove(killed);
        }
        return prisoners.get(0);
    }

}