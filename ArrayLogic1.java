public class ArrayLogic1 {
    public static void main(String[] args) {
       /*   Input:
          3 5 6 8 9
            Output:
        6 4 12 7 18 */
        int[] arr = {3,5,6,8,9};
        for(int i=0; i<arr.length; i++){
            if(i % 2 == 0){
                arr[i] = arr[i]*2;
            }else{
                arr[i] = arr[i]-1;
            }
        }
        for(int n : arr){
            System.out.print(n+" ");
        }
    }
}
