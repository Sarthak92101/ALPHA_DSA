package OOPS.Polymorphism;

public class Method_Overriding {
  public static void main(String[] args) {
    Horse h=new Horse();
   h.eat();
  }
}

class Animal{
  void eat(){
    System.out.println("Eats grass");
  }
}
class Horse extends Animal{
  void eat(){
    System.out.println("Horse eats grass");
  }
}
