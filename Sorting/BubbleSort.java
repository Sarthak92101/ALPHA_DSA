package Sorting;

public class BubbleSort {
    public static void bubblesort(int array[]) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

    }

    public static void PrintArray(int array[]) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int array[] = { 5, 4, 1, 3, 2 };
        bubblesort(array);
        PrintArray(array);

    }
}
