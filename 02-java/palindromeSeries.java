import java.util.Scanner;

class palindromeSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower and Upper limit respectively : ");
        int l = sc.nextInt();
        int u = sc.nextInt();
        System.out.println("Palindrome Number from " + l + " to " + u + " : ");
        int c = 0;
        for (int x = l; x <= u; x++) {
            int n = x;
            int r, m = 0;
            while (n > 0) {
                r = n % 10;
                m = m * 10 + r;
                n = n / 10;
            }
            if (x == m) {
                System.out.print(m + " ");
                c++;
            }
            
        }
        if (c == 0) {
                System.out.println("Not Palindrome number found.");
            }
        System.out.println();
        sc.close();
    }
}
