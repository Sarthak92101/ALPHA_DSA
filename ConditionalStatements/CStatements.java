package ConditionalStatements;

import java.util.Scanner;

public class CStatements {
  public static void main(String[] args) {
    // // int A = 1;
    // // int B=2;
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter value for A");

    // int A = sc.nextInt();
    // System.out.println("Enter value for B");

    // int B = sc.nextInt();

    // sc.close();

    // if (A > B) {
    //   System.out.println("A is greater");
    // } else {
    //   System.out.println("B is greater");
    // }
  
Scanner sc =new Scanner(System.in);
System.out.println("Enter Number : ");
int  Number= sc.nextInt();
sc.close();
if(Number%2==0){
  System.out.println("Even Number");
}
else{
  System.out.println("Odd Number");
}

}
}

