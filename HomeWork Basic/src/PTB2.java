import java.util.Scanner;

public class PTB2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a : ");
        int a = sc.nextInt();
        System.out.print("Nhap b : ");
        int b = sc.nextInt();
        System.out.print("Nhap c : ");
        int c = sc.nextInt();
        double dt = Math.pow(b,2) - 4* a*c;
        if(dt > 0 )
        {
            double r1,r2;
            r1 = (-b + Math.pow(dt, 0.5))/2*a;
            r2 = (-b - Math.pow(dt, 0.5))/2*a;
            System.out.println("Phuong trinh co 2 nghiem phan biet: " + "\nr1 = " + r1 + "\nr2 = " + r2);
        } else if (dt == 0)
        {
            double nk = (double) -b/(2*a);
            System.out.println("Phuong trinh co nghiem kep : " + nk);
        }else {
            System.out.println("Phuong trinh vo nghiem ");
        }
    }


}
