//Find the number that appears once, and the other numbers twice
import java.util.*;

//import javax.annotation.processing.ProcessingEnvironment;

public class appearonce {
    public static void main(String[] args) {
        int[] arr={1,1,2,33,33,4,4};

        int xorr=0;
        for(int i=0;i<arr.length;i++){
            xorr=xorr ^ arr[i];
        }
        System.out.println(xorr);

       

    }
    
}
