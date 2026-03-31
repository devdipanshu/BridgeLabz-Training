package exam_proctor;

import java.util.HashMap;

public class AnswerStore {
	HashMap<Integer,String> answers = new HashMap<>();

	public void saveAnswer(int qid,String ans){
		answers.put(qid,ans);
	}

	public String getAnswer(int qid){
		return answers.get(qid);
	}
}
