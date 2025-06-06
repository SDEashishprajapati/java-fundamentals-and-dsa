package FunctionAndMethods05;

   public class PalindromeNumber {

    public static boolean isPalindrome(int number) {
        int original = number;
        int reversed = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            reversed = reversed * 10 + lastDigit;
            number = number / 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        int num = 121;

        if (isPalindrome(num)) {
            System.out.println(num + " is a Palindrome.");
        } else {
            System.out.println(num + " is not a Palindrome.");
        }
    }
}
 

