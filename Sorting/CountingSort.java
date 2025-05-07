package Sorting;
//REPEAT THIS SORTING ALGORITHM
public class CountingSort {
    public static void Count(int array[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            largest = Math.max(largest, array[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            while (count[i] > 0) {
                array[j] = i;
                j++;
                count[i]--;
            }
        }

    }

    public static void main(String[] args) {
        int array[] = { 5, 4, 1, 3, 2, 3, 1, 5, 6, 4 };
        Count(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
