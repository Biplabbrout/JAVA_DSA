import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int n = sc.nextInt();
        sc.close();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int first = 0, second = 1;

        System.out.print("Fibonacci series: " + first);
        if (n > 1) {
            System.out.print(" " + second);
        }

        for (int i = 2; i < n; i++) { // Fix: run only for (n-2) times
            int third = first + second;
            first = second;
            second = third;
            System.out.print(" " + third);
        }
        System.out.println(); // To ensure a newline at the end
    }
}
