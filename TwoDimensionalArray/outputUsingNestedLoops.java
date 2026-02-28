import java.util.Scanner;
public class outputUsingNestedLoops {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int[][] arr = new int[4][3];

        int m = arr.length;
        int n = arr[0].length;
        System.out.println(n);
        //Input of 2D array
        for(int i = 0;i<3;i++){
            for(int  j = 0;j<3;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        //output of 2d array
        for(int i = 0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
