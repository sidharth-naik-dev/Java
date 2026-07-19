import java.util.ArrayList;

class Student {
    static ArrayList<Student> students = new ArrayList<>();
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
        students.add(this); // Store reference of every object
    }
    static void displayAllStudents() {
        for (Student s : students) {
            System.out.println(s.id + " - " + s.name);
        }
    }
}
public class StaticCollection {
    static void main() {
        Student e1 = new Student(101, "Alice");
        Student e2 = new Student(102, "Bob");
        Student.displayAllStudents();
    }
}
