package Arrays;

public class count {
    public static void main(String[] args) {
        int[] arr = { 46, 90, 30, 16, 25, 60 };
        int n = arr.length;
        int x = 20;
        int count = 0;
        for (int i = 0; i < n; i++) {
          if(arr[i]>=x) count++;
          
        }
        System.out.print(count);
    }
}
