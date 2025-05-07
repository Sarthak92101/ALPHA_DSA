package OOPS.Abstraction;

public class Interfaces {
  public static void main(String[] args) {
    queen q=new queen();
    q.moves();
    Bear B=new Bear();
    B.Treats();
    B.eatsgrass();
  }
}

interface chessPlayer {
void moves();  //Bydefault it is public and abstract  
}

class queen implements chessPlayer{
  public void moves(){
    System.out.println("up,down,left,right,diagnol");
  }
}

class Rook implements chessPlayer{
  public void moves(){
    System.out.println("up,down,left,right");
  }
}

class king implements chessPlayer{
 public void moves(){
    System.out.println("up,down,left,right,diagnol(By 1 step)");
  }
}


//MULTIPLE INHERITANCE EXAMPLE

interface Herbivores{
void eatsgrass();
}
interface Carnivores{
  void Treats();
}

class Bear implements Herbivores, Carnivores{
  public void eatsgrass(){
    System.out.println("Herbivores");
  }

  public void Treats(){
    System.out.println("Eats");
  }
}

