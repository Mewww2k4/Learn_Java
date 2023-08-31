import java.util.Arrays;
import java.util.Scanner;

public class LoopFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr = "hello world";
        /*for(int i = 1; i <= 3; i++)
        {
            System.out.println(arr);
        }
        int  a = 0;
        System.out.println("Nhap a :");

        for (int i = 1; i <= 9; i++) {
            System.out.print(i + "  ");
        }


        int[] arr1 = {1,3,2,4,5};
         for (int i : arr1)
         {
             System.out.println(i + "  ");
         }
         loopout : for(int i = 1 ; i <= 3; i ++)
         {
            loopin : for(int j = 1 ; j <= 4 ; j++) {
                System.out.println("i = " + i + ", j = " + j);
                if (i == 2 && j == 1) {
                    break loopout;
                }
            }
         }
         int n = sc.nextInt();
         System.out.print("Mang a :");
         for(int i = 1 ; i <= n ; i++)
         {
             System.out.println(i + " ");
         }
         System.out.print("Mang b : ");
         for (int i = n ; i >= 1; i--)
         {
             System.out.print(i + " ");
         }*/
        for (int i = 1; i <= 10; i++) {
            System.out.print("\n");
            for (int j = i; j <= 200; j += 10) {
                System.out.print(j + " ");
            }
        }
        int f = sc.nextInt();
        for (int i = 1; i <= 20; i++) {
            System.out.print(f + " x " + i + " = " + f * i + "\n");
        }
        for (int i = 1; i <= 10; i++) {
            System.out.print("\n");
            for (int j = 1; j <= 10; j++) {
                int rs = i * j;
                {
                    if (rs <= 100) {
                        System.out.print(rs + " ");
                    }
                }
            }
        }
        int n = sc.nextInt();
        System.out.print("So chan : ");
        for(int i = 1; i<=n ; i++ )
        {
            if(i%2==0)
            {
                System.out.print(" "+ i);
            }
        }
        int c = sc.nextInt();
        System.out.print("So le : ");
        for(int i = 1; i<=c ; i++ )
        {
            if(i%2==1)
            {
                System.out.print(" "+ i);
            }
        }
        //daonguoc

    }
}
