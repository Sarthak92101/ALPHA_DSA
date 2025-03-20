package Recursion;

public class FrirndPairing {
  public static int Friend(int n){
    if(n==1 || n==2){
      return n;
    }

    //choice -> Single
    int fnm1=Friend(n-1);
    //choice -> Pair
    //n-1 -> Pair choice, n-2 -> 1 pair ways
    int fnm2=Friend(n-2);
    return fnm1+((n-1)*fnm2);

  }
  public static void main(String[] args) {
    System.out.println(Friend(6));
  }
}
