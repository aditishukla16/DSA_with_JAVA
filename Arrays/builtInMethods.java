package Arrays;
import java.util.Arrays;

public class builtInMethods {
    public static void main(String[] args){
        int arr[]={39,78,98,67,43,23};
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        Arrays.sort(arr);
        System.out.println();
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
