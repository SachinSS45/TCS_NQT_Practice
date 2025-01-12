import java.util.LinkedHashMap;
import java.util.Map;

/* Q.14 : Find all the repeating elements present in an array.
    Example 1:
    Input:
    Arr[] = [1,1,2,3,4,4,5,2]
    Output:
     1,2,4
    Explanation:
     1,2 and 4 are the elements which are occurring more than once.

 */
public class Program14 {
    // T.C : O(N) S.C : O(1)
    public static void repeatingEle(int[] arr){
        boolean[] flag = new boolean[arr.length];
        for(int i=0;i<arr.length-1;i++){
            if(flag[i]==true){
                continue;
            }
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    flag[j] = true;
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }

    //By Hashing T.C : O(n) S.C : O(n)
    public static void repeatingEle1(int[] arr){
        Map<Integer,Integer> map = new LinkedHashMap<>();

        for(int i=0;i<arr.length;i++){

            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        for(Integer key : map.keySet()){
            if(map.get(key)>1) System.out.print(key + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,4,5,2};
        repeatingEle1(arr);
    }
}
