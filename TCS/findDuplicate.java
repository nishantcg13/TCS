import java.util.Scanner;

class findDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int slow = 0;
        int fast = 0;

        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while (slow != fast);

        slow = 0;

        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }

        System.out.println(slow);
    }
}