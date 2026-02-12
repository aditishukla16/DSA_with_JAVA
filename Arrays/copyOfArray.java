package Arrays;
import java.util.Arrays;


public class copyOfArray {
    public static void main(String[] args){
        int[] arr = {12,67,89,66,65};
        for(int ele: arr){
            System.out.print(ele+ " ");
        }
        System.out.println();
        int[] nums = arr;//shallow copy
        nums[0]=70;
        System.out.println(arr[0]);
        int[] brr = Arrays.copyOf(arr,arr.length);
        for(int ele : brr){
                System.out.print(ele +" ");
            }
        }
    }

