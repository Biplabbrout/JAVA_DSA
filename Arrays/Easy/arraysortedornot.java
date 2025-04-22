import java.util.Scanner;

public class arraysortedornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isSorted = true; // Initialize to true

        for (int i = 1; i < n; i++) { // Loop from 1 to n-1
            if (arr[i] < arr[i - 1]) { // If previous element is greater, array is not sorted
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("Array is sorted.");
        } else {
            System.out.println("Array is not sorted.");
        }

        sc.close();
    }
}
