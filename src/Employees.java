import java.util.Scanner;

/**
 * @author crkimberley on 24/08/2016.
 */
public class Employees {
    private String[] names = new String[10];
    private int[] ids = new int[10];

    public static void main(String[] args) {
        Employees employeeDetails = new Employees();
        employeeDetails.launch();
    }

    private void launch() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter names (lower case) & IDs of all 10 employees");
        for (int i=0; i<10; i++) {
            System.out.println("Employee " + i);
            System.out.print("Enter name: ");
            names[i] = input.next();
            System.out.print("Enter ID: ");
            ids[i] = input.nextInt();
        }
        System.out.println("\nID < 1,000");
        for (int i=0; i<10; i++) {
            if (ids[i] < 1000) {
                System.out.println(names[i] + ": " + ids[i]);
            }
        }
        System.out.println("\nName starts with j or s");
        for (int i=0; i<10; i++) {
            if (names[i].charAt(0) == 'j' || names[i].charAt(0) == 's') {
                System.out.println(names[i] + ": " + ids[i]);
            }
        }
    }
}
