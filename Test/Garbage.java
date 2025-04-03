package Test;

public class Garbage {
  public void finalize(){
    System.out.println("Garbage Collection");
  }

  public static void main(String[] args) {
    Garbage obj1=new Garbage();
    Garbage obj2=new Garbage();
    obj1=null; 
    obj2=null;
    System.gc();
    
  }
}
