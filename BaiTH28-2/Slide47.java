import java.util.Scanner;

public class Slide47 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int tong = 0;
            int a;
            System.out.println("Nhap vao so nguyen a: ");
            a = sc.nextInt();
            tong = tong + a;
            System.out.println("Tong hien tai la : " + tong);

            do {
                System.out.println("Nhap vao so nguyen tiep theo: ");
                a = sc.nextInt();
                tong = tong + a;
                if (tong < 100) {
                    System.out.println("Tong hien tai la : " + tong);
                }

            } while (tong < 100);
            System.out.println("Tong cac so da nhap la: " + tong);
        }
    }
}