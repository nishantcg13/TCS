import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(arr.toString());

        System.out.println("Enter the element to search:");
        int search = sc.nextInt();
        int ans = binary(arr, search);
        if (ans == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at position " + (ans + 1));
        }

        sc.close();

    }

    public static int binary(int arr[], int search) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == search) {
                return mid;
            } else if (arr[mid] > search) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}