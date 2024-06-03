import java.util.Scanner;

public class LunchPalindrome {

    public static void main(String[] args) {
        System.out.println("Check if a string is a palindrome:");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:... ");
        String input = scan.nextLine();
        int start = 0;
        int end = input.length() - 1;
        boolean isPalindrome = true;
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if (isPalindrome) {
            System.out.println(input + " -> is a palindrome");
        } else {
            System.out.println(input + " -> is not a palindrome");
        }
    }
}
