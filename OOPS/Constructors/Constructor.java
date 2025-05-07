package OOPS.Constructors;

public class Constructor {
  public static void main(String[] args) {
    Student s1 = new Student();
    Student s2 = new Student("Sarthak");
    Student s3 = new Student(123);
  }
}

class Student {
  String name;
  int roll;

  Student() {
    System.out.println("Non parameterized constructor"); // Non Parameterized constructor
  }

  Student(String name) {
    this.name = name;
  }

  Student(int roll) {
    this.roll = roll;
  }

}

// we are using multiple constructor here so it is constructor overloading and
// constructor overloading also POLYMORPHISM
