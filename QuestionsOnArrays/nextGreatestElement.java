package QuestionsOnArrays;

public class nextGreatestElement {

    public static void main(String[] args) {

        int[] arr = {12, 8, 41, 37, 2, 49, 16, 28, 21};

        int n = arr.length;

        int[] ans = new int[n];

        // Last element ka next greatest = -1
        ans[n - 1] = -1;

        // Method 2: Optimized (Right to Left)
        int nge = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {

            ans[i] = nge;

            nge = Math.max(nge, arr[i]);
        }

        // Print original array
        System.out.println("Original Array:");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

        System.out.println();

        // Print answer array
        System.out.println("Next Greatest Elements:");
        for (int ele : ans) {
            System.out.print(ele + " ");
        }
    }
}