import java.util.Scanner;

public class MaxElementArray {
    static int maxElement(int[] nums){
        int n = nums.length;
        if(n == 0) return -1;
        int max = nums[0];
        for(int i=0; i<n; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = scanner.nextInt();
        }
        int res = maxElement(arr);
        System.out.println(res);
    }
}
