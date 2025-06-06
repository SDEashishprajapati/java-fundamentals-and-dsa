package FunctionAndMethods05;
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static int threeAvg(int a, int b, int c) {
        int myAvg = (a + b + c) / 3;
        return myAvg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first Number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second Number: ");
        int num2 = sc.nextInt();

        System.out.println("Enter the third Number: ");
        int num3 = sc.nextInt();

        int result = threeAvg(num1, num2, num3);
        System.out.println("The Average of three numbers is: " + result);
    }
}
