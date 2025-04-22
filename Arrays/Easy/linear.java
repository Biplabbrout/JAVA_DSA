//linear search and return the index of element found
import java.util.*;

public class linear {
    static int linearr(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {// this function returns an index of solution cant be equal to num 

            if (arr[i] == num) {
                return i;  // Return index if found
            }
        }
        return -1; // Move this outside the loop
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 7};
        int num = 4;
        int solution = linearr(arr, num);

        if (solution != -1) { // Fix condition
            System.out.println("The index of " + num + " is " + solution);
        } else {
            System.out.println("The element is not present");
        }
    }
}
