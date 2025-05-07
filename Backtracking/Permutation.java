package Backtracking;

public class Permutation {
  public static void print(String str, String ans) {
    // Base case
    if (str.length() == 0) {
      System.out.println(ans);
      return;
    }

    // Kaam
    for (int i = 0; i <str.length(); i++) {
      char chr = str.charAt(i);
      str = str.substring(0, i) + str.substring(i + 1);
      print(str, ans + chr);
    }
  }
 
  public static void main(String[] args) {
    String str = "abc";
    print(str, "");
  } 
}
