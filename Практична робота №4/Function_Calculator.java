import java.util.Scanner;

public class FunctionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x = ");
        double x = scanner.nextDouble();

        System.out.print("a = ");
        double a = scanner.nextDouble();

        System.out.print("b = ");
        double b = scanner.nextDouble();

        if (x >= 1 && x < 3) {
            double res = 9 / (a * x);
            System.out.println("f(x) = " + res);
        } 
        else if (x == 3) {
            
            double formula = a * x * x + x + b;
            
        
            if (formula < 0) {
                formula = -formula;
            }
            
            System.out.println("f(x) = " + formula);
        } 
        
        else {
            System.out.println("x не входить в умови");
        }

        scanner.close();
    }
}