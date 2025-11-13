public class longest_subarray {
    public static void main(String[] args) {
        int[] arr = {-1, 1, 1};
        int k = 1;
        int sum = 0, len = 0;
        int n = arr.length;
        int start = -1, end = -1;

        for (int i = 0; i < n; i++) {
            sum = 0;  // Reset sum for each new starting point
            for (int j = i; j < n; j++) {
                sum += arr[j];

                if (sum == k) {
                    int currentLength = j - i + 1;
                    if (currentLength > len) {
                        len = Math.max(len, currentLength);  // Update max length
                        start = i;
                        end = j;
                    }
                }
            }
        }

        System.out.println("Length of longest subarray with sum " + k + ": " + len);

        if (start != -1 && end != -1) {
            System.out.print("Subarray: ");
            for (int i = start; i <= end; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("No subarray with sum " + k + " found.");
        }
    }
}
