import java.util.ArrayList;

public class Person {

    protected String name;
    protected int age;
    protected String gender;

    public void introduce() {
        System.out.println("Hi, I'm " + name + " a " + age + " year old " + gender + ".");
    }

    public void getGoal() {
        System.out.println("My goal is: Live for the moment!");
    }

    public Person (String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person () {
        name = "Jane Doe";
        age = 30;
        gender = "female";
    }
}