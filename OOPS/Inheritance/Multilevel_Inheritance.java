package OOPS.Inheritance;


public class Multilevel_Inheritance {
  public static void main(String[] args) {
    FishChild Nonnu=new FishChild();
    Nonnu.legs=3;
    System.out.println( Nonnu.legs); 
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
  int legs;
  void finks(){
    System.out.println("fish finks"); 
  }
}
class FishChild extends Fish{
  String name;
}
