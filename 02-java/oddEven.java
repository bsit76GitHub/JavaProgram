
import java.util.Scanner;

class oddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd number");
        }

        sc.close();
    }
}