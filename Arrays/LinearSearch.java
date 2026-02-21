package Arrays;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter target element:");
            int x = sc.nextInt();
            System.out.print("Enter Array size");
            int size = sc.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter array elements:");
            for(int i=0;i<size;i++){
              arr[i]= sc.nextInt();
            }
            boolean found = false;
            for(int i=0;i<size;i++){
                if(x==arr[i]){
                    found = true;
                    break;
                }
            }  
                if(found){
                    System.out.println("element found");
                }else{
                    System.out.println("not found");
                }
            
    }
} 
