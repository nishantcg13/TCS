import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inturepted {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.out.println("start main");
        Thread.sleep(5000);
        System.out.println("End main");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
    }
}