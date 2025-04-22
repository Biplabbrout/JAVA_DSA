//Longest Subarray with given Sum K(Positives)
import java.util.*;
public class longest_subarray {
    public static void main(String[] args) {
        int[] arr={ -1, 1, 1};
        int k=1,sum=0,len=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++)
            {
                sum+=arr[j];

                if(sum==k){
                 len=Math.max(len, j-i+1);
                }
            }

        }

        System.out.println(len);
        


    }
}
