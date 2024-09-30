import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        String inputString = sc.nextLine().trim().toLowerCase();
        sc.close();//to close  the scanner

        if (inputString.isEmpty()) {
            System.out.println("Input string is empty");
            return;
        }

        int length = inputString.length();
        boolean isPalindrome = true;

        for (int i = 0; i < length / 2; i++) {
            if (inputString.charAt(i) != inputString.charAt(length - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if (!isPalindrome) {
            System.out.println(inputString + " is not a palindrome");
        } else {
            System.out.println(inputString + " is a palindrome");
        }
    }
}
