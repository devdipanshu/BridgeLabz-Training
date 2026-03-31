package online_examination_system;

class DescriptiveEvaluation implements EvaluationStrategy {

    public int evaluate(Question q) {

        if(q.getCorrectAnswer().equals(q.getUserAnswer())) {
            return q.getMarks();
        }

        if(q.getUserAnswer().length() > 10) {
            return q.getMarks() / 2;
        }

        return 0;
    }
}
