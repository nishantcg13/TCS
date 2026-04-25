import java.util.Scanner;
import java.util.StringTokenizer;

public class StrTokenizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        StringTokenizer stkr = new StringTokenizer(str, ",");

        while (stkr.hasMoreTokens()) {
            System.out.println(stkr.nextToken());
        }

        sc.close();
    }
}