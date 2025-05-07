package Backtracking;
public class Arrays {
  public static void ChangeArr(int arr[], int i, int val) {
    // base
    if (i == arr.length) {
      print(arr);
      return;
    }
    // kaam
    arr[i] = val;
    ChangeArr(arr, i + 1, val + 1);
    arr[i] = arr[i] - 2;//Backtracking Step

  }

  public static void print(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    } 
  }

  public static void main(String[] args) {
    int arr[] = new int[5];
    ChangeArr(arr, 0, 1);
    print(arr);
  }
}
