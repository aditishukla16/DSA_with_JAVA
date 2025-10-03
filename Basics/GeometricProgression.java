//display this GP : 1,2,4,8....upto 'n terms'

package Basics;

import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();

        int a = 1, r = 2;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            a = a * r;
            sc.close();

        }
    }
}
