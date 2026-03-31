import java.util.*;

public class CircularBuffer {

    int[] buffer;
    int size;
    int start = 0;
    int end = 0;
    int count = 0;

    CircularBuffer(int size) {
        this.size = size;
        buffer = new int[size];
    }
    void insert(int x) {
        buffer[end] = x;
        end = (end + 1) % size;

        if(count < size) {
            count++;
        } else {
            start = (start + 1) % size;
        }
    }
    void display() {
        System.out.print("[");
        for(int i = 0;i < count;i++) {
            int index = (start + i) % size;
            System.out.print(buffer[index]);
            if(i != count - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter buffer size: ");
        int size = sc.nextInt();

        CircularBuffer cb = new CircularBuffer(size);

        System.out.print("Enter number of elements to insert: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for(int i = 0;i < n;i++) {
            cb.insert(sc.nextInt());
            System.out.print("Buffer after insertion: ");
            cb.display();
        }
    }
}
