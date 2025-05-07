package Backtracking;

public class Soduko {
  public static boolean isSafe(int soduko[][],int row,int col,int digit){
    //coloumn
  for(int i=0; i<=8; i++){
    if(soduko[i][col]==digit){
      return false;
    }
  }
  //Row
  for(int j=0; j<=8; j++){
    if(soduko[row][j]==digit){
      return false;  
    }
  }

  //Grid
   int sr=(row/3)*3;
   int sc=(col/3)*3;

   for(int i=sr; i<sr+3; i++){
    for(int j=sc; j<sc+3; j++){
      if(soduko[i][j]== digit){
        return false;
      }
    }
   }

return true;
  }
  public static boolean SodukoSolver(int soduko[][], int row, int col) {
if(row==9){
  return true;
}
    int nextRow = row, nextcol = col + 1;
    if (col + 1 == 9) {
      nextRow = row + 1;
      nextcol = 0;
    }

if(soduko[row][col]!=0){
  return SodukoSolver(soduko, nextRow, nextcol);  
}


    for(int digit=1; digit<=9; digit++){
      if(isSafe(soduko,row,col,digit)){
        soduko[row][col]=digit;
        if(SodukoSolver(soduko, nextRow, nextcol)){
          return true;
        }
        soduko[row][col]=0;
      }
    }
    return false; 
  }

  public static void print(int soduko[][]){
    for(int i=0; i<9; i++){
      for(int j=0; j<9; j++){
        System.out.print(soduko[i][j]+"  ");
      }
System.out.println(  );
    }
  }

  public static void main(String[] args) {
    int soduko[][] = { { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
        { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
        { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
        { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
        { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
        { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
        { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
        { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
        { 8, 2, 7, 0, 0, 9, 0, 1, 3 }
    };

    if(SodukoSolver(soduko, 0, 0)){
      System.out.println("Solution exist");
      print(soduko);
    }else{
      System.out.println("Solotion does'nt exist");
    }
  }
}