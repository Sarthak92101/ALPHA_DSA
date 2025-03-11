package Array;

import java.util.Scanner;

public class Input1 {
    public static void main(String[] args) {
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks of maths:");
        marks[0] = sc.nextInt();
        System.out.println("Enter Marks of English:");
        marks[1] = sc.nextInt();
        System.out.println("Enter Marks of SST:");
        marks[2] = sc.nextInt();
 System.out.println(marks[1]);
sc.close();

    }
}
