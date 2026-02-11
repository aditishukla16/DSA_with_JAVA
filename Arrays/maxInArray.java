package Arrays;

public class maxInArray {
    public static void main(String[] args){
        int[] arr = {10,8,43,12,56,3};
        int mx = -1;
        for(int i = 0;i< arr.length;i++){
            if(arr[i]>mx) mx = arr[i];

            }
            System.out.println(mx);
        }
    }

    
