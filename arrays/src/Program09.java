/*
    Q.9 : Given an array, we have to find the average of all the elements in the array.
    Example 1:
    Input: N = 5, array[] = {1,2,3,4,5}
    Output: 3
 */
public class Program09 {
    //T.C : O(n) S.C : O(1)
    public static double arrAvg(int[] arr){
        double avg = 0.0;

        for(int data : arr){
            avg = avg + data;
        }
        return avg/arr.length;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("Average : " + arrAvg(arr));
    }
}
