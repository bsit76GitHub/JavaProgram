
import java.util.Scanner;

class reverseNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r, m = 0;
        while (n > 0) {
            r = n % 10;
            m = m * 10 + r;
            n = n / 10;
        }
        System.out.println(m);

        sc.close();
    }

}
