/*US008	
As an UnderWriter, you should be able to successfully login into the system and should be given menu based choice to manage Vehicle.
"As an UnderWriter, if you enter the relevant User Id and password you should be logged in and fetched with the below options to manage Vehicle Insurance:
Create a new Vehicle Insurance(If Pressed 1) UnderWriter should be able to create and save a new Vehicle object. 
Renewal of a Policy(If Pressed 2) UnderWriter should be able to renew the Vehicle Insurance Policy. 
Changing of a policy(If Pressed 3) UnderWriter should be able to change the policy type from full Insurance to Third Party. 
View Policy(If pressed 4) UnderWriter should be able to view all the Vehicle Insurance policies. "*/

import java.util.*;
import java.text.SimpleDateFormat;

class Vehicles {
    String policyNo, vehicleNo, vehicleType, customerName, engineNo, chasisNo, phoneNo, type, fromDate, toDate;
    int premiumAmount;

    public Vehicles(String policyNo, String vehicleNo, String vehicleType, String customerName, String engineNo, String chasisNo, String phoneNo, int premiumAmount, String type, String fromDate, String toDate) {
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
        return "PolicyNo: " + policyNo + ", VehicleNo: " + vehicleNo + ", VehicleType: " + vehicleType + ", CustomerName: " + customerName +
                ", EngineNo: " + engineNo + ", ChasisNo: " + chasisNo + ", PhoneNo: " + phoneNo + ", PremiumAmnt: " + premiumAmount +
                ", Type: " + type + ", FromDate: " + fromDate + ", ToDate: " + toDate;
    }
}

class Underwriters {
    String id, password;
    List<Vehicles> vehicles;

    public Underwriters(String id, String password) {
        this.id = id;
        this.password = password;
        this.vehicles = new ArrayList<>();
    }
}

public class UnderWriterLogin {

    private static List<Underwriters> underwriters = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    static {
        underwriters.add(new Underwriters("UW1", "password1"));
        underwriters.add(new Underwriters("UW2", "password2"));
        underwriters.add(new Underwriters("UW3", "password3"));
        underwriters.add(new Underwriters("UW4", "password4"));
        underwriters.add(new Underwriters("UW5", "password5"));

        addVehicleToUnderwriter("UW1", new Vehicles("P1", "V1", "Car", "harsha", "EN1", "CH1", "1234567890", 1000, "Full Insurance", "2024-01-01", "2025-01-01"));
        addVehicleToUnderwriter("UW1", new Vehicles("P2", "V2", "Bike", "vardhini", "EN2", "CH2", "0987654321", 500, "Third Party", "2024-02-01", "2025-02-01"));
        
        addVehicleToUnderwriter("UW2", new Vehicles("P3", "V3", "Truck", "narendra", "EN3", "CH3", "1122334455", 1500, "Full Insurance", "2024-03-01", "2025-03-01"));
        
        addVehicleToUnderwriter("UW3", new Vehicles("P4", "V4", "Car", "lokesh", "EN4", "CH4", "2233445566", 1200, "Full Insurance", "2024-04-01", "2025-04-01"));
        
        addVehicleToUnderwriter("UW4", new Vehicles("P5", "V5", "Bike", "tejesh", "EN5", "CH5", "3344556677", 700, "Third Party", "2024-05-01", "2025-05-01"));
        
        addVehicleToUnderwriter("UW5", new Vehicles("P6", "V6", "SUV", "anusha", "EN6", "CH6", "5566778899", 1300, "Full Insurance", "2024-06-01", "2025-06-01"));
    }

    private static void addVehicleToUnderwriter(String underwriterId, Vehicles vehicle) {
        for (Underwriters uw : underwriters) {
            if (uw.id.equals(underwriterId)) {
                uw.vehicles.add(vehicle);
                break;
            }
        }
    }

    public static void main(String[] args) {
        login();
    }

    private static void login() {
        System.out.print("Enter Underwriter ID: ");
        String underwriterId = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        Underwriters loggedInUnderwriter = findUnderwriter(underwriterId, password);

        if (loggedInUnderwriter != null) {
            System.out.println("Login successful.");
            displayMenu(loggedInUnderwriter);
        } else {
            System.out.println("Invalid Underwriter ID or Password.");
            login();
        }
    }

    private static Underwriters findUnderwriter(String underwriterId, String password) {
        for (Underwriters uw : underwriters) {
            if (uw.id.equals(underwriterId) && uw.password.equals(password)) {
                return uw;
            }
        }
        return null;
    }

    private static void displayMenu(Underwriters loggedInUnderwriter) {
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Create a new Vehicle Insurance");
            System.out.println("2. Renewal of a Policy");
            System.out.println("3. Changing of a Policy Based on Insurance Type");
            System.out.println("4. View Policy");
            System.out.println("5. Logout");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    createVehicleInsurance(loggedInUnderwriter);
                    break;
                case 2:
                    renewPolicy(loggedInUnderwriter);
                    break;
                case 3:
                    changePolicy(loggedInUnderwriter);
                    break;
                case 4:
                    viewPolicy(loggedInUnderwriter);
                    break;
                case 5:
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void createVehicleInsurance(Underwriters loggedInUnderwriter) {
        System.out.print("Enter PolicyNo: ");
        String policyNo = scanner.nextLine();

        System.out.print("Enter VehicleNo: ");
        String vehicleNo = scanner.nextLine();

        System.out.print("Enter VehicleType: ");
        String vehicleType = scanner.nextLine();

        System.out.print("Enter CustomerName: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter EngineNo: ");
        String engineNo = scanner.nextLine();

        System.out.print("Enter ChasisNo: ");
        String chasisNo = scanner.nextLine();

        System.out.print("Enter PhoneNo: ");
        String phoneNo = scanner.nextLine();

        System.out.print("Enter Policy Type (Full Insurance/Third Party): ");
        String type = scanner.nextLine();

        int premiumAmount = type.equalsIgnoreCase("Full Insurance") ? 1000 : 500;
        String fromDate = getCurrentDate();
        String toDate = getOneYearLaterDate();

        Vehicles vehicle = new Vehicles(policyNo, vehicleNo, vehicleType, customerName, engineNo, chasisNo, phoneNo, premiumAmount, type, fromDate, toDate);
        loggedInUnderwriter.vehicles.add(vehicle);

        System.out.println("Vehicle Insurance created successfully.");
    }

    private static void renewPolicy(Underwriters loggedInUnderwriter) {
        System.out.print("Enter Policy ID: ");
        String policyId = scanner.nextLine();

        Vehicles vehicleToRenew = null;

        for (Vehicles vehicle : loggedInUnderwriter.vehicles) {
            if (vehicle.policyNo.equals(policyId)) {
                vehicleToRenew = vehicle;
                break;
            }
        }

        if (vehicleToRenew != null) {
            System.out.println("Vehicle details: " + vehicleToRenew);
            System.out.print("Enter 'R' to confirm the renewal: ");
            String confirmation = scanner.nextLine();

            if (confirmation.equalsIgnoreCase("R")) {
                System.out.print("Enter updated Premium Amount: ");
                int newPremiumAmount = Integer.parseInt(scanner.nextLine());

                String newFromDate = getCurrentDate();
                String newToDate = getOneYearLaterDate();
                String newPolicyNo = "P" + (loggedInUnderwriter.vehicles.size() + 1);

                Vehicles renewedVehicle = new Vehicles(newPolicyNo, vehicleToRenew.vehicleNo, vehicleToRenew.vehicleType, vehicleToRenew.customerName, vehicleToRenew.engineNo, vehicleToRenew.chasisNo, vehicleToRenew.phoneNo, newPremiumAmount, vehicleToRenew.type, newFromDate, newToDate);
                loggedInUnderwriter.vehicles.add(renewedVehicle);

                System.out.println("Policy renewed successfully.");
            } else {
                System.out.println("Renewal cancelled.");
            }
        } else {
            System.out.println("Invalid Policy ID.");
        }
    }

    private static void changePolicy(Underwriters loggedInUnderwriter) {
        System.out.print("Enter Policy ID: ");
        String policyId = scanner.nextLine();

        Vehicles vehicleToChange = null;

        for (Vehicles vehicle : loggedInUnderwriter.vehicles) {
            if (vehicle.policyNo.equals(policyId)) {
                vehicleToChange = vehicle;
                break;
            }
        }

        if (vehicleToChange != null) {
            System.out.println("Vehicle details: " + vehicleToChange);
            System.out.print("Enter new Insurance Type (Full Insurance/Third Party): ");
            String newType = scanner.nextLine();

            vehicleToChange.type = newType;

            System.out.println("Policy updated successfully.");
        } else {
            System.out.println("Invalid Policy ID.");
        }
    }

    private static void viewPolicy(Underwriters loggedInUnderwriter) {
        System.out.print("Enter Policy ID: ");
        String policyId = scanner.nextLine();

        for (Vehicles vehicle : loggedInUnderwriter.vehicles) {
            if (vehicle.policyNo.equals(policyId)) {
                System.out.println("Policy details: " + vehicle);
                return;
            }
        }
        System.out.println("Invalid Policy ID.");
    }

    private static String getCurrentDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        return formatter.format(new Date());
    }

    private static String getOneYearLaterDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, 1);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        return formatter.format(calendar.getTime());
    }
}
