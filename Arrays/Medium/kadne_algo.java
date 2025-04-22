//implementation of kadne algo to find the max sub array with sum and also print the subarray
public class kadne_algo {
    static int kadne(int[] arr, int n){
        n=arr.length;
        int maximum=Integer.MIN_VALUE;
        int sum=0;
        int start = -1;
        int ansStart = 0;
        int ansEnd = 0;

        for(int i=0;i<n;i++){
            if (sum == 0) start = i; 
            sum+=arr[i];
            
            if(sum>maximum){
                maximum=sum;

                ansStart = start;
                ansEnd = i;
                

            }

            if(sum<0){
                sum=0;
            }
        }
        System.out.print("The subarray is: [");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]n");

        return maximum;
    }
    public static void main(String args[]) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        long Sum = kadne(arr, n);
        System.out.println("The maximum subarray sum is: " + Sum);
}
}
