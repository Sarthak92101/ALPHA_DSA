package Array;

public class BuySell {
    public static int Buy(int price[]) {
        int Max = 0;
        int Buyprice = Integer.MAX_VALUE;
        for (int i = 0; i < price.length; i++) {
            if (Buyprice < price[i]) {// Profit
                int profit = price[i] - Buyprice; // Today's Profit
                Max = Math.max(Max, profit);
            } else {
                Buyprice = price[i];
            }
        }
        return Max;
    }

    public static void main(String... s) {
        int price[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(Buy(price));
    }
}
