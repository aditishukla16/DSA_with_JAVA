/*display this AP : 1,3,5,7,9...upto n terms */

package Basics;

import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        int a = 1, d = 2;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            a += d;
            sc.close();

        }

    }

}
