public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Student john = new Student("John Doe", 20, "male", "BME");
        Student johnTheClone = john.clone();

        Gnirts g = new Gnirts("example");
        System.out.println(g.charAt(1));
// should print out: l

        Shifter s = new Shifter("example", 2);
        System.out.println(s.charAt(0));
// should print out: a

    }
}
