public class DoubleTriangle {
    public static void main(String[] args){
        int n = 5;
    // Increasing
        for(int i = 1; i <= n; i++) {

        for(int j = 1; j <= i; j++) {
            System.out.print("*");
        }

        System.out.println();
    }

    // Decreasing
        for(int i = 1; i <= n-1; i++) {

        for(int j = 1; j <= n-i; j++) {
            System.out.print("*");
        }

        System.out.println();
    }
}
}

