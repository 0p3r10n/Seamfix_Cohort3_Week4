package school;

public class SchoolApp {
    public static void main(String[] args) {
        Principal principal = new Principal();
        Teacher teacher = new Teacher();
        Student student = new Student("John");
        Course course = new Course("Math");
        Classroom classroom = new Classroom();
        Applicant applicant = new Applicant("Alice");

        principal.expelStudent(student);
        principal.admitApplicant(applicant);

        teacher.teachCourse(course);

        student.takeCourse(course);
        classroom.addStudent(student);
        classroom.assignTeacher(teacher);
        classroom.setCourse(course);
    }
}
