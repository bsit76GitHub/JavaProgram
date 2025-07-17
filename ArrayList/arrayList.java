import java.util.ArrayList;
public class arrayList {
    public static void main(String[] args) {
         // Declare and initialize an ArrayList of Strings
         ArrayList<String> students = new ArrayList<String>();
        students.add("Ram");
        students.add("Shyam");
        students.add("Rohan");
        System.out.println(students);
        System.out.println(students.get(2));

        for (String stu : students) {
            System.out.println(stu.toUpperCase());
        }
    }
}
