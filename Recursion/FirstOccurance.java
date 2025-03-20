package Recursion;

public class FirstOccurance {
  public static int isOccured(int arr[],int i,int n){
    if(i==arr.length ){
      return -1; 
    } 
  if(arr[i]==n){
    return  i;
  }
  return isOccured(arr, i+1 , n);





  }
  public static void main(String[] args) {
    int arr[]={8,4,2,1,6,4,3,2,5 };
 
    System.out.println(isOccured(arr, 0, 5));
  }
}
