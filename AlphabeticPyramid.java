import java.util.Scanner;

public class AlphabeticPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number Line For Pattern : ");
        int n = sc.nextInt();

        char ch = 'A';

        for(int line=1; line<=n; line++){
            for(int alpha=1; alpha<=line; alpha++){
                System.out.print(ch +" ");
                ch++;
            }
            System.out.println();
        }
    }
}