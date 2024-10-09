/*US005	
As an Administrator, you should be able to view and update the underwriter details.	
"When the admin moves to update underWriter Details, the screen will prompt the admin to enter the underWriter Id. 
On Entering valid UnderWriter Id, the screen will prompt the admin to enter a new password. The new password is henceforth recorded in the system. 
On Entering invalid UnderWriter Id, the screen displays the message ""Invalid UnderWriter Id"" with two menu based options:
Re-Enter UnderWriter Id, Go Back to the previous Screen."*/



import java.util.*;

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

public class UpdateByAdmin {
    private static List<UnderWriter> underwriters = UnderWriter.createUnderWriters();
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "admin123";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!adminLogin(scanner)) {
            System.out.println("Invalid credentials. Exiting...");
            return;
        }

        while (true) {
            System.out.println("\nUnderWriter Update Menu:");
            System.out.println("1. View all UnderWriters");
            System.out.println("2. Update UnderWriter details");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    viewAllUnderWriters();
                    break;
                case "2":
                    updateUnderwriterDetails(scanner);
                    break;
                case "3":
                    System.out.println("Exiting UnderWriter Update. Goodbye!");
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
        return username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD);
    }

    private static void viewAllUnderWriters() {
        System.out.println("\nAll UnderWriters:");
        for (UnderWriter underwriter : underwriters) {
            System.out.printf("%d, \"%s\", \"%s\", \"%s\", \"%s\"%n", 
                underwriter.underwriterId, underwriter.name, underwriter.dob, 
                underwriter.joiningDate, underwriter.password);
        }
    }

    private static void updateUnderwriterDetails(Scanner scanner) {
        while (true) {
            System.out.print("Enter UnderWriter Id: ");
            int idInput = Integer.parseInt(scanner.nextLine());
            
            UnderWriter underwriter = findUnderWriter(idInput);
            
            if (underwriter != null) {
                System.out.println("Before:");
                System.out.printf("%d, \"%s\", \"%s\", \"%s\", \"%s\"%n", 
                    underwriter.underwriterId, underwriter.name, underwriter.dob, 
                    underwriter.joiningDate, underwriter.password);

                System.out.print("Enter new password: ");
                String newPassword = scanner.nextLine();
                underwriter.password = newPassword;
                
                System.out.println("\nThe new password is henceforth recorded in the system.");
                
                System.out.println("\nAfter:");
                System.out.printf("%d, \"%s\", \"%s\", \"%s\", \"%s\"%n", 
                    underwriter.underwriterId, underwriter.name, underwriter.dob, 
                    underwriter.joiningDate, underwriter.password);
                return;
            } else {
                System.out.println("Invalid UnderWriter Id");
                System.out.println("Options:");
                System.out.println("1. Re-Enter UnderWriter Id");
                System.out.println("2. Go Back to the previous Screen");
                System.out.print("Enter your choice (1/2): ");
                
                String choice = scanner.nextLine();
                if (choice.equals("2")) {
                    return;
                }
            }
        }
    }

    private static UnderWriter findUnderWriter(int id) {
        for (UnderWriter underwriter : underwriters) {
            if (underwriter.underwriterId == id) {
                return underwriter;
            }
        }
        return null;
    }
}
