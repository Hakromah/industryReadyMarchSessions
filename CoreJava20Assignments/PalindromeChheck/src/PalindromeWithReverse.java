import java.util.Scanner;

public class PalindromeWithReverse {
    public static void main(String[] args) {
        System.out.println("Enter a String to check if Palindrome String:");

        try (Scanner sc = new Scanner(System.in)) {
            String input = sc.next();

            StringBuilder reverseStr = new StringBuilder();// Declare globally

            int length = input.length();

            for (int i = length - 1; i >= 0; i--) {
                reverseStr.append(input.charAt(i));
            }
            System.out.println(" -> " + reverseStr);

            if (reverseStr.toString().equals(input)) {
                System.out.println(input + " is a Palindrome String");
            } else {
                System.out.println(input + " is not a palindrome String");
            }
        }

    }
}
