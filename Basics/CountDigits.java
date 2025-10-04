package Basics;
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        
        int count = 0;
        
        // Handle case when number is 0
        if(n == 0) {
            count = 1;
        } else {
            while(n != 0){
                n = n / 10;   // update n
                count++;
            }
        }
        
        System.out.println("Number of digits: " + count);
        sc.close();
    }
}

