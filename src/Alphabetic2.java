public class Alphabetic2 {
    public static void main(String[]args){
        int n = 5;
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int a = n-j;
                int b='A';
                int ans = a+b;
                char finalAns=(char)ans;
                System.out.print(finalAns + " ");

            }
            System.out.println();
        }
    }
}
