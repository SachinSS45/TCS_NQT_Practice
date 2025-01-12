import java.util.Arrays;

/*
    Q.13 : Given an array of N integers, write a program to add an array element at the beginning, end, and at a specific position.
    Example:
    Input: N = 5, array[] = {1,2,3,4,5}
    insertbeginning(6)
    insertending(7)
    insertatpos(8,4)
    Output: 6,1,2,8,3,4,5,7
 */
public class Program13 {

    public static void insertBeginning(int[] arr,int data){
        for(int i=arr.length-2;i>=0;i--)
        {
            arr[i+1]=arr[i];
        }
        arr[0]=data;
        System.out.println(Arrays.toString(arr));
    }

    public static void insertEnding(int[] arr,int data){
        arr[arr.length-2] = data;
        System.out.println(Arrays.toString(arr));
    }
    public static void insertAtPos(int[] arr,int pos,int data){
        for(int i=arr.length-2;i>=pos-1;i--){
            arr[i+1]=arr[i];
        }
        arr[pos-1] = data;
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = new int[8];
        for(int i=0;i<5;i++){
            arr[i] = i+1;
        }

        insertBeginning(arr,6);
        insertEnding(arr,7);
        insertAtPos(arr,4,8);
    }
}
