import java.util.Scanner;
public class vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ki tu: ");
        char c = sc.next().charAt(0);
        sc.close();

        boolean isVowel = "aeiouAEIOU".indexOf(c) != -1;

        if (isVowel) {
            System.out.println("La nguyen am");
        } else {
            System.out.println("La phu am");
        }
    }

}