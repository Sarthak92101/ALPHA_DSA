package ArrayList;

import java.util.ArrayList;
public class Classroom {
  public static void main(String[] args) {
    ArrayList<Integer>list=new ArrayList<>();
    ArrayList<String>list2=new ArrayList<>();
    ArrayList<Boolean>list3=new ArrayList<>();

    //ADD ELEMENT
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    //list.add(1,9);
System.out.println(list);

// //GET ELEMENT
int element = list.get(2);
System.out.println(element);

// //REMOVE ELEMENT
 list.remove(1);
 System.out.println(list);


//SET ELEMENT
list.set(1,10);
System.out.println(list);

//Contains

System.out.println(list.contains(1));
System.out.println(list.contains(12));


 }
}
