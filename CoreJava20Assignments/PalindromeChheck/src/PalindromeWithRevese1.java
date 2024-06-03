import java.util.Scanner;

public class PalindromeWithRevese1 {
    public static void main(String[] args) {
        System.out.println("Enter a String to check if Palindrome String:");

        try (Scanner sc = new Scanner(System.in)) {
            String input = sc.next();
            String orgStr = input;// original string to be Reversed and compared

            String reverseStr = "";// Declare globally 

            int length = input.length();

            for (int i = length - 1; i >= 0; i--) {

                reverseStr = reverseStr + input.charAt(i);

            }
            System.out.println(reverseStr);

            if (reverseStr.equals(orgStr)) {
                System.out.println(orgStr + " is a Palindrome String");
            } else {
                System.out.println(orgStr + " is not a palindrome String");
            }
        }

    }
}
