import java.util.Scanner;

public class Slide75 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int row1 = 0;
            int column1 = 0;
            int sum = 0;

            do {
                System.out.print("Nhap vao so hang cua mang (>0): ");
                row1 = sc.nextInt();
                System.out.print("Nhap vao so cot cua mang (>0): ");
                column1 = sc.nextInt();
            } while (row1 <= 0 || column1 <= 0);
            int[][] array1 = new int[row1][column1];

            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column1; j++) {
                    System.out.print("A[" + i + "][" + j + "]: ");
                    array1[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column1; j++) {
                    if (array1[i][j] % 2 == 0) {
                        sum += array1[i][j];
                    }
                }
            }

            System.out.println("Ma tran A: ");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column1; j++)
                    System.out.print(array1[i][j] + "\t");
                    System.out.print("\n");
            }

            System.out.println("Tong cac so chan trong mang: " + sum);
        }
    }
}