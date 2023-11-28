import java.util.*;
public class Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        
        System.out.print("Enter no of rows: ");
        int r1=sc.nextInt();
        System.out.print("Enter no of column: ");
        int c1=sc.nextInt();
        System.out.println();
        int[][] a = new int[r1][c1];
        for(int i=0;i<r1;i++) {
            for(int j=0;j<c1;j++) {
                System.out.print("Enter element: ");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        for(int i=0;i<r1;i++) {
            for(int j=0;j<c1;j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
        
        System.out.println();
        System.out.print("Enter no of rows: ");
        int r2=sc.nextInt();
        System.out.print("Enter no of column: ");
        int c2=sc.nextInt();
        System.out.println();
        int[][] b = new int[r2][c2];
        for(int i=0;i<r2;i++) {
            for(int j=0;j<c2;j++) {
                System.out.print("Enter element: ");
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        for(int i=0;i<r2;i++) {
            for(int j=0;j<c2;j++) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println();
        int[][] c = new int[r1][c2];
        for(int i=0;i<r1;i++) {
            for(int j=0;j<c2;j++) {
                for(int k=0;k<r2;k++) {
                    c[i][j] += a[i][k] * b[k][j]; 
                }
            }
        }
        
        System.out.println("Resulting matrix: ");
        for(int i=0;i<r1;i++) {
            for(int j=0;j<c2;j++) {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
