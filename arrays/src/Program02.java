import java.util.Arrays;

/*
    Q.2 : Given an array, we have to find the smallest element in the array.
    Example 1:
    Input: arr[] = {2,5,1,3,0};
    Output: 0
    Explanation: 0 is the smallest element in the array.

    Example2:
    Input: arr[] = {8,10,5,7,9};
    Output: 5
    Explanation: 5 is the smallest element in the array.
 */
public class Program02 {
    //Way 1 : By sorting array T.C : O(nlogn)
    public static int min(int[] arr){
        Arrays.sort(arr);

        return arr[0];
    }

    //Way 2 : By comparing with all elements T.C : O(n)
    public static int min1(int[] arr){
        int min = Integer.MAX_VALUE;
        //Enhanced for loop
        for(int data : arr){
            if(data<min){
                min = data;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,0};
        System.out.println(Arrays.toString(arr));//Use to print array [2,5,1,3,0]
        System.out.println("Smallest Element in array : " + min(arr));//0
        System.out.println("Smallest Element in array : " + min1(arr));//0
    }
}
