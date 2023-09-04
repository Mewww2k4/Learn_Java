import java.util.Arrays;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args)
    {
        /*Char -> String */
        Scanner sc = new Scanner(System.in);
        char[] a = {'a','b','c','g','f'};
        String b = new String(a);
        System.out.println("Chuoi : " + b);
        /*String -> Char*/
        System.out.println("Nhap chuoi : ");
        String str = sc.nextLine();
        char[] c = str.toCharArray();
        for(int i = 0 ; i < c.length; i ++)
        {
            System.out.println("Ki tu "+ i + " la : " + c[i]);
        }

    }
}
