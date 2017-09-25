public class Teacher {

    public void teach(Student student) {
        student.learn();
    }

    public void answer() {

    }

}

class Student {

    public void learn(){

    }

    public void question(Teacher teacher) {
        teacher.answer();
    }

}

