package Arrays;

public class sumofelements {
    public static void main(String[] args) {
    
        int[] arr = {23,31,21,2,5};
        int sum = 0;

        for(int i = 0; i<arr.length ;i++){
            sum+=arr[i];
        }
        System.out.println("sum of elements of array is :" + sum);
    }
}
