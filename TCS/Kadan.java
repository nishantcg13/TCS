import java.util.*;

public class Kadan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int starti = 0;
        int endi = 0;
        int tempStart = 0;
        for (int i = 0; i < size; i++) {
            if (sum == 0) {
                tempStart = i;
            }
            sum += arr[i];

            if (sum > maxSum) {
                maxSum = sum;
                starti = tempStart;
                endi = i;
            }
            if (sum < 0) {
                sum = 0;
            }
        }

        for (int i = starti; i <= endi; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("Sum " + maxSum);
        System.out.println("i " + starti);
        System.out.println("j " + endi);
    }
}