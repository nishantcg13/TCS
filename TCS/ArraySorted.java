import java.util.Scanner;

public class ArraySorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] <= arr[i + 1]) {
                continue;
            } else {
                System.out.println("array is not sorted!!");
                return;
            }
        }
        System.out.println("Array is sorted");
    }
}
