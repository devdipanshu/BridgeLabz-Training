package exam_proctor;

import java.util.HashMap;

public class Evaluator {

	public int calculateScore(HashMap<Integer,String> answers){
		int score = 0;

		if("A".equals(answers.get(1))){
			score++;
		}
		if("C".equals(answers.get(2))){
			score++;
		}
		if("B".equals(answers.get(3))){
			score++;
		}
		return score;
	}
}
