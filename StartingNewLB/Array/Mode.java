package StartingNewLB.Array;

import java.util.*;

public class Mode {
  static int Mode(int arr[]) {
    HashMap<Integer, Integer> freq = new HashMap<>();

    for (int num : arr) {
      freq.put(num, freq.getOrDefault(num, 0) + 1);

    }
  //   for (int i : freq.keySet()) {
  //     System.out.println(i + "->" + freq.get(i));
  //   }
  // }

  

  public static void main(String[] args) { 
    int arr[] = { 5, 2, 3, 2, 3, 1, 2, 9 };
    Mode(arr);

  }
}
