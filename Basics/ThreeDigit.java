/*Take positive Integer input & tell if it is three digit no.or not */

package Basics;

import java.util.Scanner;

public class ThreeDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number:");
        int n = sc.nextInt();

        if (n > 99 && n < 1000) {
            System.out.println("3-digit Number");
        } else {
            System.out.println("Not a 3-digit Number");
        }
        sc.close();
    }
}
