package LinkedList2;
import java.util.LinkedList;


public class ZigZagLL {
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



  public void zigzag() {
    // find middle
    Node slow = head;
    Node fast = head.next;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    Node mid = slow;

    // Reverse 2nd half

    Node curr = mid.next;
    mid.next = null;
    Node prev = null;
    Node next;

    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    Node left = head;
    Node right = prev;
    Node Nextl, NextR;
    // Alternate Merging
    while (left != null && right != null) {
      Nextl = left.next;
      left.next = right;
      NextR = right.next;
      right.next = Nextl;

      right = NextR;
      left = Nextl;
    }
  }

    public static void print() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " -> ");
      temp = temp.next;
    }
    System.out.println("null");
  }

public static void main(String[] args) {
  ZigZagLL ll = new ZigZagLL();

  addFirst(1);
  addFirst(2);
  addFirst(3);
  addFirst(4);
  addFirst(5);

  System.out.println("Original List:");
  print();

  ll.zigzag(); // ✅ Call the zigzag method here

  System.out.println("Zig-Zag List:");
  print();
}

