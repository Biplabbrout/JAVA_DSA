// largest element in an array
import java.util.*;

public class largest {
    public static void main(String[] args) {
        // int[] arr= {1,2,3,5,66};
        Scanner sc =new Scanner(System.in);
        int[] arr= new int[5];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int max=arr[0];

        for(int i=0;i<arr.length;i++){
            
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);


    }
    
}
