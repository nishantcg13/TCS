import java.util.Arrays;
import java.util.Scanner;

public class Quick {

    static void quick(int arr[], int start, int end) {
        int pivot = partition(arr, start, end);
        quick(arr, start, pivot - 1);
        quick(arr, pivot + 1, end);
    }

    static int partition(int arr[], int start, int end) {
        int idx = start - 1;
        int pivot = arr[end];

        for (int j = start; j < end; j++) {
            if (pivot > arr[j]) {
                idx++;
                swap(arr, arr[idx], arr[j]);
            }
        }
        idx++;
        swap(arr, arr[pivot], arr[idx]);
        return idx;
    }

    static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[a] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int start = 0;
        int end = size - 1;
        quick(arr, start, end);

        System.out.println(Arrays.toString(arr));
    }
}
