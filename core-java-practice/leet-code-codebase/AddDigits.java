import java.util.Scanner;

public class AddDigits {
	public static int addDigits(int num) {
        int add = 0;
        while (num > 9) {
            add = 0;
            while (num > 0) {
                int d = num % 10;
                num = num / 10;
                add = add + d;
            }
            num = add;
        }
        return num;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(addDigits(num));
		
	}

}