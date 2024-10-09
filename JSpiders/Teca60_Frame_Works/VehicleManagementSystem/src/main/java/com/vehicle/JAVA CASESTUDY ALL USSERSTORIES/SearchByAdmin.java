/*US004	
 * As an Administrator, you should be able to search and view the underwriter details.	
 * "When the admin moves to the search functionality, the user is displayed with the below menu:
* View all UnderWriter - All the underWriters registered in the system will be shown with all the fields as mentioned in US003.
*View UnderWriter by Id - Screen will prompt the admin to enter the underWriter Id. 
*On giving a valid Id, the related underwriter details are displayed in the Screen. 
*If Invalid Id is entered, the screen displays the message ""Invalid UnderWriter Id"" with two menu based options:
Re-Enter UnderWriter Id,  Go Back to the previous Screen."
*/



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

    public String getDetails() {
        return "ID: " + underwriterId + ", Name: " + name + ", DOB: " + dob + ", Joining Date: " + joiningDate + ", Password: " + password;
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

public class SearchByAdmin {
    private static List<UnderWriter> underwriters = UnderWriter.createUnderWriters();
    private static final String adminid = "admin";
    private static final String adminpass = "admin123";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!adminLogin(scanner)) {
            System.out.println("Invalid credentials. Exiting...");
            return;
        }

        while (true) {
            System.out.println("\nUnderWriter Search Menu:");
            System.out.println("1. View all UnderWriters");
            System.out.println("2. View UnderWriter by ID");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    viewAllUnderWriters();
                    break;
                case "2":
                    viewUnderWriterById(scanner);
                    break;
                case "3":
                    System.out.println("Exiting UnderWriter Search. Goodbye!");
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
        return username.equals(adminid) && password.equals(adminpass);
    }

    private static void viewAllUnderWriters() {
        System.out.println("\nAll UnderWriters:");
        for (UnderWriter underwriter : underwriters) {
            System.out.println(underwriter.getDetails());
        }
    }

    private static void viewUnderWriterById(Scanner scanner) {
        System.out.print("Enter UnderWriter ID to view details: ");
        int idInput = Integer.parseInt(scanner.nextLine());
        boolean found = false;
        for (UnderWriter underwriter : underwriters) {
            if (underwriter.underwriterId == idInput) {
                System.out.println("UnderWriter Details:");
                System.out.println(underwriter.getDetails());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Invalid UnderWriter ID. Please try again.");
        }
    }
}
