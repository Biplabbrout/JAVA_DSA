//how to print numbers from 0 to n
import java.util.*;
public class Ntimes {
    static int cnt=0;

    static void print(int n){
        if(cnt==n) return;
        System.out.println(cnt);
        cnt++;
        print(n);

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the number upto which u want the series:");
        int n = sc.nextInt();
        sc.close();

        print(n);
    }
}
