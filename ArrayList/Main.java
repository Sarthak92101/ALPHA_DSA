package ArrayList;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    list.add(10);
    list.add(20);
    list.add(30);

    list.add(40);
    System.out.println(list);
    list.remove(0);
    System.out.println(list);

    Iterator<Integer> itr = list.iterator();
    while (itr.hasNext()) {
      System.out.println("Iterator" + itr.next());
    }

    List<Integer> list3 = new ArrayList<>();
    list3.add(11);
    list3.add(12);
    list3.add(13);
System.out.println(list3.get(0));
list3.set(0,100);
System.out.println(list3.get(0));
System.out.println(list3);

list.toArray();
Object[] arr=list3.toArray();
for(Object obj:arr){
  System.out.println(obj);
}
System.out.println(list3.contains(100) );





 
list.add(24);
list.add(6);
System.out.println(list);


Collections.sort(list);
System.out.println(list);



ArrayList<Integer> newList=(ArrayList<Integer>)list.clone();
System.out.println(newList);

  }
}
