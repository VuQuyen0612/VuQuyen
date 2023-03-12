import java.util.Scanner;

public class Slide74 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int c = 0;
            int sum = 0;
            
            do {
                System.out.print("Nhap vao kich thuoc cua mang >0: ");
                c = sc.nextInt();
            } while (c <= 0);
            int[] array1 = new int[c];

            for (int i = 0; i < array1.length; i++) {
                System.out.print("Nhap vao phan tu thu " + i + " cua mang: ");
                array1[i] = sc.nextInt();
                if (array1[i] % 2 == 0) {
                    sum += array1[i];
                }
            }
            System.out.println("Tong cac so chan cua mang: " +sum);
        }
    }
}