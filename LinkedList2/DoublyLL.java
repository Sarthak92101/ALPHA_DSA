package LinkedList2;

public class DoublyLL {
  public class Node {
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
  public static int Size;

  // Add
  public void addfirst(int data) {
    Size++;
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

  // Remove
  public int removeFirst() {
    if (head == null) {
      System.out.println("doubly linked list emplt");
      return Integer.MIN_VALUE;
    }
    if (Size == 1) {
      int val = head.data;
      head=tail=null;
      Size--;
      return val;

    }
    int val = head.data;
    head = head.next;
    head.prev = null;
    Size--;
    return val;
  }

  public static void main(String[] args) {
    DoublyLL dll = new DoublyLL();
    dll.addfirst(3);
    dll.addfirst(2);
    dll.addfirst(1);
    dll.print();
    System.out.println(dll.Size);
    dll.removeFirst();
    dll.print();
    System.out.println(dll.Size);


  }
}
