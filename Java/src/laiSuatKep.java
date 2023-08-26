import java.util.Scanner;
import java.text.DecimalFormat;
public class laiSuatKep {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //P (1+ R/n)^n*t - P
        double p; //  so tien goc
        float r = 0.08f, n; // R: lãi suất hang năm
                    // n: so lan lai dc gop
        int t;      // t: thời gian tiền được đầu tư
        System.out.print("Nhap so tien goc : ");
        p = sc.nextInt();
//        System.out.print("Nhap lai suat hang nam : ");
//        r = sc.nextInt();
        System.out.print("Nhap so lan lai duoc gop : ");
        n = sc.nextInt();
        System.out.print("Nhap thoi gian tien duoc dau tu : ");
        t = sc.nextInt();
        sc.close();
        double ls;
        ls = p*Math.pow(1+r/n,n*t)-p;
        DecimalFormat f = new DecimalFormat("##.00");
        System.out.println("Lai kep la : " +  f.format(ls) + "$");
    }
}
