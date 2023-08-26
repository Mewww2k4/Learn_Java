import java.util.Scanner;
public class AddNumber2 {
    public static void main(String[] args) {
        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thu nhat : ");
        num1 = sc.nextInt();
        System.out.print("\nNhap so thu 2 : ");
        num2 = sc.nextInt();
        sc.close();
        sum = num1 + num2;
        System.out.println("Tong 2 so : " + sum);
    }
}
