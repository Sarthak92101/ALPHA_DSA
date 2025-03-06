package ConditionalStatements;



public class ITaxCalculator {
  public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter your income");
    // int Income = sc.nextInt();
    // sc.close();

    // if (Income < 5) {
    //   System.out.println("0% IncomeTax");
    // } else if (Income >= 5 && Income <= 10) {
    //   System.out.println("20% Tax");
    // } else {
    //   System.out.println("30% Tax");
    // }
   int A=11;
   int B=2;
   int C=3;

   if(A>B && A>C){
    System.out.println("A is greatest");
   }
   else if(B>A && B>C){
    System.out.println("B is greatest");
   }else{
    System.out.println("C is greatest");
   }
  }
}
