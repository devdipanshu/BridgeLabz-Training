package exam_proctor;

public class Main {
	public static void main(String[] args){

		ExamSession exam = new ExamSession();

		exam.openQuestion(1);
		exam.answerQuestion(1,"A");

		exam.openQuestion(2);
		exam.answerQuestion(2,"C");

		exam.openQuestion(3);
		exam.answerQuestion(3,"B");

		exam.submit();
	}
}
