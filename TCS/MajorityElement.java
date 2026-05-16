public class MajorityElement {
    public static void main(String[] ar4gs) {
        int arr[] = { 2, 2, 1, 1, 2, 2, 2 };
        int candidate = 0;
        int count = 0;

        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        System.out.println(candidate);
    }
}
