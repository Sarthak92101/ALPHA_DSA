package Array;

public class Practice {
    public static boolean Match(int array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return true;
                } else {
                    return false;
                }
            }

        }
        return false;
    }

    public static void Value(int nums[], int key) {
        for(int i=0; i<nums.length; i++){
            if(nums[i]==key){
                System.out.println("Key found at index : " + i);
            }
        }
    }

    public static void main(String[] args) {
        // int array[] = { 1, 2, 3, 4 };
        // System.out.println(Match(array));
        int nums[]={4,5,6,7,0,1,2};
        int key=0;
        Value(nums,key);
    }
}
