package online_examination_system;

class ObjectiveEvaluation implements EvaluationStrategy {

    public int evaluate(Question q) {
        if(q.getCorrectAnswer().equals(q.getUserAnswer())) {
            return q.getMarks();
        }
        return 0;
    }
}