/* Switch Statement (Replacement for if-else) */
package Basics;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0); // String input liya aur 1st char nikala

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        switch (op) {
            case '+':
                System.out.println("Result: " + (a + b));
                break;
            case '-':
                System.out.println("Result: " + (a - b));
                break;
            case '*':
                System.out.println("Result: " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Error: Division by zero not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator!");
        }

        sc.close(); 
    }
}


