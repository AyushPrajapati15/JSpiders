/*US001	
As a user of 'Star Protect Vehicle' system, you should be able to choose your role	
"Once the user runs the console based application of 'Star protect Vehicle' system, the user should be able to select the role. 
Admin login(If the user enters 1). Admin is the Super User, who will be logged in with default userId and Password. 
UnderWriter Login(If the user enters 2) role, which will be logged in on entering relevant userId and
Password(as saved by the admin in the database).*/

import java.util.Scanner;

public class VehicleSystem {
    private static final String ADMIN_USERID = "admin";
    private static final String ADMIN_PASSWORD = "admin1";
    private static final String UNDERWRITER_USERID = "underwriter1";
    private static final String UNDERWRITER_PASSWORD = "password1";

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        System.out.println("Starting the Star Protect Vehicle System...");

        while (running) {
            displayMainMenu();
            String choice = scanner.nextLine();
            
            switch (choice) {
                case "1":
                    performAdminLogin(scanner);
                    break;
                case "2":
                    performUnderwriterLogin(scanner);
                    break;
                case "3":
                    System.out.println("Exiting the system. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
        System.out.println("System shutdown complete. Thank you for using Star Protect Vehicle System.");
    }

    private void displayMainMenu() {
        System.out.println("Welcome to Star Protect Vehicle System");
        System.out.println("1. Admin Login");
        System.out.println("2. Underwriter Login");
        System.out.println("3. Exit");
        System.out.print("Please select your role (1, 2, or 3): ");
    }

    private void performAdminLogin(Scanner scanner) {
        System.out.print("Enter Admin UserID: ");
        String adminUserId = scanner.nextLine();
        System.out.print("Enter Admin Password: ");
        String adminPassword = scanner.nextLine();

        if (ADMIN_USERID.equals(adminUserId) && ADMIN_PASSWORD.equals(adminPassword)) {
            System.out.println("Admin logged in successfully.");
        
        } else {
            System.out.println("Invalid Admin credentials. Please try again.");
        }
    }

    private void performUnderwriterLogin(Scanner scanner) {
        System.out.print("Enter Underwriter UserID: ");
        String underwriterUserId = scanner.nextLine();
        System.out.print("Enter Underwriter Password: ");
        String underwriterPassword = scanner.nextLine();

        if (UNDERWRITER_USERID.equals(underwriterUserId) && UNDERWRITER_PASSWORD.equals(underwriterPassword)) {
            System.out.println("Underwriter logged in successfully.");

        } else {
            System.out.println("Invalid Underwriter credentials. Please try again.");
        }
    }

    public static void main(String[] args) {
        VehicleSystem vehicleSystem = new VehicleSystem();
        vehicleSystem.start();
    }
}
