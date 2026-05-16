public class removeDuplicates {
    public static void main(String[] args) {
        int arr[] = new int[] { 0, 0, 1, 1, 1, 2, 3, 4, 5, 6, 6, 7, 8, 8, 8, 9, 9 };
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        System.out.println(i + 1);
    }
}
