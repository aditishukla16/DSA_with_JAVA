/*given a point (x,y),WAP to find out if it lies in first, second , 
third, or fourth Quadrant, on the x - axis , y -axis or at origin(0,0) */

package Basics;

import java.util.Scanner;

public class CoordinateAndquadrants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the x-coordinate:");
        int x = sc.nextInt();

        System.out.print("Enter the y-coordinate:");
        int y = sc.nextInt();

        if(x==0 && y==0){
            System.out.println("The point lies at origin");

        }else if(x==0){
            System.out.println("The point lies in y-axis");
        
        }else if (y==0){
            System.out.println("The point lies in x-axis");

        }else if(x>0 && y>0){
            System.out.println("The point lies in First Quadrant");
        
        }else if(x<0 && y>0){
           System.out.println("The point lies in Second Quadrant");
        
        }else if(x<0 && y<0){
            System.out.println("The point lies in Third Quadrant");
        
        }else{
            System.out.println("The point lies in Fourth Quadrant");
        }
        sc.close();
    }
    
}
