import java.util.Scanner;

public class NumberPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int num1 = num;
        int newnum = 0;
        while (num1 > 0) {
            int temp = num1 % 10;
            newnum = newnum * 10 + temp;
            num1 /= 10;
        }

        System.out.println("Reversed number " + newnum);
        if (newnum == num) {
            System.out.println("Palindrome");
        }
    }
}
