
import java.util.*;

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

public class AdminConsole {
    private static final String adminid = "admin";
    private static final String adminpass = "admin1";
    private static List<UnderwriterRecord> underwriterList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nStar Protect Vehicle System - Admin Console");
            System.out.println("1. Admin Login");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                if (performAdminLogin()) {
                    displayAdminMenu();
                }
            } else if (choice.equals("2")) {
                System.out.println("Exiting Admin Console. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static boolean performAdminLogin() {
        System.out.print("Enter Admin ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Admin Password: ");
        String password = scanner.nextLine();

        if (id.equals(adminid) && password.equals(adminpass)) {
            System.out.println("Admin login successful!");
            return true;
        } else {
            System.out.println("Invalid admin credentials.");
            return false;
        }
    }

    private static void displayAdminMenu() {
        while (true) {
            System.out.println("\nAdmin Menu:");
            System.out.println("1. Register New Underwriter");
            System.out.println("2. Search Underwriter by ID");
            System.out.println("3. Update Underwriter Password");
            System.out.println("4. Delete Underwriter by ID");
            System.out.println("5. View All Underwriter Records");
            System.out.println("6. View All Vehicles for Underwriter");
            System.out.println("7. Logout");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    registerNewUnderwriter();
                    break;
                case "2":
                    searchUnderwriterById();
                    break;
                case "3":
                    updateUnderwriterPassword();
                    break;
                case "4":
                    deleteUnderwriterById();
                    break;
                case "5":
                    viewAllUnderwriterRecords();
                    break;
                case "6":
                    viewVehiclesForUnderwriter();
                    break;
                case "7":
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void registerNewUnderwriter() {
        System.out.print("Enter Underwriter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Date of Birth (yyyy-MM-dd): ");
        String dob = scanner.nextLine();

        System.out.print("Enter Joining Date (yyyy-MM-dd): ");
        String joiningDate = scanner.nextLine();

        String defaultPassword = generateDefaultPassword();

        UnderwriterRecord newUnderwriter = new UnderwriterRecord(name, dob, joiningDate, defaultPassword);
        underwriterList.add(newUnderwriter);

        System.out.println("\nNew Underwriter registered successfully. Details:");
        System.out.println("Underwriter ID: " + newUnderwriter.underwriterId);
        System.out.println("Name: " + newUnderwriter.name);
        System.out.println("Date of Birth: " + newUnderwriter.dob);
        System.out.println("Joining Date: " + newUnderwriter.joiningDate);
        System.out.println("Default Password: " + defaultPassword);
    }

    private static void searchUnderwriterById() {
        System.out.print("Enter Underwriter ID to search: ");
        try {
            int id = Integer.parseInt(scanner.nextLine());
            UnderwriterRecord underwriter = findUnderwriterById(id);
            if (underwriter != null) {
                System.out.println("Underwriter found: " + underwriter.getDetails());
            } else {
                System.out.println("No Underwriter found with ID: " + id);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID format. Please enter a number.");
        }
    }

    private static void updateUnderwriterPassword() {
        System.out.print("Enter Underwriter ID to update password: ");
        try {
            int id = Integer.parseInt(scanner.nextLine());
            UnderwriterRecord underwriter = findUnderwriterById(id);
            if (underwriter != null) {
                System.out.print("Enter new password: ");
                String newPassword = scanner.nextLine();
                underwriter.password = newPassword;
                System.out.println("Password updated successfully for Underwriter ID: " + id);
            } else {
                System.out.println("No Underwriter found with ID: " + id);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID format. Please enter a number.");
        }
    }

    private static void deleteUnderwriterById() {
        System.out.print("Enter Underwriter ID to delete: ");
        try {
            int id = Integer.parseInt(scanner.nextLine());
            UnderwriterRecord underwriter = findUnderwriterById(id);
            if (underwriter != null) {
                underwriterList.remove(underwriter);
                System.out.println("Underwriter with ID " + id + " has been deleted.");
            } else {
                System.out.println("No Underwriter found with ID: " + id);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID format. Please enter a number.");
        }
    }

    private static void viewAllUnderwriterRecords() {
        if (underwriterList.isEmpty()) {
            System.out.println("No Underwriter records found.");
        } else {
            System.out.println("\nUnderwriter Records:");
            for (UnderwriterRecord record : underwriterList) {
                System.out.println(record.getDetails());
            }
        }
    }

    private static void viewVehiclesForUnderwriter() {
        System.out.print("Enter Underwriter ID to view vehicles: ");
        try {
            int id = Integer.parseInt(scanner.nextLine());
            UnderwriterRecord underwriter = findUnderwriterById(id);
            if (underwriter != null) {
                if (underwriter.vehicles.isEmpty()) {
                    System.out.println("No vehicles registered for Underwriter ID: " + id);
                } else {
                    System.out.println("Vehicles for Underwriter ID " + id + ":");
                    for (String vehicle : underwriter.vehicles) {
                        System.out.println(vehicle);
                    }
                }
            } else {
                System.out.println("No Underwriter found with ID: " + id);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID format. Please enter a number.");
        }
    }

    private static UnderwriterRecord findUnderwriterById(int id) {
        for (UnderwriterRecord underwriter : underwriterList) {
            if (underwriter.underwriterId == id) {
                return underwriter;
            }
        }
        return null;
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
}



