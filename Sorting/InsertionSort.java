package Sorting;

public class InsertionSort {
    public static void Sort(int array[]) {
        for(int i=1; i<array.length; i++){
            int curr=i; 
            int prev=i-1;
            while(prev>=0 && array[prev]>array[curr]){
                array[prev+1]=array[prev];
                prev--;
            }
            array[prev+1]=array[curr]; 
        }
        
    }
    public static void main(String[] args) {
        int array[]={5,4,3,1,2};
    }
}
