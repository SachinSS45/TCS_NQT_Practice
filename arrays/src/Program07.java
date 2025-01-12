/* Q.7 : Given an array, we have to find the sum of all the elements in the array.
    Example 1:
    Input: N = 5, array[] = {1,2,3,4,5}
    Output: 15
 */
public class Program07 {
    //T.C : O(n) S.C : O(1)
    public static int arrSum(int[] arr){
        int sum = 0;
        for(int data : arr) sum+=data;
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("Sum : " + arrSum(arr));
    }
}
