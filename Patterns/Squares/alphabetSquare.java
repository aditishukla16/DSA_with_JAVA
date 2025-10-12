package Patterns.Squares;

import java.util.Scanner;

public class alphabetSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter char:");
        char ch = sc.next().charAt(0);
         for(char i = 'A' ; i<= ch; i++){
            for(char j = 'A' ; j<=ch; j++){
                System.out.print(i + " ");
            }
            System.out.println();
           
         }
         sc.close();
    }
    
}
