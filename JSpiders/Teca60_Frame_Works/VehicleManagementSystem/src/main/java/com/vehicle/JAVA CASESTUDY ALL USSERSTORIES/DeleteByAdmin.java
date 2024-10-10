/*US006	
As an Administrator, you should be able to view and delete the underwriter.	
"When the admin moves to delete underWriter option, the screen will prompt the admin to enter the underWriter Id. 

On Entering valid UnderWriter Id, the screen will ask for confirmation with Yes and No option. 
On pressing 1, the user confirms Yes and record is deleted from the system. On Pressing 2, the user confirms No and we move back to the previous console screen. 

On Entering invalid UnderWriter Id, the screen displays the message ""Invalid UnderWriter Id"" with two menu based options:
Re-Enter UnderWriter Id, Go Back to the previous Screen."*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class UnderWriter {
    private static int nextId = 1;

    int underwriterId;
    String name;
    String dob;
    String joiningDate;
    String password;

    public UnderWriter(int underwriterId, String name, String dob, String joiningDate, String password) {
        this.underwriterId = underwriterId;
        this.name = name;
        this.dob = dob;
        this.joiningDate = joiningDate;
        this.password = password;
    }

    public String getDetails() {
        return "ID: " + underwriterId + ", Name: " + name + ", DOB: " + dob + 
               ", Joining Date: " + joiningDate + ", Password: " + password;
    }

    public static List<UnderWriter> createUnderWriters() {
        List<UnderWriter> underwriters = new ArrayList<>();
        underwriters.add(new UnderWriter(nextId++, "Harsha", "2002-03-09", "2024-03-22", "defaultPassword1"));
        underwriters.add(new UnderWriter(nextId++, "Kiran", "1998-05-15", "2023-11-10", "defaultPassword2"));
        underwriters.add(new UnderWriter(nextId++, "Vijay", "2000-09-28", "2022-07-05", "defaultPassword3"));
        underwriters.add(new UnderWriter(nextId++, "Anusha", "1995-12-12", "2021-04-20", "defaultPassword4"));
        underwriters.add(new UnderWriter(nextId++, "Ravi", "1997-07-31", "2020-12-15", "defaultPassword5"));
        return underwriters;
    }
}

public class DeleteByAdmin {
    private static List<UnderWriter> underwriters = UnderWriter.createUnderWriters();
    private static final String adminId = "admin";
    private static final String adminPass = "admin123";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!adminLogin(scanner)) {
            System.out.println("Invalid credentials. Exiting...");
            return;
        }

        while (true) {
            System.out.println("\nUnderWriter Management Menu:");
            System.out.println("1. View All UnderWriters");
            System.out.println("2. Delete UnderWriter by ID");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    viewAllUnderwriters();
                    break;
                case "2":
                    deleteUnderwriter(scanner);
                    break;
                case "3":
                    System.out.println("Exiting UnderWriter Management. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }

    private static boolean adminLogin(Scanner scanner) {
        System.out.print("Enter admin username: ");
        String username = scanner.nextLine();
        System.out.print("Enter admin password: ");
        String password = scanner.nextLine();

        return username.equals(adminId) && password.equals(adminPass);
    }

    private static void viewAllUnderwriters() {
        System.out.println("\nAll UnderWriters:");
        for (UnderWriter underwriter : underwriters) {
            System.out.println(underwriter.getDetails());
        }
    }

    private static void deleteUnderwriter(Scanner scanner) {
        System.out.print("Enter UnderWriter ID to delete: ");
        int underwriterId = Integer.parseInt(scanner.nextLine());

        boolean found = false;
        for (UnderWriter underwriter : underwriters) {
            if (underwriter.underwriterId == underwriterId) {
                System.out.println("UnderWriter Details:");
                System.out.println(underwriter.getDetails());
                found = true;

                System.out.println("Are you sure you want to delete this UnderWriter?");
                System.out.println("1. Yes");
                System.out.println("2. No");
                int confirmation = Integer.parseInt(scanner.nextLine());

                if (confirmation == 1) {
                    underwriters.remove(underwriter);
                    System.out.println("UnderWriter deleted successfully.");
                } else {
                    System.out.println("Deletion canceled. Returning to the menu.");
                }
                break;
            }
        }

        if (!found) {
            System.out.println("Invalid UnderWriter ID.");
            System.out.println("Options:");
            System.out.println("1. Re-Enter UnderWriter ID");
            System.out.println("2. Go Back to Main Menu");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            if (choice == 2) {
                System.out.println("Returning to the main menu.");
            }
        }
    }
}
