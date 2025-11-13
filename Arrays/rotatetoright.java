public class rotatetoright {
    public static void reverse(int[] arr,int start,int end){
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
    }

    }

    public static void rightrotate(int[] arr,int d){

        // {1,2,3,4,5,6,7} d=3 {5,6,7,1,2,3,4}  // first reverse full,them 0to d-1,d to n-1
        int n=arr.length;
        d=d%n;
        reverse(arr,0,n-1);
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);


    }
    
    public static void main(String args[]){

    int[] arr = {1,2,3,4,5,6,7};
    int n = 7;
    int d = 3;
    rightrotate(arr, d);
    System.out.print("After Rotating the k elements to left ");
    for (int i = 0; i < n; i++)
    System.out.print(arr[i] + " ");
    System.out.println();
    }
}
