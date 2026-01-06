package Test;

public class Throw {
  int i = 20;
  int j = 0;

  public void test() {
    try {
      j = 18 / i;
      if (j == 0)
        throw new ArithmeticException();
    } catch(ArithmeticException e) {
      j = 18 / 1;
      System.out.println("Default answer");
    }
    System.out.println(j);
  }

}
