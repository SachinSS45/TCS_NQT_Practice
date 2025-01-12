import java.util.LinkedHashMap;
import java.util.Map;

/*
    Q.5 : Given an array, we have found the number of occurrences of each element in the array.
    Example 1:
    Input: arr[] = {10,5,10,15,10,5};
    Output: 10  3
	         5  2
            15  1
 */
public class Program05 {

    //For two loops we can find
    //T.C : O(n*n) S.C : O(1)
    public static void count1(int[] arr){

        boolean[] flag = new boolean[arr.length];
        for(int i=0;i<arr.length-1;i++){
            int cnt = 1;
            if(flag[i]==true){
                continue;
            }
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    cnt++;
                    flag[j] = true;
                }
            }
            System.out.println(arr[i] + " : " + cnt);
        }
    }

    //By Hashing : O(n) T.C : O(n)

    public static void count2(int[] arr){
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for(int i = 0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+ 1);
            }else{
                map.put(arr[i],1);
            }
        }

        for(Integer key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,5,10,15,10,5};
        count2(arr);
    }
}
