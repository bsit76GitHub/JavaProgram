import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationVector {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<Integer>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        System.out.println("Using Iterator Interface : ");
        Iterator i = vector.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("Using Enumeration Interface : ");
        Enumeration enumeration = vector.elements();
        {
            System.out.println(enumeration.nextElement());
        }
    }
}
