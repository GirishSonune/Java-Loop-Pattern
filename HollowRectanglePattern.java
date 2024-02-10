import java.util.Scanner;

public class HollowRectanglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Rows : ");
        int r = sc.nextInt();
        System.out.print("Enter Number of Column : ");
        int c = sc.nextInt();

        for (int row = 1; row <= r; row++) {
            for (int column = 1; column <= c; column++) {
                if (row == 1 || row == r || column == 1 || column == c) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
