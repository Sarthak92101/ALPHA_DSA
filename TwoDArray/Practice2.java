package TwoDArray;

public class Practice2 {
    public static int  Nums(int array[][]) {
        int sum = 0;
        for (int i = 0; i < array[0].length; i++) {
            sum += array[1][i];
        }
        return sum;

    }

    public static void main(String[] args) {
        int array[][] = { { 1, 4, 9 },
                { 11, 4, 3 },
                { 2, 2, 3 } };
        System.out.print(Nums(array));
    }

}
