package ConditionalStatement02;

import java.util.Scanner;

public class FindGreatestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a + " is greater.");
        } else if (a < b) {
            System.out.println(b + " is greater.");
        } else {
            System.out.println("Both are equal.");
        }
    }
}

    

