package StartingNewLB.Array;

public class MaxElement {
  static int Max(int arr[]){
    int maxi=arr[0];
    for(int i=1; i<arr.length; i++){
      if(arr[i]>maxi){
        maxi=arr[i];
      }
    }
    return  maxi;
  }
  public static void main(String[] args) {
    int arr[]={1,3,10 ,5,7,9};
    System.out.println(Max(arr));
  }
}
