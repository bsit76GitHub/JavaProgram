import java.io.BufferedReader;
import java.io.InputStreamReader;

class bufferedReader {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int x, y, z;
        System.out.println("Enter two no.: ");
        x = Integer.parseInt(in.readLine());
        y = Integer.parseInt(in.readLine());
        z = x + y;
        System.out.println("Sum of " + x + " and " + y + " = " + z);

    }
}
