/* Take input percentage marks of student & print grade according to marks
 1. 81-100 : Very good
 2. 61-80  : Good
 3. 41-60  : Average
 4. <=40   : Fail
 */

package Basics;

import java.util.Scanner;

public class MarksGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Percentage:");
        int n = sc.nextInt();

        if(n>=81){
            System.out.println("Very good");
        }else if (n>=61 && n<81){
             System.out.println("good");
        }else if (n>=41 && n<60){
             System.out.println("Average");
        }else{
             System.out.println("Fail");
        }
        sc.close();
    }  
    
}
