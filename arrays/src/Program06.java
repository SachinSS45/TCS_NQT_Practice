import java.util.Arrays;

/*
  Q.6 : Rearrange the array such that the first half is arranged in increasing order, and the second half is arranged in decreasing order
   Example 1:
    Input: 8 7 1 6 5 9
    Output: 1 5 6 9 8 7
    Explanation: First three elements are in the ascending order and next three elements are in the descending order.
 */
public class Program06 {
    //T.C : O(nlogn) [Sort] //S.C : T.C(n/2) i.e O(n)
    public static void rearrange(int[] arr){

        Arrays.sort(arr);
        int[] temp = new int[arr.length/2];
        for(int i=0;i<arr.length/2;i++){
            temp[i] = arr[arr.length-1-i];
        }
        for(int i= arr.length/2;i< arr.length;i++){
            arr[i] = temp[i-arr.length/2];
        }
    }
    public static void main(String[] args) {
        int[] arr = {8,7,1,6,5,9};
        rearrange(arr);
        System.out.println(Arrays.toString(arr));
    }
}
