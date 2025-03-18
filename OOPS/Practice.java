package OOPS;

public class Practice {
  public static void main(String[] args) {
    Vehicle v=new car();
    v.print1();

    Vehicle O=new Vehicle();
    O.print();
  }
}
class Vehicle{
  void print(){
    System.out.println("Base class");
  }
}
class car extends Vehicle{
  void print1(){
    System.out.println("Derived class");
  }
}
