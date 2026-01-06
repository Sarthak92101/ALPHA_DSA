package ArrayList;

import java.util.ArrayList;

public class ContainerWithMostWater {

  // public static int StoreWater(ArrayList<Integer> list) {
  // int maxWater = 0;

  // for (int i = 0; i < list.size(); i++) {
  // for (int j = i + 1; j < list.size(); j++) {
  // int height = Math.min(list.get(i), list.get(j));
  // int width = j - i;
  // int currWater = height * width;
  // maxWater = Math.max(maxWater, currWater);
  // }
  // }
  // return maxWater;

  // }

  // 2 POINTER APPROACH
  public static int StoreWater(ArrayList<Integer> list) {
    int maxWater = 0;
    int lp = 0;
    int rp = list.size() - 1;
    while (lp < rp) {
      // Calculate Water area
      int height = Math.min(list.get(lp), list.get(rp));
      int width = rp - lp;
      int currWater = height * width;
      maxWater = Math.max(maxWater, currWater);
      // Update ptr
      if (list.get(lp) < list.get(rp)) {
        lp++;
      } else {
        rp--;
      }
    }
    return maxWater;
  }

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(8);
    list.add(6);
    list.add(2);
    list.add(5);
    list.add(4);
    list.add(8);
    list.add(3);
    list.add(7);

    System.out.println(StoreWater(list));
  }
}
