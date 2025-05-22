package AdditionalBacktracking;

public class Tiles {

  public static int tiles(int n,int m){
    //Base Case
     if(n==m){
        return 2;
     }
     if(n<m){
      return 1;
     }

    //kaam
    int vertical=tiles(n-m,m);
    int horizontal=tiles(n-1,m);  
    return vertical + horizontal;
  }
   public static void main(String[] args) {
    int n=2,m=3;
    System.out.println(tiles(n, m));
  }
}
