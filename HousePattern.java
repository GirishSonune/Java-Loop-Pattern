import java.util.Scanner;

public class HousePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number Line For Pattern : ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=n; j>=i; j--){
                System.out.print("  ");
            }
            for (int j=1; j<= i+(i-1); j++){
                System.out.print(" *");
            }
            
            System.out.println();
        }

        for (int i=1; i<=n/3; i++){
            for (int j = 1; j <= (2*n)+1; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        
        for (int i = 1; i <= n-(n/3); i++) {
            for (int j = 1; j <= ((2 * n) + 2)/3; j++) {
                System.out.print(" *");
            }
            for(int j=1; j<=((2*n)+1)-2*(((2 * n) + 2)/3); j++){
                System.out.print("  ");
            }
            for (int j = 1; j <= ((2 * n) + 2) / 3; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        for (int i = 1; i <= 2; i++) {
            for(int j=1; j<=(2*n)+1; j++){
                System.out.print("**");
            }
            System.out.println();
        }
    }
}
