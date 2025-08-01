import java.util.Stack;

public class ReverseTheStack {
  public static void PAB(Stack<Integer> s, int data) {
    if (s.isEmpty()) {
      s.push(data);
      return;
    }
   int top = s.pop();
    PAB(s, data);
    s.push(top);
  }

  public static void reverseStack(Stack<Integer> s) {
    if (s.isEmpty()) {
      return;
    }

    int top = s.pop();
    reverseStack(s);
    PAB(s, top);
  }

  public static void printstack(Stack<Integer> s) {
    while (!s.isEmpty()) {
      System.out.println(s.pop());
    }
  }

  public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);
    // printstack(s);
    reverseStack(s);
    printstack(s);

  }
}
