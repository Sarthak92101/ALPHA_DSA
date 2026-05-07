package StartingNewLB.Array;

public class ArrayShift {
  static void Shift(int arr[]) {
    int temp = arr[arr.length - 1];
    for (int i = arr.length - 1; i > 0; i--) {
      arr[i] = arr[i - 1];
    }
    arr[0] = temp;
  }

  public static void main(String[] args) {
    int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
    Shift(arr);
    for(int a:arr){
      System.out.print(a + " " );
    }
  }
}
