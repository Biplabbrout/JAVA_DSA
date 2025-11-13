//reverse an array
import java.util.*;
public class reversearray {
    public static int[] reverseArray(int[] arr){
        //{2,3,4,5,6} op-{6,5,4,3,2}
        int start=0,end=arr.length-1;

        while(start<=end){
            // int temp=arr[start];
            // arr[start]=arr[end];
            // arr[end]=temp;
            arr[start] = arr[start] ^ arr[end];
            arr[end] = arr[start] ^ arr[end];
            arr[start] = arr[start] ^ arr[end];


            start++;
            end--;
        }

        return arr;

    }

    public static void main(String[] args) {
        int[] arr={2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        reverseArray(arr);

        // for(int i=0;i<arr.length;i++){
        // System.out.print(arr[i]+" ");
        // }
        System.out.println(Arrays.toString(arr));
    }
}
