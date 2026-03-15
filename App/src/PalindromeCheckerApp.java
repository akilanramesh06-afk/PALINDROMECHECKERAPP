/**
 * ==========================================================
 * MAIN CLASS - UseCase2PalindromeCheckerApp
 * ==========================================================
 * Use Case 2: Print a Hardcoded Palindrome Result
 *
 * Description:
 * This program checks whether a hardcoded string
 * is a palindrome and prints the result.
 *
 * @author Developer
 * @version 1.0
 */


    /**
     * Application entry point
     */
    import java.util.Scanner;

    public class PalindromeCheckerApp {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Input text: ");
            String input = sc.nextLine();

            String reversed = "";

            for (int i = input.length() - 1; i >= 0; i--) {
                reversed = reversed + input.charAt(i);
            }

            boolean isPalindrome = input.equals(reversed);

            System.out.println("Reversed text: " + reversed);
            System.out.println("It is a Palindrome ? : " + isPalindrome);

            sc.close();
        }
    }
