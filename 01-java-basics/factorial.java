
import java.util.Scanner;

class factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = 1;
        int m = n;
        while (m > 0) {
            f = f * m;
            m--;
        }
        System.out.println("Factorials of " + n + " = " + f);
        sc.close();
    }
}
