import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ReverseList {
    static void reverseArrayList(ArrayList<Integer> list) {
        int start = 0;
        int end = list.size() - 1;
        while(start < end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }

    static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list) {

        LinkedList<Integer> reversed = new LinkedList<>();

        for(int i = 0;i < list.size();i++) {
            reversed.addFirst(list.get(i));
        }

        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arrList = new ArrayList<>();
        for(int i = 0;i < n;i++) {
            arrList.add(sc.nextInt());
        }
        reverseArrayList(arrList);
        for(int i = 0;i < arrList.size();i++) {
            System.out.print(arrList.get(i) + " ");
        }
        System.out.println();
        int m = sc.nextInt();
        LinkedList<Integer> linkList = new LinkedList<>();
        for(int i = 0;i < m;i++) {
            linkList.add(sc.nextInt());
        }
        LinkedList<Integer> result = reverseLinkedList(linkList);
        for(int i = 0;i < result.size();i++) {
            System.out.print(result.get(i) + " ");
        }
    }
}