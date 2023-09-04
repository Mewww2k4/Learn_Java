import java.util.Scanner;
// do dai chuoi
public class stringjava {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        //do dai chuoi
        System.out.print("Nhap chuoi 1 : ");
        String str = sc.nextLine();
        int length = str.length();
        System.out.println("Do dai cua chuoi la : "+length);
        //noi chuoi
        System.out.print("Nhap chuoi 2 : ");
        String str1 = sc.nextLine();
//        String str2 = str + str1;
//        System.out.print("Chuoi 2 sau khi noi : " + str2);
        String str2 = str.concat(str1);
        System.out.println("Chuoi 2 sau khi noi : " + str2);

        //tra ve 1 ki tu trong chuoi
        System.out.print("Nhap index : ");
        int n = sc.nextInt();
        char c1 = str2.charAt(n);
        System.out.println(" Vi tri thu " +n+ " la :" + c1);
        // so sanh chuoi

        int result = str.compareTo(str2);
        if(result > 0)
        {
            System.out.println("str1 > str2");
        } else if (result==0) {
            System.out.println("str = str2");
        }
        else {
            System.out.println("str < str2");
        }
        //tim kiem vi tri
        System.out.println("Nhap ki tu muon tim");
        char c2 = sc.next().charAt(0);
        for(int i = 0 ; i < str2.length() ; i ++ )
        {
            if(str2.charAt(i)==c2) {
                System.out.println(i);
            }
        }
        // tra ve vi tri cuoi cung
        int kq = str2.lastIndexOf(str1);
        System.out.println("Vi tri cuoi cung :"+kq);
        //Thay the chuoi ki tu thanh = chhuoi khac
        sc.nextLine();
        System.out.print("Nhap chuoi ky tu: ");
        String kytu = sc.nextLine();

        System.out.print("Nhap ki tu dau: ");
        char c = sc.next().charAt(0);

        System.out.print("Nhap ki tu cuoi: ");
        char e = sc.next().charAt(0);

        String kytu1 = kytu.replace(c, e);
        System.out.println("Chuoi sau khi thay the: " + kytu1);
        // Loai bo khoang trang thua
        sc.nextLine();
        System.out.print("Nhap :");
        String hihi =   sc.nextLine();
        String hihi1 = hihi.trim();
        System.out.println("Chuoi sau khi xoa khoang trang" +  hihi1);

        //tao chuoi con tu vi tri trong chuoi
        sc.nextLine();
        System.out.print("Nhap chuoi ky tu: ");
        String abc = sc.nextLine();

        String kytu2 = abc.substring(6);
        System.out.println("Chuoi sau khi thay the: " + kytu2);
    }
}



