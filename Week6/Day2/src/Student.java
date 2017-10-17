class Student extends Person implements Cloneable {

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

    @Override
    public Student clone() throws CloneNotSupportedException {
        Student s = (Student) super.clone();
        return s;
    }
}