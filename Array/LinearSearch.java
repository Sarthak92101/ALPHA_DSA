package Array;

public class LinearSearch {
    public static int Linearsearch(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            // System.out.println(number[i]);
            if (number[i] == key) {

                return i;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int number[] = { 2,4,6,8,17,10 };
        int key = 17;
        int index = Linearsearch(number, key);
        if (index == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at place " + index);
        }
    }

}
