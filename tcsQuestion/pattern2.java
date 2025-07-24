package tcsQuestion;

public class pattern2 {
    public static void main(String[] args) {
        int n = 8;

        for (int i = n; i > 0; i--) {
            int x = 1;
            for (int j = 1; j <= ((n * 4) - 3); j++) {
                if (j % 2 == 0) {
                    System.out.print("-");
                } else {
                    if (x <= i) {
                        System.out.print(x);
                        x++;
                    } else if (j > i) {
                        
                        System.out.print("*");
                    } else {
                        System.out.print("#");
                    }

                }

            }

            System.out.println();

        }

        // ==========================================
        // for (int i = n; i > 0; i--) {
        // // for (int j = 1; j <= i; j++) {
        // // System.out.print(j + "-");
        // // }
        // // for (int j = i - 1; j > 0; j--) {
        // // System.out.print(j + "-");
        // // }

        // int j = 1;
        // while (j <= n) {
        // if (j <= i) {
        // System.out.print(j + "-");

        // j++;
        // }
        // // System.out.print("-");
        // if (j > i && j <= n) {
        // System.out.print("-" + "-");
        // j++;
        // }
        // }
        // // System.out.println();
        // // System.out.println(j);

        // if (i == n) {
        // j = i - 1;
        // } else {
        // j = i;
        // }
        // while (j > 0) {
        // if (j > i && j < n) {
        // System.out.print("#" + "-");
        // j--;
        // }

        // if (j > 0) {
        // System.out.print(j + "-");
        // j--;
        // }
        // }
        // }
        // ======================================

    }
}
