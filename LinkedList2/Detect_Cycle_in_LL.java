package LinkedList2;

public class Detect_Cycle_in_LL {
  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node head;
  public static Node tail;
  public static int size;

  // FLOY'Ds CYCLE FINDING ALGORITHM
  public static boolean isCycle() {
    Node slow = head;
    Node fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) { // Cycle found
        return true;
      }
    }
    return false; // CYCLE NOT FOUND
  }

  public static void removeCycle() {
    // Detect Cycle
    Node slow = head;
    Node fast = head;
    boolean cycle = false;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        cycle = true;
        break;
      }
    }
    if (cycle == false) {
      return;
    }
    // Find meting point
    slow = head;
    Node prev = null;
    while (slow != fast) {
      prev = fast;
      slow = slow.next;
      fast = fast.next;
    }

    // remove cycle -> fast.next=null.
    prev.next = null;
  }

  public static void main(String[] args) {
    head = new Node(1);
    Node temp=new Node(2);
    head.next=temp;
    head.next.next = new Node(3);
    head.next.next.next = temp;
    // 1->2->3->1
    System.out.println(isCycle());
    removeCycle();
    System.out.println(isCycle());

  }
}
