public class DecimalToBinary {
    public static void DecToBin(int n){
        int mynum=n;
        int pow=0;
        int Decimal=0;

        while(n>0){
            int rem=n%2;
            Decimal=Decimal+(rem*(int)Math.pow(10, pow));
            pow++;
            n=n/2;
        }
        System.out.println("The Decimal of "+ mynum+ " is : " + Decimal);
    }
    public static void main(String[] args) {
        DecToBin(50);
        
    }
}
