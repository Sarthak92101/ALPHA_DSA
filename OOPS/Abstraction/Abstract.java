package OOPS.Abstraction;

public class Abstract {
  public static void main(String[] args) {
    chicken c = new chicken();
    c.walk();
    Horse h = new Horse();
    h.walk();
    h.eat();
    h.changeColor();  
    System.out.println(h.color);
  

    // Animal A=new Animal(); //It will give error because we can'nt create object
    // of Abstract class


length l=new length();
// size -> height -> length
  }
}

abstract class Animal { // Abstract classes are those classes inside which we can't create objects
  String color;

  Animal() {
    color = "brown";  
    //Constructor this constructor bydefault set the color of all the animal brown
  }

  void eat() {
    System.out.println("eat");
  }

  abstract void walk(); // Abstract methods are those methods who does't have implementation

}

class Horse extends Animal {
  void changeColor() {
    color = "dark Brown";
    
  }

  void walk() {
    System.out.println("Horse walk");
    // we have to implement walk method here because Horse is sub class and walk in
    // his parent class is abstract
  }
}

class chicken extends Animal {
  void changeColor() {
    color = "white";
  }

  void walk() {
    System.out.println("Chicken walk");
  }
}


//NEW TOPIC
class Size{
  Size(){
    System.out.println("Size constructor called");
  }
}
class height extends Size{
  height(){
    System.out.println("Height contrsuctor called");
  }
}

class length extends height{
  length(){
    System.out.println("Length constructor called");
  }
}