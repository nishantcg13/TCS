import java.util.ArrayList;
import java.util.Collections;

public class Leaders {
    public static void main(String[] args) {
        int arr[] = { 16, 17, 4, 3, 5, 2 };
        ArrayList<Integer> al = new ArrayList<Integer>();
        int max = Integer.MIN_VALUE;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max) {
                al.add(arr[i]);
                max = arr[i];
            }
        }

        Collections.reverse(al);
        System.out.println(al);
    }
}
