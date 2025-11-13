class Solution {
    public int secArray(int[] arr) {
        int n =arr.length;
        if (n < 2) {
            return -1; // If there are less than 2 elements, return -1.
        }

        int max = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                secondlargest = max;
                max = arr[i];
            } else if (arr[i] > secondlargest && arr[i] != max) {
                secondlargest = arr[i];
            }
        }

        if (secondlargest == Integer.MIN_VALUE) {
            return -1; // If no second largest found, return -1.
        }

        return secondlargest;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 7, 5};
        
        Solution obj = new Solution(); // Create an object
        int result = obj.secArray(arr); // Call the method

        System.out.println(result); // Print the second largest number
    }
}
