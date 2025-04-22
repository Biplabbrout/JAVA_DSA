//Given an integer array arr, find the contiguous subarray (containing at least one number) which
//has the largest sum and returns its sum and prints the subarray.
import java.util.*;
public class max_subarr_with_sum {

    static int maximum_subarr_sum(int[] arr,int n){
        n=arr.length;
        int maximum=0;

        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                
                
                sum +=arr[j];

                maximum = Math.max(maximum, sum);
            }
        }
     return maximum;
    }
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};

        int ans=maximum_subarr_sum(arr,arr.length);

        System.out.println("the Maximum sum of subarray"+ans);
    }
    
}
