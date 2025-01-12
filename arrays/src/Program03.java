import java.util.Arrays;

/*
    Q.3 : Given an array, find the second smallest and second largest element in the array.
          Print ‘-1’ in the event that either of them doesn’t exist.
          Example 1:
            Input:
                [1,2,4,7,7,5]
            Output:
                Second Smallest : 2
                Second Largest : 5
 */
public class Program03 {

    //Brute Force : O(nlogn) Sorting + 0(n) traversing from back
    public static int secondMax(int[] arr){
        Arrays.sort(arr);
        for(int j = arr.length-2;j>=0;j--){
            if(arr[j]!=arr[arr.length-1]) return arr[j];
        }
        return -1;
    }
    //Better Approch : O(2n) i.e O(n)
    public static int secondMax2(int[] arr){
        int max1 = Integer.MIN_VALUE;
        int max2 = -1;
        for(int data : arr){
            if(data>max1) max1 = data;
        }

        for(int data : arr){
            if(data>max2 && data<max1) max2 = data;
        }

        return max2;
    }
    //Optimize approch : T.C : O(n) : In one way
    public static int secondMax3(int[] arr){
        int max1 = arr[0];
        int max2 = -1;

        for(int i=1;i<arr.length;i++){

            if(arr[i]>max1){
                max2 = max1;
                max1 = arr[i];
            }else if(arr[i]<max1 && arr[i]>max2){
                max2 = arr[i];
            }

        }
        return max2;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,7,7,5};
        System.out.println(secondMax(arr));//5
        System.out.println(secondMax2(arr));//5
        System.out.println(secondMax3(arr));//5
    }
}
