/*selection sort is implemented here (which means select the minimum index and swap with the first element(index) 1.so we will be given with an array and sort it
        2.so if array size is 6 , so it will outer loop iteration will go upto 5 which is(n-1))
        3.and the inner loop will be responsible for finding the minimum index
        4.then in outer loop swaping with minimum index*/

public class selection {
public static void main(String[] args) {
    int[] arr={1,5,6,4,8,7};
    int n=arr.length;
    System.out.print("array before sorting is:");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }

    for(int i=0;i<=n-2;i++){
        int minimum=i;
        for(int j=i;j<=n-1;j++){
            if(arr[j]<arr[minimum])
            {
                minimum=j;
            }
            int temp=arr[minimum];// swap between minimum index and i
            arr[minimum]=arr[i];
            arr[i]=temp;

        }
    }
    System.out.print("array after sorting is:");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }

}    
}
