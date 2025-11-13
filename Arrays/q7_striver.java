/*There’s an array ‘A’ of size ‘N’ with an equal number of positive and negative elements. Without altering the relative order of positive and negative elements, you must return an array of alternately positive and negative values. */
import java.util.*;

class q7_striver {
  static int[] RearrangebySign(int[] arr, int n){

    ArrayList<Integer> posi = new ArrayList<>();
    ArrayList<Integer> negi = new ArrayList<>();
    n=arr.length;

    for(int i=0;i<n;i++){
      if(arr[i]>0){
        posi.add(arr[i]);
      }
      else negi.add(arr[i]);
    }

    for(int i=0;i<n/2;i++){
      arr[2*i]=posi.get(i);
      arr[2*i+1]=negi.get(i);
    }

    return arr;
  }
  public static void main(String[] args) {
    int[] arr={1,2,-7,-6};
    int n=arr.length;
    int[] real=RearrangebySign(arr,n);
    for(int i=0;i<n;i++){
      System.out.print(real[i]+" ");
    }
    
  }
}