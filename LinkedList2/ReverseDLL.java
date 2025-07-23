package LinkedList2;

public class ReverseDLL {
  public static class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
      this.data = data;
      this.next = null;
      this.prev = null;
    }

  }

  public static Node head;
  public static Node tail;
  public static int size;

  public void addfirst(int data) {
    size++;
    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
      return;
    }
    newNode.next = head;
    head.prev = newNode;
    head = newNode;

  }

  // print
  public void print() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + "<->");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public void reverse() {
    Node curr = head;
    Node prev = null;
    Node next;

    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      curr.prev = next;

      prev = curr;
      curr = next;
    }
    head = prev;
  }

  public static void main(String[] args) {
    ReverseDLL Dll = new ReverseDLL();
    Dll.addfirst(3);
    Dll.addfirst(2);
    Dll.addfirst(1);
    Dll.print();
    Dll.reverse();
    Dll.print();

  }
}
