import java.math.BigInteger;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        BigInteger factorial = calculateFactorial(num);
        System.out.println("Factorial of " + num + " = " + factorial);
    }

    public static BigInteger calculateFactorial(int num) {
        if (num < 0) {
            throw new ArithmeticException("Factorial is not defined for negative numbers");
        } else if (num == 0 || num == 1) {
            return BigInteger.ONE;
        } else {
            BigInteger factorial = BigInteger.ONE;
            for (int i = 2; i <= num; i++) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }
            return factorial;
        }
    }
}
