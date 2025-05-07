public class FloydsTriangle {
    public static void Floyds(int n, int m){
        int num=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
   
    public static void main(String[] args) {
        Floyds(6,5);
    }
}

