package Array;

//import java.util.*;

public class TrappingWater {
    public static int Trapping(int array[]) {
        int n = array.length;
        // Calculate Left Max Boundry
        int leftMax[] = new int[array.length];
        leftMax[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            leftMax[i] = Math.max(array[i], leftMax[i - 1]);
        }
        // Calculate Right Max Boundry
        int rightMax[] = new int[array.length];
        rightMax[n - 1] = array[n - 1];
        for (int i = n - 2; i >=0; i--) {
            rightMax[i] = Math.max(array[i], rightMax[i + 1]);
        }
        // Loop
        int TrappedWater = 0;
        for (int i = 0; i < n; i++) {
            // WaterLevel=min(LeftMax boundry, RightMax Boundry)
            int WaterLevel = Math.min(leftMax[i], rightMax[i]);
            // Trapped Water= WaterLevel-array[i]
            TrappedWater += WaterLevel - array[i];
        }
        return TrappedWater;
    }

    public static void main(String[] args) {
        int array[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.print(Trapping(array));
    }
}
 