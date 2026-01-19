import java.util.*;

public class SearchDataStructures {

    static boolean arraySearch(int[] arr,int target){
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }

    static boolean hashSetSearch(HashSet<Integer> set,int target){
        return set.contains(target);
    }

    static boolean treeSetSearch(TreeSet<Integer> set,int target){
        return set.contains(target);
    }

    public static void main(String[] args){

        int n = 1000000;
        int[] data = new int[n];
        Random r = new Random();

        for(int i = 0;i<n;i++){
            data[i] = r.nextInt(n);
        }

        int target = data[n - 1];

        long startArray = System.nanoTime();
        arraySearch(data,target);
        long endArray = System.nanoTime();

        System.out.println("Array Search Time (ns): " + (endArray - startArray));

        HashSet<Integer> hashSet = new HashSet<>();
        for(int val : data){
            hashSet.add(val);
        }

        long startHash = System.nanoTime();
        hashSetSearch(hashSet,target);
        long endHash = System.nanoTime();

        System.out.println("HashSet Search Time (ns): " + (endHash - startHash));

        TreeSet<Integer> treeSet = new TreeSet<>();
        for(int val : data){
            treeSet.add(val);
        }

        long startTree = System.nanoTime();
        treeSetSearch(treeSet,target);
        long endTree = System.nanoTime();

        System.out.println("TreeSet Search Time (ns): " + (endTree - startTree));
    }
}
