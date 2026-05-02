package StartingNewLB.Array;

public class PositiveNegativeSum {
  static void Sum(int arr[]) {
    int positive = 0;
    int negative = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > 0) {
        positive += arr[i];
      } else {
        negative += arr[i];
      }
    }
    System.out.println("Positives : " + positive);
    System.out.println("Negative : " + negative);
  }

  public static void main(String[] args) {
    int arr[] = { 2, -3, -1, 4, 6, -9 };
    Sum(arr);
  }
}
