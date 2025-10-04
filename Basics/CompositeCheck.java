package Basics;

import java.util.Scanner;

public class CompositeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean isComposite = false;

        // check divisors
        if (n > 1) {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {   // agar divide ho gaya
                    isComposite = true;
                    break;
                }
            }
        }

        // final output
        if (isComposite)
            System.out.println(n + " is a Composite number.");
        else
            System.out.println(n + " is NOT a Composite number.");
            sc.close();
    }
    
}


