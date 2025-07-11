

public class isPalindrome {
    public static void main(String[] args) {
        String text = "mad";
        String text2 = "";
        for (int i = 0; i < text.length(); i++) {
            text2 = text.charAt(i) + text2;
        }
        if (text.equals(text2))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
