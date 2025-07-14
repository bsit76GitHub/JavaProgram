import java.util.Scanner;

public class print2DArray {
    public static void main(String[] arg){
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
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        

        sc.close();
    }
    
}