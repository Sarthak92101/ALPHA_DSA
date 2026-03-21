import java.util.*;

public class BS {
  public static int BinarySearch(int arr[], int key) {
    int start = 0;
    int end = arr.length - 1;

while (start <= end) {
  int mid = (start + end) / 2;
  if (arr[mid] == key) {
    return mid;
  } else if (arr[mid] < key) {
    start = mid + 1;
  } else {
    end = mid - 1;
  }
}
return -1;

  }

  public static void main(String[] args) {

    int arr[] = { 2, 4, 6, 8,10 };
    int key = 8;
    int index=BinarySearch(arr, key);
    if(index== -1){
      System.out.println("Element not found in array");
    }else{
          System.out.println("Element found at index :"+index);
    }

  }
}
