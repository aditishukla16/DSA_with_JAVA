package QuestionsOnArrays;

public class sortZeroesOnes {
   public static void main(String[] args) {
    int[]arr = {1,0,1,0,0,0,1,1};
    int n = arr.length;
/*  //Method 1
    int noOfZeroes =0 ; 
    for(int i=0;i<n;i++){
        if(arr[i]==0) noOfZeroes++;
        
    }
    for(int i= 0;i<n;i++){
        if(i<noOfZeroes) arr[i]=0;
        else arr[i]=1;
    }
    for(int x : arr){
    System.out.print(x + " ");
}*/
   
  
// method 2 -> one pass solution
  int i=0,j=n-1;
  while(i<j){
    if(arr[i]==0) i++;
    if(arr[j]==1) j--;
    if(i>j) break;
    if(arr[i]==1 && arr[j]==0){
        arr[i]=0;
        arr[j]=1;
        i++;
        j--;
    }
  }
  for(int ele:arr){
    System.out.print(ele+" ");
  }
 } 
}
  