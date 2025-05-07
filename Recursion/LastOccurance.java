package Recursion;

public class LastOccurance {
  public static int Occurance(int arr[], int i, int n){
 if(i==arr.length){
  return -1;
 }


    int isFound=Occurance(arr, i+1, n);
    if(isFound == -1 && arr[i]==n){
      return i;
    }
    return isFound;
  }
  public static void main(String[] args) {
    int arr[]={8,2,4,6,7,3,7};
    System.out.println(Occurance(arr, 0, 7));
  }
}
