
import java.util.Scanner;

class isPrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                f++;
            }
        }
        if (f == 2) {
            System.out.println(n + " Prime No.");
        } else {
            System.out.println(n + " Not a Prime No.");
        }

        sc.close();
    }
}
