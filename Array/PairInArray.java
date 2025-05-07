package Array;

public class PairInArray {
    public static void Pair(int array[]) { //NESTED LOOP
        for (int i = 0; i < array.length; i++) {
            for (int j = i +1; j < array.length; j++) {
                //if (j > i) {
                    System.out.print("(" + array[i] + "," + array[j] + ")");
               // }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int array[] = { 2, 4, 6, 8, 10 };
        Pair(array);
    }
}
