import java.util.Scanner;

class RemoveElement{

    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != val){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        for(int i = 0;i<n;i++){
            System.out.print("Enter element "+(i+1)+": ");
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter value to remove: ");
        int val = sc.nextInt();
        int k = removeElement(nums, val);

        System.out.println("New length after removal: " + k);
        System.out.print("Updated array: ");
        for(int i = 0;i<k;i++){
            System.out.print(nums[i]+" ");
        }
        sc.close();
    }
}
