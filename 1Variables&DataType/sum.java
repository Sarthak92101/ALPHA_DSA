import java.util.*;

public class sum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of A:");
    int A = sc.nextInt();
    System.out.println("Enter the value of B:");
    int B = sc.nextInt();
    int sum = A + B;
    System.out.print(sum);
    sc.close();
  }
}
