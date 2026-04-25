import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test11 {

    public static void main(String[] args) throws InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = 0;
        int y = 0;

        try {
            x = Integer.parseInt(br.readLine());
            y = Integer.parseInt(br.readLine());
            System.out.println(Thread.currentThread().getName());

            System.out.println(x / y);
        } catch (IOException e) {
            System.out.println("IO Exception");
        } catch (NumberFormatException ex) {
            System.out.println("Wrong Input");
        } catch (ArithmeticException ae) {
            System.out.println("Enter the numner again");
            // y = Integer.parseInt(br.readLine());
        } catch (Exception e) {

        }
    }
}
