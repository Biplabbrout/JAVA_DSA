//count the no of digits
import java.util.*;


public class cnt {
    public static void main(String[] args) {
        int n = 7789;
        // int count = 0;

        int count;
        /*while (n > 0) {
            // n = n / 10;
            // count++;
            
        
        }*/
        count=(int) Math.log10(n)+1;

        System.out.println(count);
    }
}
