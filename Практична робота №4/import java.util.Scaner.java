import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть N: ");
        int n = in.nextInt();

        int i;
        int j;
        boolean isPrime;

        for (i = 2; i <= n; i++) {
            isPrime = true;
            
            for (j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}