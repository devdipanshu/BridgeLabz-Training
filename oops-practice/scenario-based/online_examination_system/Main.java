package online_examination_system;

public class Main {

    public static void main(String[] args) {

        Exam exam = new Exam(60000); // 1 minute exam

        Student s1 = new Student("Aman", 101);
        s1.enrollStudent();

        // Student submits questions → internally Question object create hoga
        s1.submitQuestion(1, "2 + 2", "4", 5, true, "4");
        s1.submitQuestion(2, "Explain OOP", "OOP uses objects", 10, false, "OOP uses objects and classes");

        // Student submits exam → internally Exam.evaluateExam() call
        s1.submitExam(exam);
    }
}
