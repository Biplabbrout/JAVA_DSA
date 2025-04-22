//find second largest in an array
import java.util.*;
public class secLargest {
    public static void main(String[] args) {
        int[] arr= {1,2,-56,5,66};
        // int[] arr= new int[5];
        int n=5;
        Arrays.sort(arr);
        System.out.println("array in sorted order is "+Arrays.toString(arr));

        // int largest=arr[n-1];
        int largest=arr[0];
        int secLargest=-1;;
        // for(int i=n-2;i>=0;i--){
        //     if(arr[i]!=largest){
        //         secLargest=arr[i];
        //         break;
        //     }
        // }
        for(int i=0;i<n;i++){
           if(arr[i]>largest){
             largest=arr[i];
           }
        }

        for(int i=0;i<n;i++){
          if(arr[i]>secLargest && arr[i]!=largest){
            secLargest=arr[i];
          }


        }
        System.out.println(secLargest);
    }
    
}
