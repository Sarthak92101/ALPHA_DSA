package Array;

public class BinarySearch {
    public static int   BSearch(int Array[], int key) {
        int start = 0;
        int end = Array.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (Array[mid] == key) {
                //System.out.println("Key found at " + mid);
                return mid;
            } else if (Array[mid] > key) {
                 //System.out.println("Key is small");
                end = mid;
            } else {
                start=mid;
            }
        }
return -1;  //if key not exist in array 
    }

    public static void main(String[] args) {
        int Array[] = { 2, 4, 6, 8, 10, 12, 14 };
        // int n=Array.length;
        int key = 11;
        
         System.out.print("Key is at index of " + BSearch(Array, key));

    }
}
