import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args)
    {
        int n ;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n%2==0)
        {
             System.out.println("This is Number even");
        }
        else {
            System.out.println("This is Number odd");
        }
    }
}
