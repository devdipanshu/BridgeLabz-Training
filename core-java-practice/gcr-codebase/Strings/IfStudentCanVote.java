import java.util.Scanner;

public class IfStudentCanVote {
	public static int[] createAgeArray(int age1, int age2,int age3,int age4,
			int age5,int age6,int age7,
			int age8,int age9,int age10) {
		
		int []ages = {age1,age2,age3,age4,age5,age6,age7,age8,age9,age10};
		return ages;
	}
	public static String[][] ageValidation(int[]arr){
		String[][]result = new String[arr.length][2];
		for(int i = 0;i<arr.length;i++) {
			result[i][0] = String.valueOf(arr[i]);
			if(arr[i]<0) {
				result[i][1] = "cannot vote";
			}
			else if(arr[i]<18) {
				result[i][1] = String.valueOf(false);
			}
			else {
				result[i][1] = String.valueOf(true);
			}
		}
		return result;
	}
	public static void displayResult(String[][]arr) {
		System.out.println("Age        Result");
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i][0]+"        "+arr[i][1]);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age1 = sc.nextInt();
		int age2 = sc.nextInt();
		int age3 = sc.nextInt();
		int age4 = sc.nextInt();
		int age5 = sc.nextInt();
		int age6 = sc.nextInt();
		int age7 = sc.nextInt();
		int age8 = sc.nextInt();
		int age9 = sc.nextInt();
		int age10 = sc.nextInt();
		
		int[]ages = createAgeArray(age1, age2, age3, age4, age5, age6, age7, age8, age9, age10);
		String[][]result = ageValidation(ages);
		displayResult(result);
		sc.close();
	}
}
