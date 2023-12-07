package set.entities;

import java.util.HashSet;
import java.util.Set;

public class Instructor {
  private Integer id;
  private String name;
  private Set<Student> students = new HashSet<>();
  private Set<Course> courses = new HashSet<>();

  public Instructor(Integer id, String name) {
    this.id = id;
    this.name = name;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Set<Student> getStudents() {
    return students;
  }

  public void addStudent(Student student) {
    students.add(student);
  }

  public void removestudent(Student student) {
    students.remove(student);
  }

  public Set<Course> getCourses() {
    return courses;
  }

  public void addCourse(Course course) {
    courses.add(course);
  }

  public void removeCourse(Course course) {
    courses.remove(course);
  }
}
