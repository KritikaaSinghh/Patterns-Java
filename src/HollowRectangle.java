public class HollowRectangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 6; j++) {
               if(i==1||i==n){
                   System.out.print("x ");
               }
               else{
                   if(j==1||j==6){
                       System.out.print("x ");
                   }
                   else{
                       System.out.print("  ");
                   }
               }
            }
            System.out.println();
    }
}
}
