package Array;
import java.util.*;
public class LargestNumber {
    public static void largestno(int number[]){
 int largest=Integer.MIN_VALUE ;  //-INFINITY
 for(int i=0; i<number.length; i++){
    if(number[i]>largest){
        largest=number[i];
    }
 }
 System.out.println(largest);

    }
    public static void main(String[] args) {
        int number[]={1,2,6,3,5};
        largestno(number);
        
    }
}
