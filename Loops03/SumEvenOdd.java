package Loops03;
    
import java.util.Scanner;

 public class SumEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter? ");
        int count = sc.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        System.out.println("Enter " + count + " integers:");

        for (int i = 1; i <= count; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        System.out.println("Sum of Even Numbers: " + evenSum);
        System.out.println("Sum of Odd Numbers: " + oddSum);

        
    }
}

