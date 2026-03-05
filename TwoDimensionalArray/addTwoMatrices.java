import java.util.Scanner;

public class addTwoMatrices {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int[][] a = new int[4][4];
         int[][] b = new int[4][4];
        int m = a.length;
        int n = b[0].length;
        int[][] res = new int[m][n];

        for(int i = 0;i<m;i++){
            for(int j=0;j<n;j++){
                res[i][j]= a[i][j]+b[i][j];
            }
        }
        System.out.print(res+" ");
    }
}
