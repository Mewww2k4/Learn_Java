import java.util.Scanner;

public class Elseif {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so diem de kiem tra PASS or FAIL : ");
        int point = sc.nextInt();
        if (point < 50) {
            System.out.println("FAIL");
        } else if (point < 60) {
            System.out.println("HOC SINH TRUNG BINH Kem!!!");
        } else if (point < 70) {
            System.out.println("HOC SINH TRUNG BINH");
        } else if (point < 80) {
            System.out.println("HOC SINH KHA");
        } else if (point < 90) {
            System.out.println("HOC SINH Gioi");
        } else if (point < 100) {
            System.out.println("HOC SINH XUAT SAC");
        } else {
            System.out.println("GIA TRI KHONG HOP LE");
        }
    }
}
