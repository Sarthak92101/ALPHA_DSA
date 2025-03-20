package Recursion;

public class Factorial {
  public static int Factorial1(int n) {
    if (n == 0) {
      return 1;
    }
    int fn = n * Factorial1(n - 1);
    return fn;
  }

  public static void main(String[] args) {
    int n = 3;
    System.out.println(Factorial1(n));
  }

}
