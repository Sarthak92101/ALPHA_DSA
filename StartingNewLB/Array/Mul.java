package StartingNewLB.Array;

public class Mul {
  static int[] Multiply(int[] arr) {
    int newArray[] = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      int element = arr[i];
      int newElement = element * 10;
      newArray[i] = newElement;
    }
    return newArray;
  }

  static void  LinearSearch(int arr[], int key) {
    for(int i=0; i<arr.length;i++){
      if(arr[i]==key){
        System.out.println("target found at index : "+ i);
      }
    }
  
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2,3,5,4 };
    // int ans[] = Multiply(arr);
    // for (int i = 0; i < ans.length; i++) {
    //   System.out.print(ans[i] + " ");
    // }

    LinearSearch(arr, 4);
  }
}
