import java.util.Scanner;

public class BaiTap21-2 {
    public static void main(String[] args){
        int n;
        int sum = 0;
        System.out.println("Nhap vao so nguyen n = ");
        n = new Scanner(System.in).nextInt();
        System.out.print("sum= ");
        While(n>0){
            System.out.println(n%10+" + ");
            sum+= n%10;
            n/= 10;
        }
        System.out.println("Tong cac chu so cua so nguyen"+n =);
    }
}