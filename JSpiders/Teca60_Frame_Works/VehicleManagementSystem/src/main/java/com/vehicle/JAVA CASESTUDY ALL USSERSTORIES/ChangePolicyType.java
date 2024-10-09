/*US011	
As an UnderWriter, you should be able to change the policy type from Full Insurance to Third party
"When the UnderWriter chooses to change the Insurance type for a Vehicle, the screen should prompt the UnderWriter to enter the policy Id. 
On Entering the correct Policy Id, if the policy type is Third Party, a message is displayed to the user saying 
""There's no provision to update the policy type from Third party to full Insurance"". 
If the policy type is Full insurance, then there will be an option provided to the user to update the insurance type. 
The message should say ""Press U to update the insurance type from full insurance to third party"". 

If the user enters U, the policy type is updated, else the message 'Invalid choice' is displayed in the screen. "*/

import java.util.*;

class Vehicle2 {
    String policyNo, vehicleNo, vehicleType, customerName, engineNo, chasisNo, phoneNo, type, fromDate, toDate;
    int premiumAmount;

    public Vehicle2(String policyNo, String vehicleNo, String vehicleType, String customerName, String engineNo, String chasisNo, String phoneNo, int premiumAmount, String type, String fromDate, String toDate) {
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

    @Override
    public String toString() {
        return "PolicyNo: " + policyNo + ", VehicleNo: " + vehicleNo + ", VehicleType: " + vehicleType + ", CustomerName: " + customerName +
                ", EngineNo: " + engineNo + ", ChasisNo: " + chasisNo + ", PhoneNo: " + phoneNo + ", PremiumAmnt: " + premiumAmount +
                ", Type: " + type + ", FromDate: " + fromDate + ", ToDate: " + toDate;
    }
}

class Underwriter2 {
    String id;
    String password;
    List<Vehicle2> vehicles;

    public Underwriter2(String id, String password) {
        this.id = id;
        this.password = password;
        this.vehicles = new ArrayList<>();
    }
}

public class ChangePolicyType {

    private static List<Underwriter2> underwriters = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static Underwriter2 loggedInUnderwriter;

    static {
        underwriters.add(new Underwriter2("UW1", "password1"));
        underwriters.add(new Underwriter2("UW2", "password2"));
        underwriters.add(new Underwriter2("UW3", "password3"));
        underwriters.add(new Underwriter2("UW4", "password4"));
        underwriters.add(new Underwriter2("UW5", "password5"));

        underwriters.get(0).vehicles.add(new Vehicle2("P1", "V1", "Car", "harsha", "EN1", "CH1", "1234567890", 1000, "Full Insurance", "2024-01-01", "2025-01-01"));
        underwriters.get(0).vehicles.add(new Vehicle2("P2", "V2", "Bike", "vardhini", "EN2", "CH2", "0987654321", 500, "Third Party", "2024-02-01", "2025-02-01"));
        underwriters.get(1).vehicles.add(new Vehicle2("P3", "V3", "Truck", "narendra", "EN3", "CH3", "1122334455", 1500, "Full Insurance", "2024-03-01", "2025-03-01"));
        underwriters.get(2).vehicles.add(new Vehicle2("P4", "V4", "Car", "lokesh", "EN4", "CH4", "2233445566", 1200, "Full Insurance", "2024-04-01", "2025-04-01"));
        underwriters.get(3).vehicles.add(new Vehicle2("P5", "V5", "Bike", "tejesh", "EN5", "CH5", "3344556677", 700, "Third Party", "2024-05-01", "2025-05-01"));
        underwriters.get(4).vehicles.add(new Vehicle2("P6", "V6", "SUV", "anusha", "EN6", "CH6", "5566778899", 1300, "Full Insurance", "2024-06-01", "2025-06-01"));
    }

    public static void main(String[] args) {
        loginUnderwriter();
    }

    private static void loginUnderwriter() {
        System.out.print("Enter Underwriter ID: ");
        String underwriterId = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        for (Underwriter2 underwriter : underwriters) {
            if (underwriter.id.equals(underwriterId) && underwriter.password.equals(password)) {
                loggedInUnderwriter = underwriter;
                mainMenu();
                return;
            }
        }

        System.out.println("Invalid Underwriter ID or Password");
        loginUnderwriter();
    }

    private static void mainMenu() {
        while (true) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. View Policies");
            System.out.println("2. Change Policy Type");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                viewPolicies();
            } else if (choice.equals("2")) {
                changePolicyType();
            } else if (choice.equals("3")) {
                System.out.println("Exiting program...");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void viewPolicies() {
        System.out.println("\n--- Policies ---");
        for (Vehicle2 vehicle : loggedInUnderwriter.vehicles) {
            System.out.println(vehicle);
        }
    }

    private static void changePolicyType() {
        System.out.print("Enter Policy ID: ");
        String policyId = scanner.nextLine();

        Vehicle2 vehicleToChange = null;
        for (Vehicle2 vehicle : loggedInUnderwriter.vehicles) {
            if (vehicle.policyNo.equals(policyId)) {
                vehicleToChange = vehicle;
                break;
            }
        }

        if (vehicleToChange != null) {
            System.out.println(vehicleToChange);
            if (vehicleToChange.type.equalsIgnoreCase("Third Party")) {
                System.out.println("There's no provision to update the policy type from Third Party to Full Insurance.");
            } else if (vehicleToChange.type.equalsIgnoreCase("Full Insurance")) {
                System.out.println("Press 'U' to update the insurance type from Full Insurance to Third Party:");
                String choice = scanner.nextLine();

                if (choice.equalsIgnoreCase("U")) {
                    vehicleToChange.type = "Third Party";
                    System.out.println("Policy type updated successfully:");
                    System.out.println(vehicleToChange);
                } else {
                    System.out.println("Invalid choice.");
                }
            }
        } else {
            System.out.println("Invalid Policy ID");
        }
    }
}
