/*Us007	
As an administrator, you should be able to view all the Vehicle Details that are registered by specific UnderWriter. 	
"When the admin moves to the vehicle view Functionality for the specific UnderWriter, the screen prompts the admin to enter the underWriter Id. 

On Entering a valid UnderWriter Id, the list of Vehicles registered with the specific underWriter Id is displayed.
This will help the Admin to keep a track on the performance of UnderWriter. Details of Vehicle record will be displayed as below:
PolicyNo
VehicleNo
VehicleType
CustomerName
EngineNo
ChasisNo
PhoneNo
PremiumAmnt
Type (Full Insurance/ThirdParty)
FromDate
ToDate

On Entering invalid UnderWriter Id, the screen displays the message ""Invalid UnderWriter Id"" with two menu based options:
Re-Enter UnderWriter Id, Go Back to the previous Screen."*/

import java.util.*;

class Vehicle {
    String policyNo, vehicleNo, vehicleType, customerName, engineNo, chasisNo, phoneNo, type, fromDate, toDate;
    int premiumAmount;

    public Vehicle(String policyNo, String vehicleNo, String vehicleType, String customerName, String engineNo, String chasisNo, String phoneNo, int premiumAmount, String type, String fromDate, String toDate) {
        this.policyNo = policyNo;
        this.vehicleNo = vehicleNo;
        this.vehicleType = vehicleType;
        this.customerName = customerName;
        this.engineNo = engineNo;
        this.chasisNo = chasisNo;
        this.phoneNo = phoneNo;
        this.premiumAmount = premiumAmount;
        this.type = type;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public String toString() {
        return "PolicyNo: " + policyNo + 
               ", VehicleNo: " + vehicleNo + 
               ", VehicleType: " + vehicleType + 
               ", CustomerName: " + customerName + 
               ", EngineNo: " + engineNo + 
               ", ChasisNo: " + chasisNo + 
               ", PhoneNo: " + phoneNo + 
               ", PremiumAmount: " + premiumAmount + 
               ", Type: " + type + 
               ", FromDate: " + fromDate + 
               ", ToDate: " + toDate;
    }
}

public class ViewVehicleByUnderwriterId {
    private static final String adminid = "admin";
    private static final String adminpass = "admin123";
    
    private static List<String> underwriterIds = Arrays.asList("UW1", "UW2", "UW3", "UW4", "UW5");
    
    private static Map<String, List<Vehicle>> vehiclesByUnderwriter = new HashMap<>();

    static {
        vehiclesByUnderwriter.put("UW1", Arrays.asList(
            new Vehicle("P1", "V1", "Car", "harsha", "EN1", "CH1", "1234567890", 1000, "Full Insurance", "2024-01-01", "2025-01-01"),
            new Vehicle("P2", "V2", "Bike", "vardhini", "EN2", "CH2", "0987654321", 500, "Third Party", "2024-02-01", "2025-02-01")
        ));

        vehiclesByUnderwriter.put("UW2", Arrays.asList(
            new Vehicle("P3", "V3", "Truck", "narendra", "EN3", "CH3", "1122334455", 1500, "Full Insurance", "2024-03-01", "2025-03-01")
        ));
        
        vehiclesByUnderwriter.put("UW3", Arrays.asList(
            new Vehicle("P4", "V4", "Car", "lokesh", "EN4", "CH4", "2233445566", 1200, "Full Insurance", "2024-04-01", "2025-04-01")
        ));

        vehiclesByUnderwriter.put("UW4", Arrays.asList(
            new Vehicle("P5", "V5", "Bike", "tejesh", "EN5", "CH5", "3344556677", 700, "Third Party", "2024-05-01", "2025-05-01")
        ));
        
        vehiclesByUnderwriter.put("UW5", Arrays.asList(
            new Vehicle("P6", "V6", "SUV", "anusha", "EN6", "CH6", "5566778899", 1300, "Full Insurance", "2024-06-01", "2025-06-01")
        ));
    }

    public static void main(String[] args) {
        if (!adminLogin()) {
            System.out.println("Invalid credentials. Exiting...");
            return;
        }
        mainMenu();
    }

    private static boolean adminLogin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter admin username: ");
        String username = scanner.nextLine();
        System.out.print("Enter admin password: ");
        String password = scanner.nextLine();
        return username.equals(adminid) && password.equals(adminpass);
    }

    private static void mainMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. View Vehicles by Underwriter ID");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                viewVehiclesByUnderwriterId(scanner);
            } else if (choice.equals("2")) {
                System.out.println("Exiting program...");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void viewVehiclesByUnderwriterId(Scanner scanner) {
        System.out.print("Enter Underwriter ID: ");
        String underwriterId = scanner.nextLine();

        if (vehiclesByUnderwriter.containsKey(underwriterId)) {
            System.out.println("Vehicles for Underwriter ID " + underwriterId + ":");
            List<Vehicle> vehicles = vehiclesByUnderwriter.get(underwriterId);
            for (Vehicle vehicle : vehicles) {
                System.out.println(vehicle);
            }
        } else {
            System.out.println("Invalid Underwriter ID");
            System.out.println("1. Re-Enter Underwriter ID");
            System.out.println("2. Go Back to the previous Screen");
            String choice = scanner.nextLine();
            if (choice.equals("1")) {
                viewVehiclesByUnderwriterId(scanner);
            } else {
                System.out.println("Returning to previous screen...");
            }
        }
    }
}






