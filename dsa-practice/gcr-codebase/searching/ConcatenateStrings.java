import java.util.Scanner;

public class ConcatenateStrings {

    public static String concatenate(String[] arr) {

        StringBuffer sb = new StringBuffer();

        for(int i = 0;i < arr.length;i++) {
            sb.append(arr[i]);
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of strings:");
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];

        for(int i = 0;i < n;i++) {
        	System.out.println("Enter string: "+(i+1));
            arr[i] = sc.nextLine();
        }
        String result = concatenate(arr);
        System.out.println("Result is: ");
        System.out.println(result);
    }
}
