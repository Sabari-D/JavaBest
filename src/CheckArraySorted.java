import java.util.Scanner;

public class CheckArraySorted {
    static boolean checkSorted(int[] nums){
        int i=0;
        while(i<nums.length-1){
            int j=i+1;
            if(!(nums[i]<nums[j])) return false;
            else i++;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = scanner.nextInt();
        }
        boolean res = checkSorted(arr);
        System.out.println(res);
    }
}
