package StartingNewLB.Array;

public class Reverse {
  static void Reverse(int arr[]) {
    int i = 0, j = arr.length - 1;
    while (i < j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    }
    for (int k :arr) {
      System.out.println(k);
    }

  }

  public static void main(String[] args) {
    int arr[] = { 2, 4, 6, 8, 9 };
    Reverse(arr);

  }
}
