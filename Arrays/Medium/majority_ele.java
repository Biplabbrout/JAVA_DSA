// Given an array of N(size of array) integers, write a program to return an element that occurs more than N/2 times in the given array. You may consider that such an element always exists in the array.

public class majority_ele {
    static int calulate_majority (int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    cnt++;
                }
            }
            if(cnt>(n/2)){
                return arr[i];
            }
        }
        return -1;//means no majority element

        
    }
    public static void main(String[] args) {
        int[] arr={2, 2, 1, 1, 1, 2, 2};
        int call=calulate_majority(arr);
        System.out.println("The Majority Element"+call);
        
    }
    
}
