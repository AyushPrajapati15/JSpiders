/*US012	
As an UnderWriter, you should be able to view the Vehicle insurance policy 	
"Once the UnderWriter chooses to view the Vehicle Insurance policy, the menu based options should be displayed to the user:
View all Insurance(If Pressed 1)
View Insurance by Vehicle Id(If Pressed 2)
View Insurance by Policy Id(If Pressed 3)
On Entering 1, All the Vehicle Insurance details will be displayed to the user. 
On Entering 2, the screen prompts the UnderWriter to enter the Vehicle Id. On entering Valid Vehicle Id,
 the Insurance details related to the particular Vehicle is displayed. 
On Entering 3, the screen prompts the UnderWriter to enter the policy Id. 
On entering the policy id the insurance details related to the particular record is displayed."*/

import java.util.*;

class InsuranceVehicle {
    String policyId;
    String vehicleId;
    String vehicleType;
    String customerName;
    String engineNo;
    String chasisNo;
    String phoneNo;
    double premiumAmount;
    String insuranceType;
    String fromDate;
    String toDate;

    public InsuranceVehicle(String policyId, String vehicleId, String vehicleType, String customerName, String engineNo, String chasisNo, String phoneNo, double premiumAmount, String insuranceType, String fromDate, String toDate) {
        this.policyId = policyId;
        this.vehicleId = vehicleId;
        this.vehicleType = vehicleType;
        this.customerName = customerName;
        this.engineNo = engineNo;
        this.chasisNo = chasisNo;
        this.phoneNo = phoneNo;
        this.premiumAmount = premiumAmount;
        this.insuranceType = insuranceType;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public String getDetails() {
        return "Policy ID: " + policyId + ", Vehicle ID: " + vehicleId + ", Vehicle Type: " + vehicleType + 
               ", Customer Name: " + customerName + ", Engine No: " + engineNo + ", Chasis No: " + chasisNo + 
               ", Phone No: " + phoneNo + ", Premium Amount: " + premiumAmount + 
               ", Insurance Type: " + insuranceType + ", From Date: " + fromDate + ", To Date: " + toDate;
    }
}

class InsuranceUnderwriter {
    String underwriterId;
    String password;
    List<InsuranceVehicle> vehicles;

    public InsuranceUnderwriter(String underwriterId, String password) {
        this.underwriterId = underwriterId;
        this.password = password;
        this.vehicles = new ArrayList<>();
    }
}

public class UnderwriterView {
    private static List<InsuranceUnderwriter> underwriters = new ArrayList<>();
    private static InsuranceUnderwriter loggedInUnderwriter;

    static {
        underwriters.add(new InsuranceUnderwriter("UW1", "password1"));
        underwriters.add(new InsuranceUnderwriter("UW2", "password2"));
        underwriters.add(new InsuranceUnderwriter("UW3", "password3"));
        underwriters.add(new InsuranceUnderwriter("UW4", "password4"));
        underwriters.add(new InsuranceUnderwriter("UW5", "password5"));

        underwriters.get(0).vehicles.add(new InsuranceVehicle("P1", "V1", "Car", "Harsha", "EN1", "CH1", "1234567890", 1000, "Full Insurance", "2024-01-01", "2025-01-01"));
        underwriters.get(0).vehicles.add(new InsuranceVehicle("P2", "V2", "Bike", "Vardhini", "EN2", "CH2", "0987654321", 500, "Third Party", "2024-02-01", "2025-02-01"));
        underwriters.get(1).vehicles.add(new InsuranceVehicle("P3", "V3", "Truck", "Narendra", "EN3", "CH3", "1122334455", 1500, "Full Insurance", "2024-03-01", "2025-03-01"));
        underwriters.get(2).vehicles.add(new InsuranceVehicle("P4", "V4", "Car", "Lokesh", "EN4", "CH4", "2233445566", 1200, "Full Insurance", "2024-04-01", "2025-04-01"));
        underwriters.get(3).vehicles.add(new InsuranceVehicle("P5", "V5", "Bike", "Tejesh", "EN5", "CH5", "3344556677", 700, "Third Party", "2024-05-01", "2025-05-01"));
        underwriters.get(4).vehicles.add(new InsuranceVehicle("P6", "V6", "SUV", "Anusha", "EN6", "CH6", "5566778899", 1300, "Full Insurance", "2024-06-01", "2025-06-01"));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        login(scanner);

        while (true) {
            System.out.println("\nStar Protect Vehicle System - Underwriter Console");
            System.out.println("1. View My Insurance Policies");
            System.out.println("2. View Insurance by Vehicle ID");
            System.out.println("3. View Insurance by Policy ID");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    viewMyInsurancePolicies();
                    break;
                case "2":
                    System.out.print("Enter Vehicle ID: ");
                    String vehicleId = scanner.nextLine();
                    viewInsuranceByVehicleId(vehicleId);
                    break;
                case "3":
                    System.out.print("Enter Policy ID: ");
                    String policyId = scanner.nextLine();
                    viewInsuranceByPolicyId(policyId);
                    break;
                case "4":
                    System.out.println("Exiting Underwriter Console. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void login(Scanner scanner) {
        System.out.print("Enter Underwriter ID: ");
        String underwriterId = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        for (InsuranceUnderwriter underwriter : underwriters) {
            if (underwriter.underwriterId.equals(underwriterId) && underwriter.password.equals(password)) {
                loggedInUnderwriter = underwriter;
                System.out.println("Login successful!");
                return;
            }
        }

        System.out.println("Invalid Underwriter ID or Password. Exiting.");
        System.exit(0);
    }

    private static void viewMyInsurancePolicies() {
        System.out.println("\nYour Vehicle Insurance Policies:");
        for (InsuranceVehicle vehicle : loggedInUnderwriter.vehicles) {
            System.out.println(vehicle.getDetails());
        }
    }

    private static void viewInsuranceByVehicleId(String vehicleId) {
        System.out.println("\nInsurance Policies for Vehicle ID: " + vehicleId);
        boolean found = false;
        for (InsuranceVehicle vehicle : loggedInUnderwriter.vehicles) {
            if (vehicle.vehicleId.equals(vehicleId)) {
                System.out.println(vehicle.getDetails());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No insurance policy found for Vehicle ID: " + vehicleId);
        }
    }

    private static void viewInsuranceByPolicyId(String policyId) {
        System.out.println("\nInsurance Policy for Policy ID: " + policyId);
        boolean found = false;
        for (InsuranceVehicle vehicle : loggedInUnderwriter.vehicles) {
            if (vehicle.policyId.equals(policyId)) {
                System.out.println(vehicle.getDetails());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No insurance policy found for Policy ID: " + policyId);
        }
    }
}
