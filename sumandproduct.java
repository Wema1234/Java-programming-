
import java.util.Scanner;

public class sumandproduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt() ;

        int sum = num1 + num2;
        int product = num1 * num2;

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
