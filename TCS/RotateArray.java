import java.util.*;

public class RotateArray {
    static void rev(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        Scanner sc = new Scanner(System.in);

        int rotate = sc.nextInt();

        rotate = rotate % arr.length;

        rev(arr, 0, arr.length - 1);
        rev(arr, 0, rotate - 1);
        rev(arr, rotate, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}