
import java.util.Scanner;

class isPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = n;
        int r, m = 0;
        while (n > 0) {
            r = n % 10;
            m = m * 10 + r;
            n = n / 10;
        }
        if (x == m) {
            System.out.println(m + " is a Palindrome No.");
        } else {
            System.out.println(m + " is Not a Palindrome No.");
        }
        sc.close();
    }
}
