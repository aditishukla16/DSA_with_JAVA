package Arrays;

public class secondLargest {
    public static void main(String[] main){
        int arr[] = {12,78,76,98};

        int mx = arr[0];
        for(int i = 1; i<arr.length;i++){
            if(arr[i]>mx);
             mx = arr[i];
        }
        int smx = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i] != mx){
              smx = arr[i];
            }
        } 
        System.out.println(smx);
    }
}
