package OOPS;

public class Super_Keyword {
  public static void main(String[] args) {
    Horse h=new Horse();
  }
}
//Firstly constructor of animal will called because we declares super keyword inside horse constructor so Hrse's parent class will run first  
class Animal{
  Animal(){
    System.out.println("constructor of animal");
  }
}
class Horse extends Animal{
  Horse(){
    super();
    System.out.println("Constructor of Horse");
  }
}
