public class Alphabetic6 {

        public static void main(String[] args) {
            int n = 4;

            for(int i = 1; i <= n; i++) {

                for(int j = 0; j < i; j++) {
                    System.out.print((char)('A' + n - i + j) + " ");
                }

                System.out.println();
            }
        }
    }

