package school;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private List<Student> students = new ArrayList<>();
    private Teacher teacher;
    private Course course;

    public void addStudent(Student student) {
        students.add(student);
        System.out.println(student.getName() + " added to the classroom.");
    }

    public void assignTeacher(Teacher teacher) {
        this.teacher = teacher;
        System.out.println("Teacher " + teacher + " assigned to the classroom.");
    }

    public void setCourse(Course course) {
        this.course = course;
        System.out.println("Course " + course.getName() + " assigned to the classroom.");
    }

    // Other Classroom-related methods
}
