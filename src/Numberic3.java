public class Numberic3 {
    public static void main(String[]args){
        int n = 4;
        for(int i=1;i<=n;i++){
            //part1
            for(int j =1;j<=n-i;j++){
                System.out.print("  ");
            }
            //part2
            for(int j =1;j<=i;j++){
                System.out.print(j+" ");
            }
            //part3
            int rowValue = i;
            int decRowValue= i-1;
            for(int j=1;j<=i-1;j++){
                System.out.print(decRowValue + " ");
                decRowValue--;
            }
            System.out.println();

        }
    }
}
