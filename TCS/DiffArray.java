import java.util.Arrays;
import java.util.Scanner;

public class DiffArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the number of operations: ");
        int opn = sc.nextInt();

        for (int i = 0; i < opn; i++) {
            System.out.println("Enter left " + (i + 1));
            int left = sc.nextInt();
            System.out.println("Enter right " + (i + 1));
            int right = sc.nextInt();
            System.out.println("Enter num " + (i + 1));
            int num = sc.nextInt();

            arr[left] = num;
            if ((right + 1) < size) {
                arr[right + 1] = -1 * num;
            }

        }
        int pArr[] = new int[size];
        pArr[0] = arr[0];
        for (int i = 1; i < size; i++) {
            pArr[i] = arr[i] + pArr[i - 1];
        }

        System.out.println(Arrays.toString(pArr));
    }
}