import java.util.*;

public class LS {
  public static int LinearSearch(int arr[], int key) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == key) {
        return i;
      }
    }
    return -1;

  }

  public static void main(String[] args) {
    int arr[] = { 4, 2, 7, 1, 9 };
    int key = 1;
    int index = LinearSearch(arr, key);
    if (index == -1) {
      System.out.println("Key not found");
    } else {
      System.out.println("Key found at index :" + index);
    }
  }
}
