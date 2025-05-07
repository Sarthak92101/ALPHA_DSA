package TwoDArray;

import java.util.*;

public class Matrix {
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = 3, m = 3;
        System.out.println("Enter the element for 3X3 matrix");
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();

            }
        }
        sc.close();
        System.out.println("Matrix is ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }

    }
}
