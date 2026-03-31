package exam_proctor;

public class ExamSession {
	QuestionStack navigation = new QuestionStack();
	AnswerStore store = new AnswerStore();
	Evaluator evaluator = new Evaluator();

	public void openQuestion(int id){
		navigation.visit(id);
	}

	public void answerQuestion(int id,String ans){
		store.saveAnswer(id,ans);
	}

	public void submit(){
		int score = evaluator.calculateScore(store.answers);
		System.out.println("Score : "+score);
	}
}
