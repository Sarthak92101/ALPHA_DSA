import java.util.Scanner;

public class Function2 {
  public static int Sum(int a, int b){ //here a and b are parameters or formal parameters
    System.out.println(a+b);
    return 0;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println("Sum is:");
    Sum(a,b);  // here a and b are arguments
    sc.close();
  }
}
