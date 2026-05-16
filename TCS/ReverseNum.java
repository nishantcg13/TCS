import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = num;
        int newNum = 0;
        while (num1 > 0) {
            int temp = num1 % 10;
            newNum = newNum * 10 + temp;
            num1 /= 10;
        }

        System.out.println(newNum);
        sc.close();
    }
}