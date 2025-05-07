package Recursion;

public class BinaryStringProblem {
  public static void PrintString(int n, int lastdigit, String str){
    if(n==0){
     System.out.println(str);
     return;
    }
    PrintString(n-1, 0, str+"0");
    //Kaam
    if(lastdigit==0){
      PrintString(n-1, 1, str+"1");
    }
  }
  public static void main(String[] args) {
 PrintString(4, 0, "");
  }
}
