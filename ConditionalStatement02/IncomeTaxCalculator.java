package ConditionalStatement02;

import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        double tax = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Income (Per Annum): ₹ ");
        double inc = sc.nextDouble();

        if (inc <= 250000) {
            System.out.println("No Tax. Your income is below the taxable limit.");
        } 
        else if (inc > 250000 && inc <= 500000) {
            tax = (inc - 250000) * 0.05;
            System.out.println("Tax Payable: ₹" + tax);
        } 
        else if (inc > 500000 && inc <= 1000000) {
            tax = (250000 * 0.05) + (inc - 500000) * 0.2;
            System.out.println("Tax Payable: ₹" + tax);
        } 
        else {  // inc > 1000000
            tax = (250000 * 0.05) + (500000 * 0.2) + (inc - 1000000) * 0.3;
            System.out.println("Tax Payable: ₹" + tax);
        }

        sc.close();
    }
}
