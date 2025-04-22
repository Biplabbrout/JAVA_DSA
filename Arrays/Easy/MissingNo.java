//find the missing number in an array, the missinng nuumber will be from 1 To N(Natural no)
public class MissingNo {
    public static void main(String[] args) {
        int[] arr={1,3,4,5};
        int N=arr.length + 1;
        int n=arr.length;
        int sum=(N*(N+1))/2;
   
        int Sum1=0;
        for(int i=0;i<n;i++){
            Sum1=Sum1+arr[i];
        }
    //   int x=Sum1;

        int missingNum = sum - Sum1;
        System.out.println(missingNum);
    }
    
}
