import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] arg) throws IOException {
        System.out.println("Sonu");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter comp name");
        String cmpName = sc.next();

        System.out.println("Enter employee name");
        String empName = sc.next();

        System.out.println("Enter emp id:");
        int empId = sc.nextInt();

        System.out.println("Comp name" + cmpName);
        System.out.println("emp name" + empName);
        System.out.println("emp id" + empId);
        System.out.println(System.identityHashCode(empName));
    }
}