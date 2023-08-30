import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma so sinh vien :");
        String mssv = sc.nextLine();
        if(mssv.matches("B\\d{7}")) // ma bat dau bang chu B gom 7 ki tu so tu 1-9
        {
            System.out.println("Ma so sinh vien hop le ");
        } else
        {
            System.out.println("Ma so sih vien khong hop le!!!");
        }
    }
}
