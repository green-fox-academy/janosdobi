import java.util.ArrayList;

public class Person {

    String name;
    int age;
    String gender;

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

class Student extends Person {

    String name;
    int age;
    String gender;
    String previousOrganization;
    int skippedDays;

    public void introduce() {
        System.out.println("Hi, I'm " + name + " a " + age + " year old " + gender + " from " + previousOrganization +
        " who skipped " + skippedDays + " from the course already.");
    }

    public void getGoal() {
        System.out.println("Be a junior software developer!");
    }

    public void skipDays (int numberOfDays) {
        skippedDays += numberOfDays;
    }

    public Student(String name, int age, String gender, String previousOrganization) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public Student() {
        name = "Jane Doe";
        age = 30;
        gender = "female";
        previousOrganization = "school of life";
        skippedDays = 0;
    }
}

class Mentor extends Person {

    String name;
    int age;
    String gender;
    String level;

    public void introduce() {
        System.out.println("Hi, I'm " + name + " a " + age + " year old " + gender + " " + level + " mentor.");
    }

    public void getGoal() {
        System.out.println("Educate brilliant software developers.");
    }

    public Mentor (String name, int age, String gender, String level) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.level = level;
    }

    public Mentor () {
        name = "Jane Doe";
        age = 30;
        gender = "female";
        level = "intermediate";
    }
}

class Sponsor extends Person {

    String name;
    int age;
    String gender;
    String company;
    int hiredStudents;

    public void introduce() {
        System.out.println("Hi, I'm " + name + " a " + age + " year old " + gender + ", who represents " + company +
        " and hired " + hiredStudents + " students so far.");
    }

    public void getGoal() {
        System.out.println("Hire brilliant software developers.");
    }

    public void hire() {
        hiredStudents++;
    }

    public Sponsor (String name, int age, String gender, String company) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.company = company;
        this.hiredStudents = 0;
    }

    public Sponsor () {
        name = "Jane Doe";
        age = 30;
        gender = "female";
        company = "Google";
        hiredStudents = 0;
    }
}

class Main {
    public static void main(String[] args) {


        ArrayList<Person> people = new ArrayList<>();

        Person mark = new Person("Mark", 46, "male");
        people.add(mark);
        Person jane = new Person();
        people.add(jane);
        Student john = new Student("John Doe", 20, "male", "BME");
        people.add(john);
        Student student = new Student();
        people.add(student);
        Mentor gandhi = new Mentor("Gandhi", 148, "male", "senior");
        people.add(gandhi);
        Mentor mentor = new Mentor();
        people.add(mentor);
        Sponsor sponsor = new Sponsor();
        people.add(sponsor);
        Sponsor elon = new Sponsor("Elon Musk", 46, "male", "SpaceX");
        people.add(elon);

        student.skipDays(3);

        for (int i = 0; i < 5; i++) {
            elon.hire();
        }
        for (int i = 0; i < 3; i++) {
            sponsor.hire();
        }

        for(Person person : people) {
            person.introduce();
            person.getGoal();
        }

    }
}