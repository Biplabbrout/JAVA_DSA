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
// import java.util.*;
// class Solution {
//     public int reverse(int x) {
//       int rev = 0;
        
//         while (x != 0) {
//             int digit = x % 10;
//             x /= 10;

//             // Check for overflow before multiplying/adding
//             if (rev > Integer.MAX_VALUE  || (rev == Integer.MAX_VALUE && digit > 7)) {
//                 return 0;
//             }
//             if (rev < Integer.MIN_VALUE  || (rev == Integer.MIN_VALUE && digit < -8)) {
//                 return 0;
//             }

//             rev = rev * 10 + digit;
//         }

//         return rev;
//     }
// }
