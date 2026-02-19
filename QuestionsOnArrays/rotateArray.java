package QuestionsOnArrays;

public class rotateArray {
    // Function to reverse part of array
    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    // Rotate array to right by k
    public static void rotate(int[] nums, int k) {

        int n = nums.length;

        // Handle big k
        k = k % n;

        // Step 1: Reverse first n-k elements
        reverse(nums, 0, n - k - 1);

        // Step 2: Reverse last k elements
        reverse(nums, n - k, n - 1);

        // Step 3: Reverse whole array
        reverse(nums, 0, n - 1);
    }

    // Testing
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        rotate(arr, k);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
} 

