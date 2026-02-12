package Arrays;

public class passingArraysToMethods {
    public static void main(String[] args){
        int arr[]={10,60,67,90};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }
    public static void change(int arr[]) {
        arr[0]=50;
    }
}
