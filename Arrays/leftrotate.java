// left rotate an array by one place
import java.util.*;
public class leftrotate {
    static int[] rotate(int arr[]) {
        //{2,3,4,5,6} op-{3,4,5,6,2}
        int n=arr.length;
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;

        return arr;
    }
    
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        rotate(arr);
    
        System.out.println(Arrays.toString(arr));


    }
}
