package StartingNewLB.Array;

public class Avg {
     static double getAvg(int[] arr) {
    double sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum = sum + arr[i];
    }
    return (double) sum / arr.length; // FIX
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 2 };
    System.out.println(getAvg(arr));
  }
}