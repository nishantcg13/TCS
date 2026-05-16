import java.util.Scanner;

public class PrintDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int row = sc.nextInt();
        System.out.println("Enter columns: ");
        int column = sc.nextInt();

        int arr[][] = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int k = 0; k < arr.length; k++) {
            int i = 0, j = k;
            while (i < arr.length && k < arr[0].length) {
                System.out.print(arr[i][j] + " ");
                i++;
                j++;
            }
            System.out.println();
        }
    }
}
