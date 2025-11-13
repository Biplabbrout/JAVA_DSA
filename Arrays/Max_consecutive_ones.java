//count the max no. of consective ones in an array
import java.util.*;
public class Max_consecutive_ones {
    public static void main(String[] args) {
        int[] arr={1,1,1,1,0,3,4,5,1,1,1,1,1,1};
        int cnt=0;
        int maximum=0;
        

        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                cnt=cnt+1;    
            }
            else{
                cnt=0;
            }
            maximum=Math.max(cnt, maximum);
        }
        System.out.println("The maximum  consecutive 1's are " + maximum);
        
    }
    
}
