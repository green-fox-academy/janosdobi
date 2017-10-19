package splitstrings;

public class Split {

    public static void main(String[] args) {
        try {
            splitter("lovebarbara", 16);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("There aren't that many characters in your string!");
        }
    }

    public static String[] splitter(String s, int i) throws StringIndexOutOfBoundsException {
        String[] myArray = new String[2];
        myArray[0] = s.substring(0, i);
        myArray[1] = s.substring(i, s.length());
        return myArray;
    }
}