package StartingNewLB.Array;

import java.util.ArrayList;

public class ExtremeElements {
  static void Elements(int arr[]) {
    int i = 0;
    int j = arr.length - 1;

    while (i < j) {
        System.out.print(arr[i] + " " + arr[j] + " ");
        i++;
        j--;
    }
}

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 6 };
    Elements(arr);
  }
}
