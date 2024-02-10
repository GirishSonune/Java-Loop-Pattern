import java.util.Scanner;

public class FloydTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number Line For Pattern : ");
        int n = sc.nextInt();
        int num = 1;

        for (int line=1; line<=n; line++){
            for (int star=1; star<=line; star++){ 
                System.out.print(num +" ");
                num++;
            }
            System.out.println();
        }
    }
}
