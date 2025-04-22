/* sorting an array contaoing 0,1,2's we will use dutch flag algo
in which we have to sort the places from mid to high*/ 

public class sort_array {
    public static void main(String[] args) {
        int[] arr={0, 2, 1, 2, 0, 1};
        int n=arr.length;

        int low=0,mid=0,high=n-1;

        System.out.println("array before sorting:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        while(mid<=high){
            if(arr[mid]==0){
                //then swap mid and low
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;

                low++;
                mid++; 
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                //swap mid and high
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;

                high--;
            }
        }

        System.out.println("array after sorting:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    
}
