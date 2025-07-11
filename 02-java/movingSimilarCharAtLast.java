//moving all b at last of string

public class movingSimilarCharAtLast {
    public static void newString(String str, char ch, int idx, int count, String string1) {
        if (idx == str.length()) {
            for (int i = 0; i <= count; i++) {
                string1 += 'b';
            }
            System.out.print(string1);
            return;
        }
        if (str.charAt(idx) == ch) {
            count++;
            newString(str, ch, idx + 1, count, string1);
        } else {
            string1 += str.charAt(idx);
            newString(str, ch, idx + 1, count, string1);
        }
    }

    public static void main(String[] args) {
        String str = "absbbsdbsbfb";
        newString(str, 'b', 0, 0, "");
    }
}
