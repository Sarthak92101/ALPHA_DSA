package ArrayList;

import java.util.ArrayList;

public class Pair2Sum {

  public static boolean Sum(ArrayList<Integer> list, int target) {
    int bp = 0;
    int n = list.size();
    for (int i = 0; i < list.size() - 1; i++) {
      if (list.get(i) > list.get(i + 1)) {
        bp = i;
        break;
      }
    }

    int lp = bp + 1; // SMALLEST ELEMENT
    int rp = bp; // LARGEST ELEMENT

    while (lp != rp) {
      if (list.get(lp) + list.get(rp) == target) {
        return true;
      }
      if (list.get(lp) + list.get(rp) < target) {
        lp = (lp + 1) % n;
      } else {
        rp = (n + rp - 1) % n;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(11);
    list.add(6);
    list.add(7);
    list.add(8);
    list.add(9);
    int target = 16;
    System.out.println(Sum(list, target));

  }
}
