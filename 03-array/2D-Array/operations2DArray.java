
import java.util.*;

public class operations2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and column no. :");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] array = new int[r][c];
        System.out.println("Enter element : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        boolean status = true;
        while (status) {
            System.out.println(
                    "Enter your choice For : \n1 : Print Matrix.\n2 : Left Diagonal.\n3 : Right Diagonal.\n4 : Both Diagonal.\n5 : Terminate loop.");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Input 2D-Array/Matrix : ");
                    for (int i = 0; i < r; i++) {
                        for (int j = 0; j < c; j++) {
                            System.out.print(array[i][j] + " ");
                        }
                        System.out.println();
                    }

                    break;
                case 2:
                    // Left Diagonal of array
                    System.out.println("Left Diagonal of 2D-Array/Matrix : ");
                    for (int i = 0; i < r; i++) {
                        for (int j = 0; j < c; j++) {
                            if (i == j) {
                                System.out.print(array[i][j] + " ");
                            } else
                                System.out.print(" ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    // Right Diagonal of array
                    System.out.println("Right Diagonal of 2D-Array/Matrix : ");
                    for (int i = 0; i < r; i++) {
                        for (int j = 0; j < c; j++) {
                            if (i + j == r - 1) {
                                System.out.print(array[i][j] + " ");
                            } else
                                System.out.print(" ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    // Diagonal of array
                    System.out.println("Diagonal of 2D-Array/Matrix : ");
                    for (int i = 0; i < r; i++) {
                        for (int j = 0; j < c; j++) {
                            if (i == j || i + j == r - 1 || i + j == c - 1) {
                                System.out.print(array[i][j] + " ");
                            } else
                                System.out.print(" ");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println(ch);
                    status = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }

        sc.close();
    }

}