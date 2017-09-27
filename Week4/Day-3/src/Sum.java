import java.util.ArrayList;

public class Sum {

    protected ArrayList<Integer> sumArray;

    public int sum() {
        int j = 0;
        for (int i = 0; i < sumArray.size(); i++) {
            j += sumArray.get(i);
        }
        return j;
    }
}
