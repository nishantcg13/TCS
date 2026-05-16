import java.util.Scanner;

public class missingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        int n = size + 1;
        int totalSum = (n * (n + 1)) / 2;
        System.out.println("number: " + (totalSum - sum));
    }
}
