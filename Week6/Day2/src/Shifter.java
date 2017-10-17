public class Shifter implements CharSequence {

    private String s;
    private int i;

    public Shifter(String s, int i) {
        this.s = s;
        this.i = i;
    }

    @Override
    public int length() {
        return s.length();
    }

    @Override
    public char charAt(int index) {
        return s.charAt(index + i);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return s.subSequence(start, end);
    }
}
