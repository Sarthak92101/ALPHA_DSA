public class InvertedHalfpPyramidNumbers {
    public static void InvertedHalfPyramid(int n, int m){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
        //     for(int j=1; j<=m  ; j++){
        //     System.out.print(" ");
        // }
        System.out.println();
    }
    }
    public static void main(String[] args) {
        InvertedHalfPyramid(5, 5);
    }
}
