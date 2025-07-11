import java.util.Scanner;

class primeSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower and Upper limit respectively : ");
        int l = sc.nextInt();
        int u = sc.nextInt();
        int n = 0;
        System.out.println("Prime Number from " + l + " to " + u + " : ");
        for (int i = l; i <= u; i++) {
            int f = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    f++;
                }

            }
            if (f == 2) {
                System.out.print(i + " ");
                n++;
            }
        }
        if (n == 0) {
            System.out.println("No Prime number found.");
        } else {
            System.out.println();
        }
        sc.close();
    }
}
