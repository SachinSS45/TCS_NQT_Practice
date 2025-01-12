import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/*
    Q.11 : Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once.
    The relative order of the elements should be kept the same.

           If there are k elements after removing the duplicates, then the first k elements of the array should hold the final result.
           It does not matter what you leave beyond the first k elements.

           Example 1:
            Input:
             arr[1,1,2,2,2,3,3]

            Output:
             arr[1,2,3,_,_,_,_]
 */
public class Program11 {
    //T.C : O(n) S.C : O(n)
    public static void removeDuplicates(int[] arr){

        Set<Integer> set = new LinkedHashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        int i=0;
        for(int data : set){
            arr[i] = data;
            i++;
        }
    }
    //T.C : O(n) S.C : O(1)
    public static void removeDuplicates2(int[] arr){

        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3};
        removeDuplicates2(arr);
        System.out.println(Arrays.toString(arr));
    }
}
