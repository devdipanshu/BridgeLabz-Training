import java.util.Scanner;

public class FindTheLeaderElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of Array: ");
		int n = sc.nextInt();
		int[] numbers = new int[n];
		for(int i = 0;i<numbers.length;i++){
			numbers[i] = sc.nextInt();
		}
		int max = numbers[numbers.length-1];
		System.out.println(max);
		for(int i = numbers.length-2;i>=0;i--){
			if(numbers[i] > max){
				max = numbers[i];
				System.out.println(max);
			}
		}
		sc.close();
	}
}
