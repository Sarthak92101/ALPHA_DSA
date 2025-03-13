package TwoDArray;

public class SpiralMatrix {
    public static void Spiral(int matrix[][]) {
        int SRow = 0;
        int ERow = matrix.length - 1;
        int SCol = 0;
        int ECol = matrix[0].length - 1;

        while (SRow <= ERow && SCol <= ECol) {
            // TOP
            for (int j = SCol; j <= ECol; j++) {
                System.out.print(matrix[SCol][j]+" " );
            }
            //RIGHT
            for (int i = SRow+1; i <= ERow; i++) {
                System.out.print(matrix[i][ERow]+" ");
            }
            //BOOTOM
            for (int j = ECol-1; j >=SCol; j--) {
                System.out.print(matrix[ERow][j]+" ");
            }
            //LEFT
            for (int i = ERow-1; i >= SRow+1; i--) {
                System.out.print(matrix[i][SCol]+" ");
            }
            SRow++;
            SCol++;
            ERow--;
            ECol--;
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                           { 5, 6, 7, 8 },
                           { 9, 10, 11, 12 },
                           { 13, 14, 15, 16 } };
        Spiral(matrix);
    }
}
