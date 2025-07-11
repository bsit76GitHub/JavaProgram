
//stack height = n
import java.util.*;

public class calPower {

    public static int calc(int x, int n) {
        if (n == 0) {
            return 1;
        } else if (x == 0) {
            return 0;
        }
        int val_nm1 = calc(x, n - 1);
        int val_n = x * val_nm1;
        return val_n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base value and exeponicial value: ");
        int x = sc.nextInt();
        int n = sc.nextInt();
        int ans = calc(x, n);
        System.out.println(ans);

        sc.close();
    }

}
