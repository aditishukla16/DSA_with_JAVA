/*Find out if 'n' is even or odd using Ternary Operator(Replacement for if else) */

package Basics;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number:");
        int n = sc.nextInt();

        // condition? if true: if false
        System.out.println((n%2==0) ? "Even" : "Odd" );
        sc.close();
    }
    
}   

