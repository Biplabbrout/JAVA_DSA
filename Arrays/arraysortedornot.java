// import java.util.Scanner;

// public class arraysortedornot {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter the size of the array: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter the array elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         boolean isSorted = true; // Initialize to true

//         for (int i = 1; i < n; i++) { // Loop from 1 to n-1
//             if (arr[i] < arr[i - 1]) { // If previous element is greater, array is not sorted
//                 isSorted = false;
//                 break;
//             }
//         }

//         if (isSorted) {
//             System.out.println("Array is sorted.");
//         } else {
//             System.out.println("Array is not sorted.");
//         }

//         sc.close();
//     }
// }

import java.util.*;
class arraysortedornot {
    static boolean isSorted(int arr[]) {
        int n=arr.length;
      for (int i = 1; i < n; i++) {
        if (arr[i] < arr[i - 1])   // start from 1 as , if u start from 0 u cant compare it with anything
          return false;
      }
  
      return true;
    }
  
    public static void main(String args[]) {
      int arr[] = {4,3,2,1}; 
  
      System.out.println(isSorted(arr));
    }
  }
  

// import java.util.Arrays;

// public class arraysortedornot {

//     public static boolean isSortedBySorting(int[] arr) {
//         int[] copy = arr.clone();        // Step 1: Clone original array
//         Arrays.sort(copy);               // Step 2: Sort the copy
//         return Arrays.equals(arr, copy); // Step 3: Compare both arrays
//     }

//     public static void main(String[] args) {
//         int[] arr = {4,3,2,1}; // Try with unsorted too
//         boolean result = isSortedBySorting(arr);
//         System.out.println("Is array sorted? " + result); // Output: true
//     }
// }

// public static boolean isSorted(int[] arr) {
//     boolean ascending = true;
//     boolean descending = true;

//     for (int i = 1; i < arr.length; i++) {
//         if (arr[i] < arr[i - 1]) ascending = false;
//         if (arr[i] > arr[i - 1]) descending = false;
//     }

//     return ascending || descending;
// }
