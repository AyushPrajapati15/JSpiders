

import java.util.*;

public class AdminUnderwriterRegister {

    private static List<UnderwriterRecord> underwriters = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    private static final String adminid = "admin";
    private static final String adminpass = "admin123";

    public static void main(String[] args) {
        boolean isAdminLoggedIn = performAdminLogin();
        if (!isAdminLoggedIn) {
            System.out.println("Exiting program. Goodbye!");
            return;
        }

        while (true) {
            System.out.println("\nAdmin Menu:");
            System.out.println("1. Register New Underwriter");
            System.out.println("2. View All Underwriters");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    registerNewUnderwriter();
                    break;
                case "2":
                    viewAllUnderwriters();
                    break;
                case "3":
                    System.out.println("Exiting program. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private static boolean performAdminLogin() {
        System.out.println("Admin Login:");
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        if (username.equals(adminid) && password.equals(adminpass)) {
            System.out.println("Admin login successful!");
            return true;
        } else {
            System.out.println("Invalid admin credentials. Please try again.");
            return false;
        }
    }

    private static void registerNewUnderwriter() {
        System.out.println("\nUnderwriter Registration:");

        System.out.print("Enter Underwriter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Date of Birth (YYYY-MM-DD): ");
        String dob = scanner.nextLine();

        System.out.print("Enter Joining Date (YYYY-MM-DD): ");
        String joiningDate = scanner.nextLine();

        String defaultPassword = generateDefaultPassword();

        UnderwriterRecord newUnderwriter = new UnderwriterRecord(name, dob, joiningDate, defaultPassword);
        underwriters.add(newUnderwriter);

        System.out.println("\nUnderwriter registered successfully with ID: " + newUnderwriter.underwriterId);
        System.out.println("Default password for login: " + newUnderwriter.password);
    }

    private static String generateDefaultPassword() {
        String alphanumeric = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String specialChars = "!@#$%^&*()_+-=[]{}|;:,.<>?";
        StringBuilder password = new StringBuilder();

        Random random = new Random();

        password.append(specialChars.charAt(random.nextInt(specialChars.length())));

        for (int i = 0; i < 7; i++) {
            password.append(alphanumeric.charAt(random.nextInt(alphanumeric.length())));
        }

        char[] passwordArray = password.toString().toCharArray();
        for (int i = passwordArray.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            char temp = passwordArray[index];
            passwordArray[index] = passwordArray[i];
            passwordArray[i] = temp;
        }

        return new String(passwordArray);
    }

    private static void viewAllUnderwriters() {
        if (underwriters.isEmpty()) {
            System.out.println("No underwriters registered.");
        } else {
            System.out.println("Underwriters List:");
            for (UnderwriterRecord underwriter : underwriters) {
                System.out.println(underwriter.getDetails());
            }
        }
    }
}

class UnderwriterRecord {
    private static int nextId = 1;

    int underwriterId;
    String name;
    String dob;
    String joiningDate;
    String password;
    List<String> vehicles;

    public UnderwriterRecord(String name, String dob, String joiningDate, String password) {
        this.underwriterId = nextId++;
        this.name = name;
        this.dob = dob;
        this.joiningDate = joiningDate;
        this.password = password;
        this.vehicles = new ArrayList<>();
    }

    public String getDetails() {
        return "ID: " + underwriterId + ", Name: " + name + ", DOB: " + dob + ", Joining Date: " + joiningDate;
    }
}
