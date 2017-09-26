class Mentor extends Person {

    String level;

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " " + level + " mentor.");
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