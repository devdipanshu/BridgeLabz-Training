public class PalindromeChecker {
	String text;
	boolean isPalindrome;
	PalindromeChecker(String text){
		this.text = text;
	}
	public void checkPalindrome() {
		String originalText = "";
		for(int i = 0;i<this.text.length();i++) {
			char ch = this.text.charAt(i);
			if(ch != ' ') {
				originalText = originalText + ch;
			}
		}
		originalText = originalText.toLowerCase();
		int start = 0;
		int end = originalText.length()-1;
		while(start < end) {
			if(originalText.charAt(start) != originalText.charAt(end)) {
				this.isPalindrome = false;
				return;
			}
			start++;
			end--;
		}
		
		this.isPalindrome = true;
	}
	public void displayResult() {
		if(this.isPalindrome) {
			System.out.println(this.text+" is palindrome");
		}
		else {
			System.out.println(this.text+" is not Palindrome");
		}
	}
	
	public static void main(String[] args) {
		PalindromeChecker p1 = new PalindromeChecker("A man a plan a canal Panama");
		p1.checkPalindrome();
		p1.displayResult();
		
		PalindromeChecker p2 = new PalindromeChecker("Hello");
		p2.checkPalindrome();
		p2.displayResult();
	}
}
