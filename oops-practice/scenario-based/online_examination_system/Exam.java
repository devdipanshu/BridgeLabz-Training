package online_examination_system;

import java.util.ArrayList;

import java.util.ArrayList;

class Exam {

    static ArrayList<Question> questions = new ArrayList<Question>();

    long startTime;
    long duration; 

    Exam(long duration) {
        this.duration = duration;
        this.startTime = System.currentTimeMillis();
    }

    void evaluateExam(Student s) throws ExamTimeExpiredException {

        if(System.currentTimeMillis() - startTime > duration) {
            throw new ExamTimeExpiredException("Exam Time Expired");
        }

        int total = 0;

        for(int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);

            EvaluationStrategy strategy;
            if(q.isObjective()) {
                strategy = new ObjectiveEvaluation();
            } else {
                strategy = new DescriptiveEvaluation();
            }

            total += strategy.evaluate(q);
        }

        System.out.println("Result of " + s.name + " : " + total);
    }
}

