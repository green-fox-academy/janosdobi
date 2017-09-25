public class Counter {
    int i = 0;

    public Counter() {

    }

    public Counter(int i) {
        this.i = i;
    }

    public void add(int j) {
        i += j;
    }

    public void add() {
        i++;
    }

    public int get () {
        return i;
    }

    public void reset(){
        this.i = i;
    }
}
