import java.util.Scanner;

public class Bai7 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();

            if (isPalindrome(input)) {
                System.out.println(input + " là chuỗi đối xứng.");
            } else {
                System.out.println(input + " không phải là chuỗi đối xứng.");
            }
        }

        // Phương thức kiểm tra chuỗi đối xứng
        public static boolean isPalindrome(String str) {
            // Loại bỏ khoảng trắng và chuyển đổi chuỗi thành chữ thường để kiểm tra không phân biệt hoa thường
            str = str.replaceAll("\\s+", "").toLowerCase();

            StringBuilder reversedStr = new StringBuilder(str);
            reversedStr.reverse(); // Đảo ngược chuỗi

            return str.equals(reversedStr.toString()); // So sánh chuỗi ban đầu với chuỗi đảo ngược
        }


}
