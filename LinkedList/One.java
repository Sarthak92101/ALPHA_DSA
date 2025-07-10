package LinkedList;

public class One {
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

  public void addFirst(int data) {
    // Step1= Create a new node
    Node newNode = new Node(data);
    size++;

    if (head == null) {
      head = tail = newNode;
      return;
    }
    // Step2: New node's next=head
    newNode.next = head;

    // Step3:head=new node
    head = newNode;

  }

  public void addlast(int data) {
    Node newNode = new Node(data);

    size++;
    if (head == null) {
      head = tail = newNode;
      return;
    }
    tail.next = newNode;
    tail = newNode;

  }

  public void print() {
    if (head == null) {
      System.out.println("LL is empty ");
      return;
    }
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " =>");
      temp = temp.next;
    }
    System.out.println("null");
  }

  // Add in the MIDDLE
  public void add(int idx, int data) {
    if (idx == 0) {
      addFirst(data);
      return;
    }
    Node newNode = new Node(data); // Created new node
    size++;
    Node temp = head;
    int i = 0;
    while (i < idx - 1) {
      temp = temp.next;
      i++;
    }
    newNode.next = temp.next;
    temp.next = newNode;

  }

  public int removeFirst() {
    if (size == 0) {
      System.out.println("LL is empty");
      return Integer.MIN_VALUE;
    } else if (size == 1) {
      int val = head.data;
      head = tail = null;
      size = 0;
      return val;
    }
    int val = head.data;
    head = head.next;
    size--;
    return val;
  }

  public int removeLast() {
    if (size == 0) {
      System.out.println("LL is empty");
      return Integer.MIN_VALUE;
    } else if (size == 1) {
      int val = head.data;
      head = tail = null;
      size = 0;
      return val;
    }
    // prev=size-2
    Node prev = head;
    for (int i = 0; i < size - 2; i++) {
      prev = prev.next;
    }
    int val = prev.next.data; // TAIL DATA
    prev.next = null;
    tail = prev;
    size--;
    return val;

  }

  // SEARCH
  public int itrSearch(int key) {
    Node temp = head;
    int i = 0;
    while (temp != null) {
      if (temp.data == key) { // Key found
        return i;
      }
      temp = temp.next;
      i++;
    }
    // Key not Found

    return -1;
  }

  // ITR SEARCH using RECURSION
  public int helper(Node head, int key) {
    if (head == null) {
      return -1;
    }
    if (head.data == key) {
      return 0;
    }
    int idx = helper(head.next, key);
    if (idx == -1) {
      return -1;
    }
    return idx + 1;

  }

  public int Search(int key) {
    return helper(head, key);
  }

  // REVERSE
  public void Reverse() {
    Node prev = null;
    Node curr = tail = head;
    Node next;

    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    head = prev;

  }

  public void DeleteNthFromEnd(int n) {
    int size = 0;
    Node temp = head;
    while (temp != null) {
      temp = temp.next;
      size++;
    }
    if (n == size) {
      head = head.next; // Remove First
      return;
    }

    // size-n
    int i = 1;
    int iToFind = size - n;
    Node prev = head;
    while (i < iToFind) {
      prev = prev.next;
      i++;
    }
    prev.next = prev.next.next;
    return;

  }

  // Slow Fast Approach
  public Node findMid(Node head) {
    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;// +1 Turtle
      fast = fast.next.next;// +2 Hare
    }
    return slow; // Slow is my middle.
  }

  public boolean CheckPalindrome(){
    if(head==null || head.next==null){
      return true;
    }
    //Step1 to find mid
    Node midNode=findMid(head);

    //Step2 reverse half
     Node prev=null;
     Node curr=midNode;
     Node next;
      while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next; 
      }
      Node right=prev;  //.right half head
      Node left=head;

    //Step3 Check first half and second half

    while(right!=null){
      if(left.data!=right.data){
        return false;
      }
      left=left.next;
      right=right.next;
    }
    return true; 
  }

  public static void main(String[] args) {
    One ll = new One();
    // ll.head = new Node(1);
    // ll.head.next = new Node(2);
    ll.addFirst(2);
    ll.addFirst(1);
    ll.addlast(2);
    ll.addlast(1);
    ll.add(2, 3);
    ll.print();
    // System.out.println(ll.size);
    // ll.removeFirst();
    // ll.print();
    // ll.removeLast();
    // ll.print();

    // System.out.println(ll.Search(3));
    // System.out.println(ll.itrSearch(30));

    // ll.Reverse();
    // ll.print();
    // ll.DeleteNthFromEnd(3);
    // ll.print();

    System.out.println(ll.CheckPalindrome());
    ll.print();


  }
}
