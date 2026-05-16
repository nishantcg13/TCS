import java.util.Scanner;

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 1, 1, 1 };

        int left = 0;
        int sum = 0;
        int target = 6;
        int maxLen = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            if (sum > target) {
                sum -= arr[left];
                left++;
            }

            if (sum == target) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }
        System.out.println(maxLen);
        ;
    }
}
