import java.util.LinkedHashSet;
import java.util.Set;

/*
    Q.12 :  Given an unsorted array, remove duplicates from the array.
    Example 1:
    Input: arr[]={2,3,1,9,3,1,3,9}
    Output:  {2,3,1,9}
 */
public class Program12 {
    //T.C : O(n) S.C : O(n)
    public static void removeDuplicates(int[] arr){
        Set<Integer> set = new LinkedHashSet<>();

        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for(int data:set){
            System.out.print(data + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,3,1,9,3,1,3,9};
        removeDuplicates(arr);
    }
}
