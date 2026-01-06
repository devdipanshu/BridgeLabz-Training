import java.util.Scanner;

class PlusOne {

    public static int[] plusOne(int[] digits) {
        int n = digits.length - 1;
        for(int i = n;i>=0;i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int a[] = new int[digits.length + 1];
        a[0] = 1;
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of digits: ");
        int n = sc.nextInt();
        int[] digits = new int[n];
        for(int i = 0;i<n;i++){
            System.out.print("Enter digit "+(i+1)+": ");
            digits[i] = sc.nextInt();
        }
        int[] result = plusOne(digits);
        System.out.print("Result after plus one: ");
        for(int i = 0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }

        sc.close();
    }
}
