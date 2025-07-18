import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
         Calendar c = new GregorianCalendar();
   c.set(year, month-1,day );    

      return (c.getDisplayName(c.DAY_OF_WEEK, Calendar.LONG, Locale.ENGLISH)).toUpperCase();
    }

}

public class date {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();
        String res = Result.findDay(month, day, year);
        System.out.println(res);
        
        sc.close();
    }
}
