package tcsQuestion.week1;
public class sandwichString {
    public static void main(String[] args) {
        String str = "breadJamdaerb";
        int m = 0;
        for (int i = 0; i < str.length() - i; i++) {

            if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
                m++;
            } else {
                for (int j = m; j < str.length() - m; j++) {
                    System.out.print(str.charAt(j));
                }

            }
        }
    }

}
