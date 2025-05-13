//find the reverse of a number
import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        

        System.out.println("enter the num");
        int n=sc.nextInt();
        // int n=7789;
        int rev=0,ld;

        while(n>0){
            ld=n%10;
            rev=(rev*10)+ld;
            n=n/10;
        }
        System.out.println(rev);
        sc.close();
    }
    
}
