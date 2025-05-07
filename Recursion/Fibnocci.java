package Recursion;

public class Fibnocci {
  public static int Sum(int n) {
    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }

    int fnm1 = Sum(n - 1);
    int fnm2 = Sum(n - 2);
   int fn=fnm1+fnm2;
   return fn;
  }

  public static void main(String[] args) {
    int n = 3;
    System.out.println(Sum(n));
  }
}
