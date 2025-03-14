package OOPS.Inheritance;
public class Hierarchial_inheritance {
  public static void main(String[] args) {
    Mammal S1=new Mammal();
    S1.eat();
  }
}

class Animal{
  String color;
  void eat(){
    System.out.println("Eats");
  }
  void breathe(){
    System.out.println("Animal breathe");
  }
}
class Bird extends Animal{
  void Voice(){
    System.out.println("Bird");
  }
}
 class Mammal extends Animal{
  void walk(){
    System.out.println("MAmmal");
  }
 }
 class Fish extends Animal{
  void swim(){
    System.out.println("swim");
  }
 }
 //Now all the objects can use the class animal