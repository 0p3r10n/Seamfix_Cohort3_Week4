package school;


public class Principal {
    public void expelStudent(Student student) {
        // Expel the student logic
        System.out.println("Expelling student: " + student.getName());
    }

    public void admitApplicant(Applicant applicant) {
        // Admit applicant based on age logic
        System.out.println("Admitting applicant: " + applicant.getName());
    }
}
