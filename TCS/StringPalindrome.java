import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        str = str.toLowerCase();
        int length = str.length();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) == str.charAt(length - i - 1)) {
                continue;
            } else {
                System.out.println("Not palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
}
