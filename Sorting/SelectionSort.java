package Sorting;

public class SelectionSort {
    public static void Selection(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < array.length ; j++) {
                if (array[minPos] > array[j]) {
                    minPos = j;
                }
            }
            //SWAP
            int temp = array[minPos];
            array[minPos] = array[i];
            array[i] = temp;
        }
       
    }
    public static void PrintArray(int array[]) {
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]);
        }
        System.out.println();
    }
    

    public static void main(String[] args) {
        int array[] = { 5, 4, 1, 3, 2 };
        Selection(array);
        PrintArray(array);
    }
}
