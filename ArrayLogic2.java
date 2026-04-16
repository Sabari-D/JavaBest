import java.util.Arrays;
import java.util.Scanner;

public class ArrayLogic2 {
    static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int[] leftProduct = new int[n];
        int[] righProduct = new int[n];

        int product = 1;
        for(int i=0; i<n; i++){
            product = product * nums[i];
            leftProduct[i] = product;
        }

        product=1;
        for(int i=n-1; i>=0; i--){
            product = product * nums[i];
            righProduct[i] = product;
        }

        res[0] = righProduct[1];
        res[n-1] = leftProduct[n-2];

        for(int i=1; i<n-1; i++){
            res[i] = leftProduct[i-1] * righProduct[i+1];
        }
        return res;
    }
    public static void main(String[] args) {
        /*Input:
        1 2 3 4
        Output:
        24 12 8 6
  */

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr=new int[size];
        for(int i=0; i<size; i++){
            arr[i] = scanner.nextInt();
        }

        int[] res = productExceptSelf(arr);
        System.out.println(Arrays.toString(res));
    }
}
