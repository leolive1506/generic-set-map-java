package set.entities;

import java.util.HashSet;
import java.util.Set;

public class Student implements Comparable<Student> {
  private Integer id;
  private String name;
  private Set<Course> courses = new HashSet<>();

  public Student(Integer id, String name) {
    this.id = id;
    this.name = name;
  }

  public Integer getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Student other = (Student) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "id=" + id + ", name=" + name + ", courses=" + courses;
  }

  @Override
  public int compareTo(Student other) {
    if (other == null) {
      throw new IllegalArgumentException("User is null");
    }

    return name.toLowerCase().compareTo(other.getName().toLowerCase());
  }

  
}
