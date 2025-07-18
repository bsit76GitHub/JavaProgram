import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class currencyFormater {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        String u = formatCurrency(payment, Locale.US);
        String i = formatCurrency(payment, new Locale("en", "IN"));
        String c = formatCurrency(payment, Locale.CHINA);
        String f = formatCurrency(payment, Locale.FRANCE);

        System.out.println("US: " + u);
        System.out.println("India: " + i);
        System.out.println("China: " + c);
        System.out.println("France: " + f);

        scanner.close();
    }

    private static String formatCurrency(double amount, Locale locale) {
        return NumberFormat.getCurrencyInstance(locale).format(amount);
    }
}
