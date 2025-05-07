package DivideAndConquere;

public class MergeSort {
  public static void PrintArr(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void Sort(int arr[], int si, int ei) {
    if (si >= ei) {
      return;
    }
    int mid = si + (ei - si) / 2;
    Sort(arr, si, mid); // left part
    Sort(arr, mid + 1, ei);// right part
    merge(arr, si, mid, ei);
  }

  public static void merge(int arr[], int si, int mid, int ei) {
    int temp[] = new int[ei - si + 1];
    int i = si; // iterator for left part
    int j = mid + 1;// iterator for right part
    int k = 0; // iterator for temp
    while (i <= mid && j <= ei) {
      if (arr[i] < arr[j]) {
        temp[k] = arr[i];
        i++;
      } else {
        temp[k] = arr[j];
        j++;
      }
      k++;
    }
    // Left part
    while (i <= mid) {
      temp[k++] = arr[i++];
    }
    // right part
    while (j <= ei) {
      temp[k++] = arr[j++];
    }
    // copy arr to orignal array
    for (k = 0, i = si; k < temp.length; k++, i++) {
      arr[i] = temp[k];
    }

  }

  public static void main(String[] args) {
    int arr[] = { 6, 3, 9, 5, 2, 8 };
    Sort(arr, 0, arr.length - 1);
    PrintArr(arr);
  }
}
