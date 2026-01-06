import java.util.Scanner;

public class FormatString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the paragraph: ");
		String para = sc.nextLine();
		String result = "";
		String word = "";
		for(int i = 0;i<para.length();i++) {
			if(i==0 && !(para.charAt(i)=='.'||para.charAt(i)=='!'||para.charAt(i)=='?'||para.charAt(i)==',')) {
				int ascii = para.charAt(i);
				if(ascii >= 97 && ascii <= 122){
					ascii = ascii-32;
				}
				char ch = (char)ascii;
				word+=ch;
			}
			else if(para.charAt(i)=='.'||para.charAt(i)=='!'||para.charAt(i)=='?'||para.charAt(i)==',') {
				result+=word;
				result+=para.charAt(i);
				result+=' ';
				word = "";
				if(para.charAt(i)!=',') {
					i++;
					if(i<para.length()) {
						int ascii = para.charAt(i);
						if(ascii >= 97 && ascii <= 122){
							ascii = ascii-32;
						}
						char ch = (char)ascii;
						word+=ch;
					}
				}
				
			}
			else if(para.charAt(i)==' ') {
				int j = i;
				while(j<para.length()-1 && para.charAt(j+1)==' ') {
					j++;
				}
				i=j;
				result+=word;
				result+=' ';
				word = "";
			}
			else {
				word+=para.charAt(i);
			}
		}
		result+=word;
		result = result.trim();
		
		System.out.println(result);
		sc.close();
	}
}
