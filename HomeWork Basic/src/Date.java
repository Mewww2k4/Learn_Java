import java.util.Scanner;

public class Date {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n : ");
        int n = sc.nextInt();
        switch(n)
        {
            case 1: System.out.print("Chu Nhat"); break;
            case 2: System.out.print("Thu 2"); break;
            case 3: System.out.print("Thu 3"); break;
            case 4: System.out.print("Thu 4"); break;
            case 5: System.out.print("Thu 5"); break;
            case 6: System.out.print("Thu 6"); break;
            case 7: System.out.print("Thu 7"); break;
            default: System.out.print("Khong hop le!!!");
        }
    }
}
