package Special_Patterns;

import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n:");
        int n = sc.nextInt();

        for(int i =1 ; i<=n;i+=1){
            for(int j=1;j<=i;j++){
                System.out.print(j);

            }   
        System.out.println();     }
    }
    
}
