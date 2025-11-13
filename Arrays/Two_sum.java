/*Given an array of integers arr[] and an integer target.

1st variant: Return YES if there exist two numbers such that their sum is equal to the target. Otherwise, return NO.*/

public class Two_sum {
    public static void main(String[] args) {
        int[] arr={2, 8, 3, 7, 5, 5};
        int target=15,n=arr.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    System.out.print("Yes");
                    return;
                }
                
            }
            
        }
        System.out.println("No"); 
    }
    
}
/*class Solution {
    public int[] twoSum(int[] arr, int target) {

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
} */