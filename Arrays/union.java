import java.util.*;

public class union {
    static ArrayList<Integer> Union(int[] arr1, int[] arr2) {

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> union = new ArrayList<>();

        // Add all elements from arr1
        for (int num : arr1) {
            set.add(num);
        }

        // Add all elements from arr2
        for (int num : arr2) {
            set.add(num);
        }
         
        for (int it: set)
         union.add(it);
        // // Add set elements to the list
        // union.addAll(set);

        return union;
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};

        ArrayList<Integer> union = Union(arr1, arr2);

        System.out.println("Union of arr1 and arr2 is:");
        for (int val : union)
            System.out.print(val + " ");
    }
}
