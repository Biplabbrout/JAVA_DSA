//check is a number is prime number or not

import java.util.*; 
public class prime {
    public static void main(String[] args) {

        int count=0;
        Scanner sc = new Scanner(System.in);
        // int n;
        System.out.println("enter a number to check if it is prime or not");
        int n= sc.nextInt();

        for(int i=1;i*i<=n;i++){
            if (n%i==0){
               count++;
               if((n/i)!=i){
                count++;
               }
            }
        }

        if(count==2){
            System.out.println("it is a prime number");
        }
        else{
            System.out.println("it is not a prime number");
        }
        sc.close();
    }
    
}
