import java.util.Scanner;

public class Bai3 {
    public static  void main(String[] args)
    {
        //*cach 1
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi ");
        String str = sc.nextLine();
        String str1 = str.toUpperCase();// chuyen sang chu hoa
        System.out.println("Chuoi sau khi doi : " + str1);
        //*cach2
        System.out.println("Nhap chuoi 2 : ");
        String str2 = sc.nextLine();
        char[] a = str2.toCharArray();
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] >= 97 && a[i] <= 122)
            {
                a[i] -= 32;
            }
        }

        str2 = String.valueOf(a);
        System.out.println("Chuoi sau khi chuyen doi: " + str2);
    }
}
