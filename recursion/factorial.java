
//package recursion;
import java.util.*;

public class factorial {

  public static int calcFac(int n) {
    if (n == 0 || n == 0) {
      return 1;
    }
    int fac_nm1 = calcFac(n - 1);
    int fac = n * fac_nm1;
    return fac;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a no. :");
    int n = sc.nextInt();
    int result = calcFac(n);
    System.out.println(result);

    sc.close();
  }
}
