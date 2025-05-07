package Test;

public class Throws {
  public static void main(String[] args) {
    try {
        divide(10, 0);
    } catch (ArithmeticException e) {
        System.out.println("Exception caught: " + e.getMessage());
    }
}

// This method declares that it may throw an ArithmeticException
public static void divide(int a, int b) throws ArithmeticException {
    if (b == 0) {
        throw new ArithmeticException("Cannot divide by zero");
    }
    System.out.println("Result: " + (a / b));
}
}
