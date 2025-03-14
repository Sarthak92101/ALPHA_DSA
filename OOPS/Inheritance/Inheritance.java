package OOPS.Inheritance;

public class Inheritance {
  public static void main(String[] args) {
    Fish shark=new Fish();
    shark.eat();
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

class Fish extends Animal{
  void finks(){
    System.out.println("fish finks"); 
  }
}