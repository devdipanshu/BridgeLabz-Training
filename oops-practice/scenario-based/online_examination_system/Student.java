package online_examination_system;

import java.util.ArrayList;

class Student {

    String name;
    int id;
    boolean isEnrolled;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.isEnrolled = false;
    }

    void enrollStudent() {
        isEnrolled = true;
        System.out.println(name + " enrolled successfully");
    }

    void submitQuestion(int questionId, String questionText, String correctAnswer, int marks, boolean isObjective, String userAnswer) {

        Question q = new Question(questionId, questionText, correctAnswer, marks, isObjective, userAnswer);

        Exam.questions.add(q);

        System.out.println(name + " submitted answer for Question ID: " + q.getQuestionId());
    }

    void submitExam(Exam exam) {
        try {
            exam.evaluateExam(this);
        } catch (ExamTimeExpiredException e) {
            System.out.println(e.getMessage());
        }
    }
}

