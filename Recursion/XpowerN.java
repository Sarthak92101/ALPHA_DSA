package Recursion;

public class XpowerN {
  public static int Power(int x, int n) {
    if (n == 0) {
      return 1;
    }
    return x * Power(x, n - 1);
  }

  public static int OptimisedPower(int x, int n) {
    int half=OptimisedPower(x, n/2);
    int halfPower=half * half;
    if(n%2==0){
      return halfPower;
    }else{
      return x*halfPower;
    }
  }

  public static void main(String[] args) {
System.out.println(Power(2, 3));
  }
}
