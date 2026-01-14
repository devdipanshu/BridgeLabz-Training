import java.util.LinkedList;
import java.util.Queue;

class PetrolPump {
    int petrol;
    int distance;

    PetrolPump(int petrol, int distance) {
        this.petrol = petrol;
        this.distance = distance;
    }
}

public class CircularTour {

    static int findStart(PetrolPump arr[], int n) {

        Queue<Integer> q = new LinkedList<>();
        int currPetrol = 0;
        int totalPetrol = 0;
        int start = 0;

        for (int i = 0; i < n; i++) {
            int diff = arr[i].petrol - arr[i].distance;
            currPetrol += diff;
            totalPetrol += diff;

            q.add(i);

            while (currPetrol < 0 && !q.isEmpty()) {
                int removed = q.poll();
                currPetrol -= (arr[removed].petrol - arr[removed].distance);
                start = removed + 1;
            }
        }

        if (totalPetrol < 0) {
            return -1;
        }

        return start;
    }

    public static void main(String[] args) {

        PetrolPump arr[] = {
            new PetrolPump(4, 6),
            new PetrolPump(6, 5),
            new PetrolPump(7, 3),
            new PetrolPump(4, 5)
        };

        int ans = findStart(arr, arr.length);

        if (ans == -1) {
            System.out.println("No possible tour");
        } else {
            System.out.println("Start at petrol pump: " + ans);
        }
    }
}

