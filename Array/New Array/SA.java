
public class SA {
  public static void SubArray(int arr[]) {
   
    
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        int curr=0;
        System.out.print("(" + arr[i] + "," + arr[j] + ")");

      }
      System.out.println();
    }
    System.out.println(tp);
  }

  public static void main(String[] args) {
    int arr[] = { 2, 4, 6, 8, 10 };

    SubArray(arr);
  }
}
