//extraction of digits
import java.util.*;

public class extract {
    public static void main(String[] args) {
        // int n= 7789;
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        

        while(n>0){
            int lastdigit=n%10;
            n=n/10;

            System.out.println(lastdigit);
        }
        sc.close();
    }
    
}
