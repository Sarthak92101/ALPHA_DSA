package Array;

public class MaxSubarraySum {

    public static void Print(int array[]) {
        int currSum = 0;
        int MaxSum = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum = currSum + array[k];
                }
                System.out.println(currSum);
                if (currSum > MaxSum) {
                    MaxSum = currSum;
                }

            }
           // System.out.println();

        }
        System.out.println("Max Sum:  "+MaxSum);


    }

    public static void main(String[] args) {
        int array[] = { 2,4,6,8,10};
        Print(array);
    }
}
