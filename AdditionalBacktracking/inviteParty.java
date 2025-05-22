package AdditionalBacktracking;

public class inviteParty {
  public static int Party(int n){
    if(n<=1){
      return 1;
    }

    //kaam
    int ways1= Party(n-1);
    int ways2= (n-1) *  Party(n-2);

    return ways1+ways2;    
  }
  public static void main(String[] args) {
    int n=3;
    System.out.println(Party(n));
  }
}
