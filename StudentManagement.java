import java.util.HashMap;
import java.util.Scanner;
public class StudentManagement {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. View Student");
            System.out.println("3. Display All Students");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Choose Option: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    students.put(id, name);

                    System.out.println("Student Added Successfully");

                    break;

                case 2:

                    System.out.print("Enter Student ID: ");

                    int searchId = sc.nextInt();

                    if (students.containsKey(searchId)) {

                        System.out.println(
                                "Student Name: "
                                        + students.get(searchId));

                    } else {

                        System.out.println("Student Not Found");
                    }

                    break;

                case 3:

                    System.out.println("\nAll Student Records:");

                    for (Integer key : students.keySet()) {

                        System.out.println(
                                "ID: " + key +
                                " Name: " + students.get(key));
                    }

                    break;

                case 4:

                    System.out.print("Enter Student ID to Delete: ");

                    int deleteId = sc.nextInt();

                    students.remove(deleteId);

                    System.out.println("Student Deleted");

                    break;

                case 5:

                    System.out.println("Program Ended");

                    sc.close();

                    return;

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}