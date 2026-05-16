import java.util.Arrays;
import java.util.Scanner;

public class Selection {

    static void selection(int arr[]) {
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            int min = i;

            for (int k = i + 1; k < size; k++) {
                if (arr[min] > arr[k]) {
                    min = k;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        selection(arr);

        System.out.println(Arrays.toString(arr));
    }
}
