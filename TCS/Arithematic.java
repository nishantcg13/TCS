import java.util.Scanner;

public class Arithematic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        try {
            System.out.println(x / y);
        } catch (ArithmeticException e) {
            System.out.println("Enter the val of y again");
            System.out.println(e);
            y = sc.nextInt();
        } catch (Exception ex) {
            System.out.println("A Yedz");
            System.out.println(ex.getStackTrace());
        }
    }
}
