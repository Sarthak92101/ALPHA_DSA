package StartingNewLB.Array;

import java.util.ArrayList;

public class Intersection {
  static ArrayList<Integer> Intersection(int arr1[], int arr2[]) {
    ArrayList<Integer> list = new ArrayList<>();

    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr2.length; j++) {
        if (arr1[i] == arr2[j]) {
          list.add(arr1[i]);
          break;
        }
      }
    }
    return list;

  }


  public static void main(String[] args) {
    int arr1[] = { 1, 2, 3, 4, 5, 8 };
    int arr2[] = { 2, 5, 6, 7, 8 ,8};
    System.out.println(Intersection(arr1, arr2));
  }
}
