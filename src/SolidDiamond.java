public class SolidDiamond {
    public static void main(String[] args) {

        //part1
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        //part 2
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                continue;
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * n - 2 * i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

