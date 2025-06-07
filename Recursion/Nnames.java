//how to print name n times from 1 to n
//here cant have same appraoch as printing numbers as string and int are in compatible types
import java.util.Scanner;
public class Nnames {
    
static void print(int i,int n){
    if(i>n) return;
    System.out.println("Biplab");
    print(i+1,n);

}    
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("how many times u want to print ur name:");
    int n= sc.nextInt();
    sc.close();

    print(1,n);

}
}
