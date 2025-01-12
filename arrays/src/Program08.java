/*
    Q.8 : Given an array of n size, rotate the array by k elements using the Block Swap Algorithm.
        Example 1:
        Input: N = 5, array[] = {1,2,3,4,5} K=2
        Output: {3,4,5,1,2}
        Explanation: Rotate the array to right by 2 elements.

 */
public class Program08 {
        //Brute-Force T.C : O(k) to put in temp array + O(n-k) for shifting + O(k) Again put back into orginal array i.e O(n+k) S.C : O(k)
        public static void leftRotateByD1(int[] arr,int k){

                //We will find the number of time we need to rotate
                int len = arr.length;
                k = k % len;

                //We will take temporary array to store the d elements
                int[] temp = new int[k];

                for(int i=0;i<k;i++){
                        temp[i] = arr[i];
                }

                //No we can put (len-k)elements at front

                for(int i=k;i<len;i++){
                        arr[i-k] = arr[i];
                }
                //put back temp array in original
                //i will start from k=3 is i = 4 therefore arr[4] = we should put temp[0] we can find by using i-(len-k)i.e 4-(7-3) = 4 - 4 = 0 correct
                for(int i=len-d;i<len;i++){
                        arr[i] = temp[i-(len-k)];
                }

        }
        public static void reverse(int[] arr,int start,int end){

                while(start<end){
                        int temp = arr[start];
                        arr[start] = arr[end];
                        arr[end] = temp;
                        start++;
                        end--;
                }
        }
        //Optimize Approch : T.C : O(2n) + S.C : O(1)
        public static void leftRotateByD2(int[] arr,int k){

                int len = arr.length;
                k = k % len;
                reverse(arr,0,k-1);
                reverse(arr,k,len-1);
                reverse(arr,0,len-1);
        }

    public static void main(String[] args) {
            int[] arr = {1,2,3,4,5};
            int k=3;
            leftRotateByD2(arr);
            System.out.println(Arrays.toString(arr));
    }
}
