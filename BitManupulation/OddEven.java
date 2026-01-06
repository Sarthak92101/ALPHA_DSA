package BitManupulation;

public class OddEven {
    public static void Test(long n){
        long Bitmask=1;
        if((n & Bitmask)==0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
    }
    public static void main(String[] args) {
        Test(9009929388389929010l);
    }
    
}
