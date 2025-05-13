//gcd of 2 numbers

import java.util.*;
public class gcd {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        int a=52,b=10;

        if(a>0 && b>0){
            if(a>b){
                a=a%b;
                // System.out.println(a);
            }
            else{
                b=b%a;
                // System.out.println(b);
            }
        }
        if(a==0){
            System.out.println("gcd is"+b);
        }else{

            System.out.println("gcd is "+a);
        }

    }
    
}
