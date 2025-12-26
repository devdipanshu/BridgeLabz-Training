import java.util.Scanner;

public class ReplaceWordInASentence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sentence: ");
		String sentence = sc.nextLine();
		String[]words = sentence.split(" ");
		System.out.println("Enter the word that you want to replace with: ");
		String word = sc.next();
		System.out.println("Enter the word that you want to replace: ");
		String newWord = sc.next();
		
		for(int i = 0;i<words.length;i++) {
			if(words[i].equals(word)) {
				words[i] = newWord;
			}
		}
		String result = "";
		for(int i = 0;i<words.length;i++) {
			result+=words[i]+" ";
		}
		System.out.println("After Replacing the result is: "+result);
		sc.close();
	}
}
