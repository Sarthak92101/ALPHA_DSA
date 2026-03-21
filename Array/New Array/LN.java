import java.util.*;
public class LN {
  public static int LargestNumber(int arr[]){
    int largest=Integer.MIN_VALUE;

    for(int i=0; i<arr.length; i++){
        if(arr[i]>largest){
          largest=arr[i];
        }
    }
    return largest;
  }
  public static void main(String[] args) {
    int arr[]={2,4,1,5,3};
System.out.println(LargestNumber(arr));
  }
}
