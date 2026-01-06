package LinkedList2;
import java.util.LinkedList;
public class Frameworks {
  public static void main(String[] args) {
    //Create 
LinkedList<Integer> ll =new LinkedList<>();
    //add
ll.addLast(1);
ll.addLast(3);
ll.addFirst(2);
System.out.println(ll);
    //Remove 
    ll.removeLast();
    ll.removeFirst();
    System.out.println(ll);
  }
}
