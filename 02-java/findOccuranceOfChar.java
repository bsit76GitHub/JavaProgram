import java.util.Scanner;

public class findOccuranceOfChar {

    public static int first = -1;
    public static int last = -1;

    public static void checkOccurence(String str, int idx, char element) {
        if (idx == str.length()) {
            System.out.println("First Occurence  of " + element + " at " + first + "th index.");
            System.out.println("Last Occurence of " + element + " at " + last + "th index.");
            return;
        }
        if (str.charAt(idx) == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        checkOccurence(str, idx + 1, element);

    }

    public static void main(String[] args) {

        String str = "abaacdaefaah";

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter String : ");
        // String str = sc.nextLine();
        // System.out.print("Enter Character to find : ");
        // char element = sc.next().charAt(0);

        checkOccurence(str, 0, 'a');

        // sc.close();
    }

}
