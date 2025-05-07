package OOPS.Inheritance;

class Hybrid {
  public static void main(String[] args) {
    Shark s1=new Shark();
  s1.color();
  }
  
}
class Animal{
  String color;
  void eats(){
    System.out.println("Eats");
  }
}

class Fish extends Animal{
  String name;
  void color(){
    System.out.println("Fish color");
  }
}
class Shark extends Fish{
  int type;
  
}