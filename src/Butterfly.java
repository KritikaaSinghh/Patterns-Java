public class Butterfly {
    public static void main(String[]args){
        int n =4;
        //part1
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //part2
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            //part3
            for(int j =1;j<=i;j++){
                System.out.print("* ");
            }

            System.out.println();
        }
        //inverted symmetrical half
        for(int i=1;i<=n;i++){
            //part 4
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            //part5
            for(int j=1; j<=2*(i-1);j++){
                System.out.print("  ");
            }
            //part6
            for(int j =1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
