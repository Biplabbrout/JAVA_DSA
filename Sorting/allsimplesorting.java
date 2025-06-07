/*all sorting 1. slection sort (selct minimum and swap with the first element)
              2. bubble sort (adjacent swaps between elements and max is pushed to last
                              -so run from n-1 to 0 )
              3. insertion sort           
  */
// import java.util.*;
public class allsimplesorting {
    static void slection_sort(int[] arr, int n){
        n= arr.length;
        for(int i=0;i<=n-2;i++){
            int minimum =i;
            for(int j=i;j<=n-1;j++){
                if(arr[j]<arr[minimum]){
                    minimum=j;
                }
            }
            int temp=arr[minimum];
            arr[minimum]=arr[i];
            arr[i]=temp;
        }
    }



    static void bubble_sort(int[] arr, int n){
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }


    static void insertion_sort(int[] arr, int n) {
        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,3,2,5,4};

        int n=arr.length;
        System.out.print("array before sorting is:");
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }
       
       System.out.println("");
       
       
        //  slection_sort(arr,n);
        //   bubble_sort(arr, n);    
        insertion_sort(arr,n);


       System.out.print("array after sorting is:");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    }
}
