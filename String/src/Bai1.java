import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input String : ");
        String str1 = sc.nextLine();
        String str2 = str1.replaceAll(" ","");
        System.out.print("Chuoi sau  khi xoa khoa trang : "+str2);
    }
}
