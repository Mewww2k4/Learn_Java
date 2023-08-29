import java.util.Scanner;
public class Number {
    public static void main(String[] args)
    {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        int nguyen = num1/num2;
        int du = num1%num2;
        System.out.println("So nguyen : " + nguyen);
        System.out.println("So du : " + du);
    }

}
