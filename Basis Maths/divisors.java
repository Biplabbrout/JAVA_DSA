//print all divisors of a number

import java.util.*; 
public class divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n;
        System.out.println("enter a number to find its divisors");
        int n= sc.nextInt();

        // for(int i=1;i<n;i++){
        //     if (n%i==0){
        //        System.out.println(i);
        //     }
        // }
        for(int i=1;i*i<=n;i++){
            if (n%i==0){
                System.out.println(i);
                if((n/i)!=i){
                    System.out.println(n/i +"");
                }
               
            }
        }
        sc.close();
    }
    
}
