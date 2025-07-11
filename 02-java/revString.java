import java.util.*;

public class revString {
    public static void revStringPrint(String scr, int idx) {
        if (idx == 0) {
            System.out.print(scr.charAt(idx));
            return;
        }
        System.out.print(scr.charAt(idx));
        revStringPrint(scr, idx - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String scr = sc.nextLine();
        revStringPrint(scr, scr.length() - 1);
    }
}
