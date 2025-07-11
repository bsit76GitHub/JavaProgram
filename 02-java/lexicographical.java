import java.util.Scanner;

public class lexicographical {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        int i, m = 0, n = 0,o;
        for (i = 0; i < s.length() - 2; i++) {
            String c = s.substring(i, i + 3);
            System.out.print(c + " ");
            if (i == 0) {
                smallest = c;
                largest = c;
            }
            char a = c.charAt(0);
            char b = smallest.charAt(0);
            char l = largest.charAt(0);
            m = a;
            n = b;
            o = l;
            if (m < n) {
                smallest = c;
            } 
            if (m > o) {
                largest = c; 
            } 
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
