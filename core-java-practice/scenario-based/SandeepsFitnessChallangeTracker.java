import java.util.Scanner;

public class SandeepsFitnessChallangeTracker {
	public static int[] calculatePushUps() {
		Scanner sc = new Scanner(System.in);
		int[] counts = new int[7];
		for(int i = 0;i<7;i++) {
			System.out.println("Enter How many push-ups you have completed on "+i+"th day(enter 0 if it is rest day): ");
			int val = sc.nextInt();
			if(val==0) {
				continue;
			}
			else {
				counts[i] = val;
			}
		}
		sc.close();
		return counts;
		
	}
	public static int calculateTotal(int[] arr) {
		int total = 0;
		for(int val:arr) {
			total+=val;
		}
		return total;
	}
	public static int calculateAverage(int[] arr) {
		int total = calculateTotal(arr);
		int count = 0;
		for(int val:arr) {
			if(val==0) {
				continue;
			}
			else{
				count++;
			}
		}
		if(count==0) {
			return 0;
		}
		return (total/count);
	}
	public static void main(String[] args) {
		int[]counts = calculatePushUps();
		int total = calculateTotal(counts);
		int average = calculateAverage(counts);
		System.out.println("The total push-ups in a week is: "+total);
		System.out.println("The Average push-ups in a week is: "+average);
	}
}
