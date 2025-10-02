/*if cp & sp of an item is input through Keyboard, write a program to determine whether the seller has made
 profit or loss or no profit no loss . Also determine how much profit he made or loss he incurred*/

package Basics;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Selling price:");
        int sp = sc.nextInt();

        System.out.print("Enter Cost price:");
        int cp = sc.nextInt();

        if (sp > cp) {
            System.out.println("Profit is " + (sp - cp));
        } else if (cp > sp) {
            System.out.println("Loss is " + (cp - sp));
        } else {
            System.out.println("No profit no loss");
        }

        sc.close();

    }
}