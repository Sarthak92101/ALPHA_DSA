package String;

public class Lexicographical {
    public static void main(String[] args) {
        String fruit[] = { "mango", "apple", "banana" };  //mango is big because if we compare first letter of each string then 'm' is bigger LEXICOGRAPHICALLY

        String largest = fruit[0];

        for (int i = 1; i < fruit.length; i++) {
            if (largest.compareTo(fruit[i]) < 0) {
                largest = fruit[i];
            }
        }
        System.out.println(largest);
    }
}
