package Recursion;

public class TilingProblem {
  public static int Print(int n){
    //Base case
    if(n==0 || n==1){
      return 1;
    }
    //vertical
    int fnm1=Print(n-1);
    //Horizontal
    int fnm2=Print(n-2);

    int TotalWays=fnm1+fnm2;
    return TotalWays;
  }
  public static void main(String[] args) {
    System.out.println(Print(5));
  }
}
