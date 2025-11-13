//Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.
import java.util.*;

public class secLargest {

    public static int SecondSmallestElement(int[] arr) {
        int n = arr.length;                            //{1, 2, 2, 5, 7, 7}
        if (n < 2) return -1;

        Arrays.sort(arr);  // Sorts array in ascending order
        int smallest = arr[0];
        int secsmallest = -1;

        for (int i = 1; i < n; i++) {
            if (arr[i] > smallest) {
                secsmallest = arr[i];
                break;
            }
        }

        return secsmallest;  // Returns -1 if no second smallest exists
    }

    public static int SecondLargestElement(int[] arr) {
        int n = arr.length;
        if (n < 2) return -1;

        Arrays.sort(arr);  // Sorts array in ascending order
        int largest = arr[n - 1];
        int seclarge = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < largest) {
                seclarge = arr[i];
                break;
            }
        }

        return seclarge;  // Returns -1 if no second largest exists
    }

    public static void main(String[] args) {
        int[] arr = {7, 7, 7};  // Try {1}, {5, 5}, {7, 7, 7}, {1, 2} {1, 2, 2, 5, 7, 7};

        int seclarge = SecondLargestElement(arr);
        System.out.println("Second Largest: " + seclarge);

        int secsmall = SecondSmallestElement(arr);
        System.out.println("Second Smallest: " + secsmall);
    }
}
