import java.util.Scanner;

class ReverseString {

    public static void reverseString(char[] s) {
        int n = s.length;
        for(int i = 0;i<(n/2);i++){
            char temp = s[i];
            s[i] = s[n-i-1];
            s[n-i-1] = temp;
        }
    }

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        reverseString(arr);
        System.out.print("Reversed string: ");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        sc.close();
    }
}
