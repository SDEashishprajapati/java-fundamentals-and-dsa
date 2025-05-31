package Loops03;

import java.util.Scanner;
 
public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number you want to print the Factorial : ");
        int Num = sc.nextInt();

        int fact = 1;
        for (int i = 1; i <= Num; i++) {
            fact *= i;
        }

        System.out.println("The factorial of " + Num + " is : " + fact );
    }
    
}

