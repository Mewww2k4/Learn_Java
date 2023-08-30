import java.util.Scanner;

public class eX4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap canh a : ");
        int a = sc.nextInt();
        System.out.println("Nhap canh b :");
        int b = sc.nextInt();
        System.out.println("Nhap canh c :");
        int c = sc.nextInt();
        sc.close();
        if(Math.pow(a,2)+Math.pow(b,2) == Math.pow(c,2))
        {
            System.out.println("La tam giac vuong");
        } else if (Math.pow(a,2)+Math.pow(c,2) == Math.pow(b,2)){
            System.out.println("La tam giac vuong");
        } else if (Math.pow(b,2)+Math.pow(c,2) == Math.pow(a,2)) {
            System.out.println("La tam giac vuong");
        }else {
            System.out.println("Khong phai la tam giac");
        }

    }
}
