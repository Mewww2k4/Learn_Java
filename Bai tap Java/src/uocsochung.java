import java.util.Scanner;

public class uocsochung {
    public static int Input() //ham nhap
    {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        boolean check = false;
        while (!check) {
            System.out.print(" ");
            try {
                System.out.println("  ");
                n = sc.nextInt();
                check = true;
            } catch (Exception e) {
                System.out.println("Vui long nhap lai so nay!!!");
                sc.nextLine();
            }
        }
        return n;
    }

    public static int UCLN(int a, int b) { //ham tim uoc so chung
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;

        }
        return a;
    }

    public static void main(String[] args)
    {
        System.out.println("Nhap a : ");
        int a = Input();
        System.out.println("Nhap b : ");
        int b = Input();
        System.out.println("Uoc so chung lon nhat : " + UCLN(a,b));
        System.out.println("Boi so chung nho nhat : " + a*b/UCLN(a,b));
    }
}