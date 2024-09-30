import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String s1;
        boolean flag = true; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        s1 = sc.nextLine();
        sc.close();
        int len = s1.length();
        for (int i = 0; i < len / 2; i++) { 
            if (s1.charAt(i) != s1.charAt(len - i - 1)) { 
                flag = false;
                break;
            }
        }
        if (!flag) {
            System.out.println(s1 + " is not a palindrome");
        } else {
            System.out.println(s1 + " is a palindrome");
        }
        
    }
}
