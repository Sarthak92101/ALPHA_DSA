
public class PS {
  public static void PrintSubarray(int arr[]) {
    int curr = 0;
    int maxSum = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        System.out.print("{");
        curr = 0;
        for (int k = i; k <= j; k++) {
          curr += arr[k];
        }
        System.out.print(curr);
        if(maxSum<curr){
          maxSum=curr;
        }
        System.out.print("}");
        System.out.print(",");
      }
      System.out.println();
    }
    System.out.println(maxSum);
  }

  public static void main(String[] args) {
    int arr[] = { 2, 4, 6, 8, 10 };
    PrintSubarray(arr);
  }
}
