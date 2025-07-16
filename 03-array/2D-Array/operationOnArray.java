
import java.util.*;

public class operationOnArray {

    Scanner sc = new Scanner(System.in);

    public void Array_1D() {

        System.out.println("Enter length of Array.");
        int n1 = sc.nextInt();
        int array1[] = new int[n1];
        System.out.println("Enter elements : ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = sc.nextInt();
        }

        boolean status1 = true;
        while (status1) {
            System.out.println(
                    "Enter your Choice : \n1 : Print Array. \n2 : Sum and Average of element. \n3: Even Element \n4 : Odd Element. \n5 : Exit. \n6 : Main Menu.");
            int ch1 = sc.nextInt();

            switch (ch1) {
                case 1:
                    // print array :
                    System.out.println("Array : ");
                    for (int i = 0; i < array1.length; i++) {
                        System.out.print(array1[i] + " ");
                    }
                    System.out.println("");
                    break;
                case 2:
                    // Sum and Average of element.
                    int sum = 0;
                    for (int i = 0; i < array1.length; i++) {
                        sum += array1[i];
                    }
                    System.out.println("Sum = " + sum);
                    System.out.println("Average = " + sum / array1.length);
                    break;
                case 3:
                    // Even Element
                    System.out.println("Even Element");
                    int sumEven = 0, numberEven = 0;
                    for (int i = 0; i < array1.length; i++) {
                        if (array1[i] % 2 == 0) {
                            System.out.print(array1[i] + " ");
                            sumEven += array1[i];
                            numberEven++;
                        }
                        System.out.println();
                    }
                    System.out.println("Sum of Even element= " + sumEven);
                    System.out.println("Average of Even element= " + sumEven / numberEven);
                    break;
                case 4:
                    // Odd Element
                    System.out.println("Odd Element");
                    int sumOdd = 0, numberOdd = 0;
                    for (int i = 0; i < array1.length; i++) {
                        if (array1[i] % 2 != 0) {
                            System.out.println(array1[1] + " ");
                            sumOdd += array1[i];
                            numberOdd++;
                        }
                        System.out.println(" ");
                    }
                    System.out.println("Sum of Odd element= " + sumOdd);
                    System.out.println("Average of Odd element= " + sumOdd / numberOdd);
                    break;
                case 5:
                    status1 = false;
                    break;

                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }

    public void Array_2D() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and column no. :");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] array2 = new int[r][c];
        System.out.println("Enter elements : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                array2[i][j] = sc.nextInt();
            }
        }

        boolean status2 = true;
        while (status2) {
            System.out.println(
                    "Enter your Choice : \n1 : Print Matrix. \n2 : Sum and Average of element. \n3 : Even Element \n4 : Odd Element. \n5 : Both Diagonal. \n6 : Left Diagonal. \n7 : Right Diagonal. \n8 : Exit. \n9 : Main Menu.");
            int ch2 = sc.nextInt();
            switch (ch2) {
                case 1:
                    System.out.println("2D-Array/Matrix : ");
                    for (int i = 0; i < r; i++) {
                        for (int j = 0; j < c; j++) {
                            System.out.print(array2[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Sum and Average of element : ");
                    break;
                case 3:
                    System.out.println("Even Element : ");
                    break;
                case 4:
                    System.out.println("Odd Element : ");
                    break;
                case 5:

                    System.out.println("Diagonal of 2D-Array/Matrix : ");
                    for (int i = 0; i < r; i++) {
                        for (int j = 0; j < c; j++) {
                            if (i == j || i + j == r - 1 || i + j == c - 1) {
                                System.out.print(array2[i][j] + " ");
                            } else
                                System.out.print(" ");
                        }
                        System.out.println();
                    }
                    break;
                case 6:
                    System.out.println("Left Diagonal of 2D-Array/Matrix : ");
                    for (int i = 0; i < r; i++) {
                        for (int j = 0; j < c; j++) {
                            if (i == j) {
                                System.out.print(array2[i][j] + " ");
                            } else
                                System.out.print(" ");
                        }
                        System.out.println();
                    }
                    break;
                case 7:
                    System.out.println("Right Diagonal of 2D-Array/Matrix : ");
                    for (int i = 0; i < r; i++) {
                        for (int j = 0; j < c; j++) {
                            if (i + j == r - 1) {
                                System.out.print(array2[i][j] + " ");
                            } else
                                System.out.print(" ");
                        }
                        System.out.println();
                    }
                    break;
                case 8:
                    status2 = false;
                    break;

                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean status = true;
        System.out.println("Enter your Choice : \n 1 : 1D-Array\n 2 : 2D-Array\n 3 : Exit");
        int ch = sc.nextInt();
        while (status) {
            switch (ch) {
                case 1:
                    operationOnArray obj1 = new operationOnArray();
                    obj1.Array_1D();
                    break;
                case 2:
                    operationOnArray obj2 = new operationOnArray();
                    obj2.Array_2D();
                    break;
                case 3:
                    status = false;
                    break;

                default:
                    System.out.println("Invalid Choice");
                    break;
            }

        }
        sc.close();
    }

}
