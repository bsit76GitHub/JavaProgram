import java.util.Scanner;

public class Employee {
    int id;
    String name;
    String department;
    double asal;
    double tax;
    static Scanner sc = new Scanner(System.in);

    void setData() {
        System.out.println("Enter id name department asal respectivily.: ");
        id = sc.nextInt();
        name = sc.next();
        department = sc.next();
        asal = sc.nextDouble();

    }

    void getData() {
        System.out.println(
                "ID: " + id + "\t" + "Name: " + name + "\t" + "Department: " + department + "\t" + "Anual Salery: "
                        + asal + "\t" + "Tax: " + tax);
    }

    void calc() {
        if (asal <= 1200000) {
            tax = 0;
        } else if (asal > 1200000 && asal <= 2000000) {
            tax = asal * 10 / 100;
        } else if (asal > 2000000 && asal <= 5000000) {
            tax = asal * 25 / 100;
        } else {
            tax = asal * 50 / 100;
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter no. of employees:");
        int n = sc.nextInt();
        Employee employee[] = new Employee[n];
        for (int i = 0; i < n; i++) {
            employee[i] = new Employee();
            employee[i].setData();
        }
        for (int i = 0; i < n; i++) {
            employee[i].calc();
        }
        for (int i = 0; i < n; i++) {
            employee[i].getData();
        }
    }
}