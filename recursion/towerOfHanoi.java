import java.util.*;

public class towerOfHanoi {
    public static void tower(int n, String s, String h, String d) {
        
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + s + " to " + d);
            return;
        }
        tower(n - 1, s, d, h);
        System.out.println("transfer disk " + n + " from " + s + " to " + d);
        tower(n - 1, h, s, d);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of Disk : ");
        int n = sc.nextInt();
        tower(n, "s", "h", "d" );

        sc.close();
    }
}
