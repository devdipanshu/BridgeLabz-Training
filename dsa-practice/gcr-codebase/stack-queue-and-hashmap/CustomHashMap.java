class Entry {
    int key;
    int value;
    Entry next;

    Entry(int key, int value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}

class MyHashMap {

    private int SIZE = 10;
    private Entry[] table;

    MyHashMap() {
        table = new Entry[SIZE];
    }

    public void put(int key, int value) {
        int index = key % SIZE;
        Entry head = table[index];

        if (head == null) {
            table[index] = new Entry(key, value);
            return;
        }

        Entry curr = head;
        while (curr != null) {
            if (curr.key == key) {
                curr.value = value;
                return;
            }
            if (curr.next == null)
                break;
            curr = curr.next;
        }

        curr.next = new Entry(key, value);
    }

    public int get(int key) {
        int index = key % SIZE;
        Entry curr = table[index];

        while (curr != null) {
            if (curr.key == key)
                return curr.value;
            curr = curr.next;
        }

        return -1;
    }

    public void remove(int key) {
        int index = key % SIZE;
        Entry curr = table[index];
        Entry prev = null;

        while (curr != null) {
            if (curr.key == key) {
                if (prev == null)
                    table[index] = curr.next;
                else
                    prev.next = curr.next;
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }

    public void display() {
        for (int i = 0; i < SIZE; i++) {
            Entry curr = table[i];
            System.out.print(i + " -> ");
            while (curr != null) {
                System.out.print("[" + curr.key + "," + curr.value + "] ");
                curr = curr.next;
            }
            System.out.println();
        }
    }
}

public class CustomHashMap {

    public static void main(String[] args) {

        MyHashMap map = new MyHashMap();

        map.put(1, 10);
        map.put(11, 20);   
        map.put(21, 30);   
        map.put(2, 40);

        map.display();

        System.out.println("Get key 11: " + map.get(11));

        map.remove(11);
        System.out.println("After removing key 11:");
        map.display();
    }
}
