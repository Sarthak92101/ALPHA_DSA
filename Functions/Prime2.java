public class Prime2 {

    public static boolean isPrime(int n) {
      boolean isPrime = true;
  
      if (n == 2) {
        return true;
      }
      for (int i = 2; i <= n - 1; i++) { // i<Math.sqtr(n)//Optimised code
        if (n % i == 0) {
          isPrime = false;
          break;
        }
      }
      return isPrime;
    }
  
    // PRINT ALL PRIME NUMBER IN RANGE
  
    public static void PrimesInRange(int n) {
      for (int i = 2; i < n; i++) {
        if (isPrime(i)) {
          System.out.print(i + ",");
        }
      }
  
    }
  
    public static void main(String[] args) {
      System.out.println(isPrime(2));
      PrimesInRange(50);
    }
  }
  