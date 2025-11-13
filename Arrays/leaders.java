//find the leaders in an array 
import java.util.*;
public class leaders {
    static ArrayList<Integer> Leaders_of_array(int[] arr){

        ArrayList<Integer> ans =new ArrayList<>();

        for(int i=0;i<arr.length;i++){

            boolean leader=true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    leader=false;
                    break;
                }
            }
            if(leader==true){
                ans.add(arr[i]);
            }
        }
        return ans;

    }
    


    public static void main(String[] args) {
        int arr[]=  {10, 22, 12, 3, 0, 6};

        ArrayList<Integer> ans= Leaders_of_array(arr);
        Collections.sort(ans);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
        }

        

    }
}
