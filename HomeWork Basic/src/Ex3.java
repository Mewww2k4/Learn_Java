import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap canh a : ");
        float a = sc.nextFloat();
        System.out.println("Nhap canh b : ");
        float b = sc.nextFloat();
        System.out.println("Nhap canh c : ");
        float c = sc.nextFloat();
        if(a + b > c && a + c > b && b + c > a)
        {
            System.out.println("Day la 3 canh cua 1 tam giac ");
        } else {
            System.out.println("Day khong phai la 3 canh cua 1 tam giac");
        }
    }
}
