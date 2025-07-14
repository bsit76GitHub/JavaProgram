
import java.util.*;

public class fibonacci {
    public static void fib(int n, int a, int b) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.print(c + " ");
        fib(n - 1, b, c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth term : ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        fib(n - 2, a, b);
        sc.close();
    }
}
