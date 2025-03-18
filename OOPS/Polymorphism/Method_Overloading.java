package OOPS.Polymorphism;

public class Method_Overloading {
  public static void main(String[] args) {
    Calculator cal=new Calculator();
    System.out.println(cal.sum(1,2));
    System.out.println(cal.sum(1.2f,2.3f));
    System.out.println(cal.sum(1,2,3));
  }
}
//METHOD OVERLOADING means multiple functions with same name but diffrent parameters
class Calculator{ 
  int sum(int a, int b){
    return a+b;
  }

  float sum(float a, float b){
    return a+b;
  }
  int sum(int a, int b, int c){
    return a+b+c; 
  }
}


