import java.lang.reflect.Array;
import java.util.Arrays;

/*
    Q.4 : You are given an array. The task is to reverse the array and print it.
       Example 1:
        Input: N = 5, arr[] = {5,4,3,2,1}
        Output: {1,2,3,4,5}
 */
public class Program04 {

    //Brute Force : Reverse array by using new temp array : T.C : O(n) S.C : O(n)
    public static void reverseArr1(int[] arr){

        int size = arr.length;

        int[] temp = new int[size];

        for(int i=0;i<size;i++){
            temp[i] = arr[size-i-1];
        }

        //To put this temp array elements in original array

        for(int i=0;i<size;i++){
            arr[i] = temp[i];
        }

    }
    //Optimize Approch : By using two pointer approch : In place reverse T.C : O(n) S.C : O(1)
    public static void reverseArr2(int[] arr){

        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        reverseArr1(arr);
        System.out.println(Arrays.toString(arr));//[1,2,3,4,5]

    }
}
