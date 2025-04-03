package Test;
//final => varibale,method,class

class Cal {
  public final void show() {  // Final method cannot be overridden
    System.out.println("By Sarthak");
  }

  public void add(int a, int b) {
    System.out.println(a + b);
  }
}

class AdvCal extends Cal {
  // public void show() { ❌ Error: Cannot override final method
  //   System.out.println("By XYZ");
  // }
}

public class Final {
  public static void main(String[] args) {
    AdvCal obj = new AdvCal();
    obj.show();  // Calls the method from `Cal`
    obj.add(1, 2);
  }
}



//final int x = 10; 
//x = 20;  // ❌ Error: cannot assign a new value to a final variable.


// final class Cal {
//   public void show() {
//     System.out.println("By Sarthak");
//   }
// }

// class AdvCal extends Cal {  // ❌ Error: Cannot extend a final class
// }

