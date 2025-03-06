package ConditionalStatements;

import java.util.*;


public class practice {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number");
  int No = sc.nextInt();

  if(No>0){
System.out.println("Positive number");
  }else if(No==0){
    System.out.println("Number is 0");
  }else{
    System.out.println("Number is negative");
  }
sc.close();
  }
}
