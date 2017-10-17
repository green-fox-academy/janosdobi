public class Gnirts implements CharSequence {

    private String s;

    public Gnirts(String s) {
        this.s = s;
    }

    @Override
    public int length() {
        return s.length();
    }

    @Override
    public char charAt(int index) {
        return s.charAt(s.length() - 1 - index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return s.subSequence(end, start);
    }
}
