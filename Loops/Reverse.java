public class Reverse {
  public static void main(String[] args) {
    int n=25072002;


    while(n>0){
     int lastdigit=n%10;
     System.out.print(lastdigit + " ");
     n=n/10;
    }
    System.out.println();
  }
}
