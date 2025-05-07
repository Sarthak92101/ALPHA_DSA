package Recursion.Practice;

public class NumbTostring {
  static String digit[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};

  public static void No(int number){
    if(number==0){
      return;
    }
    int last=number%10;
    No(number/10);
    System.out.println(digit[last]);
    
  }

  public static void main(String[] args) {
    No(1234);
  }
}
