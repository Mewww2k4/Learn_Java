/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class Arrays1 {
    static Scanner sc = new Scanner(System.in);
    public static void input(int[]a, int n)
    {
        System.out.print("Nhap mang : ");
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print("a["+i+"] = " );
            a[i] = sc.nextInt();
        }
    }
    public static void output(int[] a, int n)
    {
        for (int i = 0 ; i < n ; i++)
        {
            System.out.print(a[i] + "   ");
        }
    }
    public static void arrange(int []a , int n) {
        System.out.print("Mang sau khi sap xep tang: ");
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    public static void decrease(int[] a, int n)
    {
        System.out.print("Mang sau khi sap xep giam : ");
        for (int i = 0 ; i < n- 1; i ++)
        {
            for( int j = i+ 1; j < n ; j++)
            {
                if(a[i]< a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
//        int a = 3;
//        int b = 2;
//        int c = a+ b;
//        System.out.println("x = " + c);
        Scanner sc = new Scanner(System.in);
        int[] a = new int[100];
        System.out.println("Nhap n : ");
        int n = sc.nextInt();
        input(a,n);
        System.out.print("Mang la : ");
        output(a,n);
        System.out.print("\n");
        arrange(a,n);
        output(a,n);
        System.out.print("\n");
        decrease(a, n);
        output(a,n);

    }
}
