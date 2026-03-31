import java.util.ArrayList;
import java.util.Scanner;

public class RotateList {

    static ArrayList<Integer> rotateList(ArrayList<Integer> list, int k) {

        int n = list.size();
        ArrayList<Integer> rotated = new ArrayList<>();

        k = k % n;  
        for(int i = k;i < n;i++) {
            rotated.add(list.get(i));
        }

        for(int i = 0;i < k;i++) {
            rotated.add(list.get(i));
        }

        return rotated;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int n = sc.nextInt();

        for(int i = 0;i < n;i++) {
            list.add(sc.nextInt());
        }

        int k = sc.nextInt();

        ArrayList<Integer> result = rotateList(list, k);

        for(int i = 0;i < result.size();i++) {
            System.out.print(result.get(i) + " ");
        }
    }
}
