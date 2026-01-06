public class Prime {
  public static void main(String[] args) {
    int n = 6;

    if (n == 2) {
      System.out.println("Prime");
    } 
      boolean isPrime = true;
      for (int i = 2; i <= n - 1; i++) {
        if (n % i == 0) {
          isPrime = false;

        }
      }

    
    if (isPrime == true) {
      System.out.println("N is prime");
    } else {
      System.out.println("N is not prime");
    }
  }
}
