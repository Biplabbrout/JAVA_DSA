// largest element in an array
import java.util.*;

public class largest {

    public static int largestElementArray(int[] arr){
        //{8,5,7,9,10}
        int max=arr[0];

        for(int i=1;i<arr.length;i++){
            
            if(arr[i]>max){
                max=arr[i];
            }

        }
        return max;
    }
    public static void main(String[] args) {
        
        int [] arr ={8,5,7,9,10};
        int max=largestElementArray(arr);

        System.out.println(max);
    }
    
}
