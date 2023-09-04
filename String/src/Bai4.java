import java.util.Scanner;
/*Chuyen doi chu hoa thanh chu thuong
 */
public class Bai4 {
    public static void main(String[] args)
    {
        //cach1
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi : ");
        String str = sc.nextLine();
        String str1 = str.toLowerCase();
        System.out.print("Chuoi sau khi chuyen thanh chu thuong : " + str1);
        //cach2
        System.out.println("Nhap chuoi : ");
        String str2 = sc.nextLine();
        char[] a = str2.toCharArray();
        for (int i = 0 ; i < a.length; i ++)
        {
            if(a[i] >= 65 && a[i]<= 90)
            {
                a[i]+=32;
            }
        }
        str2 = String.valueOf(a);
        System.out.print("Chuoi sau khi chuyen doi : "+str2);
    }
}
