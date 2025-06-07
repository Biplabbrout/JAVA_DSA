import java.util.Scanner;

//how to print something from n to one
//so that means start from n to like 4 3 2 1
public class NtoOne {
    static void print(int i, int n){
        if(i<1) return;
        System.out.println(i);

            // Function call to print i till i decrements to 1.
            print(i-1,n);


    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n");

        int n =sc.nextInt();
        sc.close();

        print(n,1);
    }
    
}
