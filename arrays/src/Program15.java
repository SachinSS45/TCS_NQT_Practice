import java.util.LinkedHashMap;
import java.util.Map;

/*
    Q.15 : Find all the non-repeating elements for a given array. Outputs can be in any order.
    Example 1:
    Input:
     Nums = [1,2,-1,1,3,1]
    Output:
     2,-1,3
 */
public class Program15 {

    //T.C : O(n) S.C : O(1)
    public static void noRepeatingEle(int[] arr){

        for(int i=0;i<arr.length-1;i++){
           boolean flag = false;
            for(int j=0;j<arr.length;j++){
                if(i!=j && arr[i]==arr[j]){
                    flag = true;
                }
            }
            if(!flag) {
                System.out.print(arr[i] + " ");
            }
        }
    }
    //T.C : O(n) S.C : O(n)
    public static void nonRepeatingEle1(int[] arr){
        Map<Integer,Integer> map = new LinkedHashMap<>();

        for(int i=0;i<arr.length;i++){

            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        for(Integer key : map.keySet()){
            if(map.get(key)==1) System.out.print(key + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,-1,1,3,1};
        nonRepeatingEle1(arr);
    }
}
