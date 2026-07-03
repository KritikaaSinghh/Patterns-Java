public class HollowDiamond {
    public static void main(String[]args){
        int n =4;
       //part 1
        for(int i=1;i<=n;i++){
            for(int j =1;j<=n-i;j++) {
                System.out.print("  ");
            }
            if(i==1){
                for(int j=1;j<=2*i-1; j++){
                    System.out.print("* ");
                }
            }
            else{
                System.out.print("* ");
                for(int j =1;j<=2*i-3;j++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
        //part 2

        for(int i =1;i<=(n-1);i++){
            for (int j =1;j<=i;j++){
                System.out.print("  ");
            }
            if(i==(n - 1)) {
                System.out.print("* ");
        }
            else{
                System.out.print("* ");
                for (int j =1;j<=2*(n-i)-3;j++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
