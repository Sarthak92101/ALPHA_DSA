public class FunctionOverloading {
  public static int Sum(int a, int b) {
    int sum = a + b;
    System.out.println(sum);
    return 0;
  }

  public static int Sum(double a, double b) {
    double sum = a + b;
    System.out.println(sum);
    return 0;
  }

  public static void main(String[] args) {
    Sum(1, 2);
    Sum(1.2, 2.1);

  }
}