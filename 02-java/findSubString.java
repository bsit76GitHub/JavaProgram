import java.util.*;

public class findSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] str = { "rabbit", "cab", "lab", "tablet" };
        for (int i = 0; i < str.length; i++) {
            String str2 = str[i];
            if (str2.contains("ab") && str2.length() > 4) {
                System.out.println(str2);
            }
        }
        sc.close();
    }
}
