package Array;

public class ReverseArray {
    public static void Reverse(int number[]) {
        int start = 0;
        int end = number.length - 1;
        // int array = 0;
        while (start < end) {
            int T  = number[start];
            number[start] = number[end];
            number[end] = T;
            start++;
            end--;
        }
       
        

    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 3, 4, 5, 6 };
        Reverse(number);
        for(int i=0; i<=number.length-1; i++){
            System.out.print( number  [i])  ;
        }
        System.out.println();
    }
}
