import java.util.*;

public class Practice {
  public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
int choice;
int number;
    int evensum=0;
    int oddsum=0;
    do{
      System.out.println("Enter the number");
      number=sc.nextInt();
if(number%2==0){
  evensum+=number;
}else{
  oddsum+=number;
}
System.out.println("Do you want to continue press 1");
 choice = sc.nextInt();
    }while(choice==1);
    
      System.out.println("EvenSum:" + evensum);
      System.out.println("oddSum:" + oddsum);

    sc.close();
  }
}
