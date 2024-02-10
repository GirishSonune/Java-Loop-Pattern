import java.util.Scanner;

public class NormalPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number Line For Pattern : ");
        int n = sc.nextInt();

        for (int line=1; line<=n; line++){
            for (int star=1; star<=(n-line); star++){
                System.out.print(" ");
            }
            for (int star=1; star<=line; star++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
