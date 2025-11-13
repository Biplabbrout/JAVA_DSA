public class moveZeroToEnd {
    public static int[] move(int[] arr){
        int j=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }

        for(int i=j+1;i<arr.length;i++){
            if(arr[i]!=arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

                j++;
            }
        }
      return arr;

    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        arr = move(arr);
        System.out.print("After moving zeros: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
