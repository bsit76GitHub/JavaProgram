
import java.util.*;

public class printwholeno {
  public static void printno(int n, int m) {
    if (n == m) {
      return;
    }
    System.out.println(n);
    printno(n + 1, m);
  }

  public static void main(String[] args) {

    System.out.println("hello");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a no. : ");
    int n = sc.nextInt();
    int m = n;

    System.out.println(n + " " + m);
    printno(1, m);

    sc.close();
  }
}
