package LinkedList2;

public class MergeLL {
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

  public static void addFirst(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
    } else {
      newNode.next = head;
      head = newNode;
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

  private Node getMid(Node head) {
    Node slow = head;
    Node fast = head.next;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow; // mid node
  }

  private Node merge(Node head1, Node head2) {
    Node mergedLL = new Node(-1); // dummy node
    Node temp = mergedLL;

    while (head1 != null && head2 != null) {
      if (head1.data <= head2.data) {
        temp.next = head1;
        head1 = head1.next;
      } else {
        temp.next = head2;
        head2 = head2.next;
      }
      temp = temp.next;
    }

    // remaining nodes
    while (head1 != null) {
      temp.next = head1;
      head1 = head1.next;
      temp = temp.next;
    }

    while (head2 != null) {
      temp.next = head2;
      head2 = head2.next;
      temp = temp.next;
    }

    return mergedLL.next;
  }

  public Node mergeSort(Node head) {
    if (head == null || head.next == null) {
      return head;
    }

    // find mid
    Node mid = getMid(head);

    // split & recurse
    Node rightHead = mid.next;
    mid.next = null;
    Node left = mergeSort(head);
    Node right = mergeSort(rightHead);

    // merge
    return merge(left, right);
  }

  public static void main(String[] args) {
    MergeLL ll = new MergeLL();

    addFirst(1);
    addFirst(2);
    addFirst(3);
    addFirst(4);
    addFirst(5);

    System.out.println("Original List:");
    print();

    head = ll.mergeSort(head);

    System.out.println("Sorted List:");
    print();
  }
}
