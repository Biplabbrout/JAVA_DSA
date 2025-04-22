public class leftrotate {
    static void rotate(int arr[], int n) {
        int temp = arr[0]; // Store first element

        // Shift elements to the left
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }

        // Move first element to last position
        arr[n - 1] = temp;

        // Print the rotated array
        System.out.print("Rotated Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length; // Get array size

        rotate(arr, n);
    }
}
