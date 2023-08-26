import java.util.Scanner;
public class year {
    public static void main(String[] args)
    {
         int year ;
         Scanner sc = new Scanner(System.in);
         System.out.println("Nhap nam ban muon tim : ");
                 year = sc.nextInt();
         if(year%4==0){
             if(year%100==0)
             {
                 if(year%400==0)
                 {
                     System.out.println("Day la nam nhuan");

                 }else
                     System.out.println("Day khong phai nam nhuan");


             }
             else {
                 System.out.println("Day la nam nhuan");
             }
         }
         else {
             System.out.println("Day khong phai nam nhuan");

         }

    }
}
