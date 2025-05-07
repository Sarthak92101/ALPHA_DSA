package Backtracking;

public class Subset {
  public static void print(String str, String ans, int i) {
    // base
    if (i == str.length()) {
      if(ans.length()==0){
        System.out.println("null");
      }else{  
        System.out.print(ans);
      }
      
      return;
    }
    // Recusrion
    // yes
    print(str, ans + str.charAt(i), i + 1);
    // No
    print(str, ans, i + 1);
  }

  public static void main(String[] args) {
    String str = "abc";
    print(str, " ", 0);

  }
}
