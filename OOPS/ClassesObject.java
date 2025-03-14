package OOPS;
 
public class ClassesObject {
  public static void main(String[] args) {
    Pen p1 = new Pen();
    p1.setColor("Red");
    System.out.println(p1.getcolor());
    p1.setTip(5);
    System.out.println(p1.getTip());

    // BankDetails myacc= new BankDetails();
    // myacc.username="Sarthak Sharma";
    // myacc.password=1234;

  }

}

// class BankDetails{
// public String username;
// private int password;
// }

class Pen {
  private String color;
  private int tip;

  String getcolor() {
    return this.color;
  }

  int getTip() {
    return this.tip;
  }

  void setColor(String newColor) {
    color = newColor;

  }

  void setTip(int tipsize) {
    tip = tipsize;
  }
}
