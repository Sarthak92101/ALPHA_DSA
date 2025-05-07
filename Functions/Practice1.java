public class Practice1 {
    public static void Averageof3Number(int a, int b, int c) {
        int Average = (a + b + c) / 3;
        System.out.println(Average);
    }

    public static boolean isEven(int n) {
        boolean isEven = true;
        if (n % 2 == 0) {
            return true;
        }else{
            return false;
        }
    }

    public static void SumOfDigits(int n){
        int SumOfDigit=0;
        while(n>0){
            int LastDigit=n%10;
            SumOfDigit+=LastDigit;
            n=n/10;
        }
        System.out.println(SumOfDigit);

    }

    public static void main(String[] args) {
        // Averageof3Number(2, 02, 02);
        // System.out.println(isEven(4));
        SumOfDigits(33);

    }

}
