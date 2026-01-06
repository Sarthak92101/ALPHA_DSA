package Backtracking;


public class GridWays {
  public static int ways(int i, int j, int n, int m){
     //Base
    if(i==n-1 && j==m-1){   //condition for last cell
      return 1;
    }else if(i==n || j==n){  //Boundry crosaa condition
      return 0;
    }  
    //Kaam
    int w1=ways(i+1, j, n, m);
    int w2=ways(i, j+1, n, m);
    return w1+w2;
    
  }

  //Time Complexities= O(2^(n+m))
  public static void main(String[] args) {
      int n=4,m=4;  
    
      System.out.println(ways(0, 0, n, m));
  }
}
