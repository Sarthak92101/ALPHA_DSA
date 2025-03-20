package Recursion;

public class RecusrionBasics {
  public static void Decreasing(int n){
    if(n==1){
      System.out.print(n);
      return;
    }
    Decreasing(n-1);
     System.out.print(n+" ");
     
  }


  // public static void Increasing(int n){
  //   if(n==10){
  //     System.out.println(n);
  //     return;
  //   }
  //   System.out.println(n);
  //   Increasing(n+1);
  // }
  public static void main(String[] args) {
    int n=10 ;
    Decreasing(n);
    // Increasing(n);
  }
}
