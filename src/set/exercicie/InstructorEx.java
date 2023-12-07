package set.exercicie;

import set.entities.Course;
import set.entities.Instructor;
import set.entities.Student;

public class InstructorEx {
  public static void main() {
    Student student13 = new Student(13, "Student 13");
    Student student21 = new Student(21, "Student 21");
    Student student22 = new Student(22, "Student 22");
    Student student35 = new Student(35, "Student 35");
    Student student42 = new Student(42, "Student 42");
    Student student50 = new Student(50, "Student 50");

    Course math = new Course(10, "Math");
    math.addStudents(student21);
    math.addStudents(student35);
    math.addStudents(student22);

    System.out.println(math.getStudents());

    Course port = new Course(15, "Portugues");
    port.addStudents(student21);
    port.addStudents(student50);

    Course ing = new Course(17, "Ingles");
    ing.addStudents(student13);
    ing.addStudents(student35);
    ing.addStudents(student42);

    Instructor alex = new Instructor(1, "Alex");
    alex.addCourse(math);
    alex.addCourse(port);
    alex.addCourse(ing);

    for (Student student: math.getStudents()) {
      alex.addStudent(student);
    }

    for (Student student: port.getStudents()) {
      alex.addStudent(student);
    }

    for (Student student: ing.getStudents()) {
      alex.addStudent(student);
    }

    System.out.println("Total student: " + alex.getStudents().size());
  }
}
