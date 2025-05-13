//check the number is an armstrong num or not

import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        

        System.out.println("enter the num");
        int n=sc.nextInt();
        // int n=7789;
        int originalnum=n;

        int sum=0,ld;

        // int temp=0;
        // counting digits
         int temp=n;
        int count=(int) Math.log10(n)+1;

        while(n>0){
            ld=n%10;
            sum=sum +(int) Math.pow(ld,count);
            n=n/10;
        }

        if(originalnum==sum){
           System.out.println("it is armstrong");
        }
        else{
            System.out.println("it is not a armstrong");   
        }
        sc.close();
    }
    
}
