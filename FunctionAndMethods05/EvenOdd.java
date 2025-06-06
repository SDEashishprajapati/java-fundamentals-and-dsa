package FunctionAndMethods05;

import java.util.Scanner;

public class EvenOdd {

    public static String isEven(int n) {
        return (n % 2 == 0) ? "Number is Even" : "Number is Odd";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        String result = isEven(number);
        System.out.println(result);
    }
}
