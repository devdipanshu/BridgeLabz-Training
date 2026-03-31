package online_examination_system;

import java.util.ArrayList;

class Question {

    private int questionId;
    private String questionText;
    private String correctAnswer;
    private String userAnswer;
    private int marks;
    private boolean isObjective;

    Question(int questionId, String questionText, String correctAnswer, int marks, boolean isObjective, String userAnswer) {
        this.questionId = questionId;
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
        this.marks = marks;
        this.isObjective = isObjective;
        this.userAnswer = userAnswer;
    }

    int getQuestionId() { return questionId; }
    String getQuestionText() { return questionText; }
    String getCorrectAnswer() { return correctAnswer; }
    String getUserAnswer() { return userAnswer; }
    int getMarks() { return marks; }
    boolean isObjective() { return isObjective; }
}
