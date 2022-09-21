package string;

/**
 * Check palindrome by two pointers
 */
public class Palindrome {

    public static void main(String[] args) {
        String input = "a";
        System.out.println(isPalindrome(input, 0, input.length() - 1) + "");
    }

    private static boolean isPalindrome(String input, int left, int right) {

        if (left > right || input.charAt(left) != input.charAt(right)) {
            return false;
        }

        if (left == right) {
            return true;
        }

        left++;
        right--;
        return isPalindrome(input, left, right);
    }
}
