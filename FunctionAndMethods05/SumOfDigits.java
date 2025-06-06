package FunctionAndMethods05;
import java.util.Scanner;

public class SumOfDigits {

    public static int addOfDigits(int number) {
        int sum = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int result = addOfDigits(number);
        System.out.println("The sum of the digits is: " + result);
    }
}