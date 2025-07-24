package tcsQuestion;

public class pattern1 {
    public static void main(String[] args) {
        int n = 15;
        int k = 1;

        // method : 1

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(k + "\t");
        //         if (k == n) {
        //             break;
        //         }
        //         k++;
        //     }
        //     if (k == n) {
        //         break;
        //     }
        //     System.out.println();
        // }

        // method 2 :
        for (int i = 1; i <= n; i++) {
            if (k <= n) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(k + "\t");
                    k++;
                }
                System.out.println();
            }
        }

    }
}
