import java.util.Scanner;

public class Slide40 {
    public static void main(String[] args) {
        System.out.println("Nhap vao so tu 1-7");
        try (Scanner sc = new Scanner(System.in)) {
            int ngay = sc.nextInt();

            switch (ngay) {
                case 2:
                    System.out.println("Thu 2");
                    break;
                case 3:
                    System.out.println("Thu 3");
                    break;
                case 4:
                    System.out.println("Thu 4");
                    break;
                case 5:
                    System.out.println("Thu 5");
                    break;
                case 6:
                    System.out.println("Thu 6");
                    break;
                case 7:
                    System.out.println("Thu 7");
                    break;
                case 1:
                    System.out.println("Chu Nhat");
                    break;
                default:
                    System.out.println("Ngay khong hop le !!!");
            }
        }
    }
}