package Array;

public class MajorityElement {
    public static int Majority(int array[], int n) {
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count > n / 2) {
                return array[i];
            }
            

        }
        return -1;
    }

    public static void main(String[] args) {
        int array[] = { 2, 2, 1, 1, 1, 2, 2 };
        int n = array.length;
        System.out.println(Majority(array, n));
    }
}
