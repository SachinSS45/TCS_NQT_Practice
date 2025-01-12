import java.util.Arrays;

/*
    Q.1 : Problem Statement: Given an array, we have to find the smallest element in the array.
    Example 1:
        Input: arr[] = {2,5,1,3,0};
        Output: 0
        Explanation: 0 is the smallest element in the array.

    Example2:
        Input: arr[] = {8,10,5,7,9};
        Output: 5
        Explanation: 5 is the smallest element in the array
 */
public class Program01 {
    //T.C : O(n)
    public static int max(int[] arr){
        int maxValue = Integer.MIN_VALUE;

        for(int data:arr){
            if(data>maxValue) maxValue = data;
        }
        return maxValue;
    }
    //T.C : O(nlogn) [Sorting]
    public static int max1(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,0};
        System.out.println(Arrays.toString(arr));

        System.out.println("Max value in Array is : " + max(arr));//5
        System.out.println("Max value in Array is : " + max1(arr));//5
    }
}
