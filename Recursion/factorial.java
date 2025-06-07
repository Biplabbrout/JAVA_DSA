//factorial of a number

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to find its factorial");
        int n = sc.nextInt();
        sc.close();

        int fact=1;

        for(int i=1;i<=n;i++){
            fact =fact *i;
        }
        System.out.println(fact);
        

    }
    
}
