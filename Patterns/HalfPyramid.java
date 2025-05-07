public class HalfPyramid {
    public static void Half_Pyramid(int n, int m) {
        // OUTER_LOOP
        for (int i = 1; i <= n; i++) {
            // INNER_LOOP
            //SPACES
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //STARTS
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        Half_Pyramid(10, 7);
    }
}
