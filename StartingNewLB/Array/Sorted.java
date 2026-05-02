package StartingNewLB.Array;

public class Sorted {
  static int Sorted(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i + 1] <= arr[i]) {
        return arr[i + 1];
      }
    }
    return  -1;
  }

  public static void main(String[] args) { 
    int arr[] = { 2, 3, 9, 5, 13 };
    System.out.println(Sorted(arr));
  }
}
