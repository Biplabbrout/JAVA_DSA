//check the number is palindrome or not

import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        

        System.out.println("enter the num");
        int n=sc.nextInt();
        // int n=7789;
        int temp=n;
        int rev=0,ld;

        while(n>0){
            ld=n%10;
            rev=(rev*10)+ld;
            n=n/10;
        }

        if(temp==rev){
           System.out.println("it is palindrome");
        }
        else{
            System.out.println("it is not a palindrome");   
        }
        sc.close();
    }
    
}
