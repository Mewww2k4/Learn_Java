

import java.util.Scanner;

public class SNT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = nhap(input);

        System.out.println(n + " số nguyên tố đầu tiên là: ");
        lietKe(n);
    }

    public static int nhap(Scanner input) {
        boolean check = false;
        int n = 0;
        while (!check) {
            System.out.print("Nhập n: ");
            try {
                n = input.nextInt();
                check = true;
            } catch (Exception e) {
                System.out.println("Bạn phải nhập số! Hãy nhập lại...");
                input.nextLine();
            }
        }
        return n;
    }

    public static void lietKe(int n) {
        int i = 2, count = 0;
        while (count < n) {
            if (CheckSNT.isPrime(i)) {
                System.out.print(" " + i);
                count++;
            }
            i++;
        }
    }
}
