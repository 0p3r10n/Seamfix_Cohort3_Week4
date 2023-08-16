package school;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void takeCourse(Course course) {
       // Take the course logic
        System.out.println(name + " is taking course: " + course.getName());
    }
}
