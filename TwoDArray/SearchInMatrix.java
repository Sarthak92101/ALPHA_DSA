package TwoDArray;

public class SearchInMatrix {
    public static boolean Search(int matrix[][], int key) {
        int row = 0;
        int col = matrix[0].length - 1;
        // for (int i = 0; i <= n; i++) {
        // for (int j = 0; j <= m; j++) {
        // if(matrix[i][j] == key) {
        // System.out.println("Key present at position " + (i) + "," + (j));
        // }else{
        // System.out.println("Key not available");

        // }
        // }
        // }
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("Key present at (" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("Key not found ");
        return false;

    }
//O(n+m) Time complexity
    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40 },
                           { 15, 25, 35, 45 },
                           { 27, 29, 37, 48 },
                           { 32, 33, 39, 50 } };
        int key = 33;
        Search(matrix, key);
    }
}
