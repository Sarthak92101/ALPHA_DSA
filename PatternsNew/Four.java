public class Four {
  public static void main(String[]args){
   int  ch=1; 
   int n=10;
   for(int i=1; i<=n; i++){
    for(int j=1; j<=i; j++){
      System.out.print(ch);
      ch++;
    }
    System.out.println();
   }

  }
}
