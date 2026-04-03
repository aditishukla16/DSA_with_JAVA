package Binary_Search;

public class lowerBound {
    public static void main(String[] args){
        int[] arr = {18,23,46,89,91,107,148,264};
        int n = arr.length;
        int target = 50;
        int lb = arr.length;
        int lo = 0;
        int hi = n-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]>=target){
                lb = Math.min(lb,mid);
                hi = mid-1;
            }else{
                lo = mid+1;
            }
           
        }
     System.out.println(lb);
    }
}
