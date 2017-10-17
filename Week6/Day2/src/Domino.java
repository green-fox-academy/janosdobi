public class Domino implements Comparable<Domino> {
    private final int[] values;

    public Domino(int valueA, int valueB) {
        this.values = new int[]{valueA, valueB};
    }

    public int[] getValues() {
        return values;
    }

    @Override
    public String toString() {
        return "[" + values[0] + ", " + values[1] + "]";
    }

    @Override
    public int compareTo(Domino o) {
        if (this.getValues()[0] > o.getValues()[1]) {
            return 1;
        } else if (this.getValues()[0] == o.getValues()[1]) {
            return 0;
        } else {
            return - 1;
        }
    }
}