import java.util.Arrays;

/*
    Q.10 : Given an unsorted array, find the median of the given array.
    Example 1:
    Input: [2,4,1,3,5]
    Output: 3

    Example 2:
    Input: [2,5,1,7]
    Output: 3.5
 */
public class Program10 {
    //T.C : O(nlogn) S.C : O(1)
    public static double median(int[] arr){

        double median = 0.0;

        Arrays.sort(arr);

        if(arr.length%2==0){
            int mid1 = arr.length/2;
            int  mid2 = arr.length/2-1;

            return (arr[mid1]+arr[mid2])/2.0;
        }
        return arr[arr.length/2]/2;
    }
    public static void main(String[] args) {
        int[] arr = {2,5,1,7};
        System.out.println("Median : " + median(arr));
    }
}
