
import java.util.Scanner;

class greaterNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // if (a > b) {
        // System.out.println("Greater no. is " + a);
        // } else {
        // System.out.println("Greater no. is " + b);
        // }

        int c = (a > b) ? a : b; // Ternary Operator
        System.out.println("greater no. is " + c);

        sc.close();
    }
}
