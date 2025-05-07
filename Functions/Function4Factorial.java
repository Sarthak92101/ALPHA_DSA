public class Function4Factorial {
  public static int factorial(int n){
    int f=1;
    for(int i=1; i<=n; i++){
      f=f*i;
    }
    return f;
  }
  public static void main(String[] args) {
    int Fac=factorial(5);
    System.out.println(Fac);
    
  }
}
