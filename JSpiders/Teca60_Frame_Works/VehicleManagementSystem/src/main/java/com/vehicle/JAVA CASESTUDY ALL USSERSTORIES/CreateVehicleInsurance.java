/*US009	
As an underWriter, you should be able to create a new Vehicle Insurance.	
"As an underWriter I should be able to enter the below details from the console and save/create an Insurance for a Vehicle:
PolicyNo AutoIncremented field integer value
VehicleNo String with a space and Alphanumeric value
VehicleType String (2-wheeler/4 -wheeler)
CustomerName String 
EngineNo Integer
ChasisNo Integer
PhoneNo Integer consisting of 10 digits.
Type (Full Insurance/ThirdParty) String 
PremiumAmt. - Auto-calculated form type of insurance
FromDate Date 
ToDate Autocalculated form FromDate + 365 days
UnderwriterId Auto captured by the system with the UnderWriter Id 


At least create two Vehicle Insurance per UnderWriter."*/

import java.util.*;
import java.text.SimpleDateFormat;

class VehicleInsurance {
    String policyNo, vehicleNo, vehicleType, customerName, engineNo, chasisNo, phoneNo, type, fromDate, toDate, agentId;
    int premiumAmount;

    public VehicleInsurance(String policyNo, String vehicleNo, String vehicleType, String customerName, String engineNo,
                            String chasisNo, String phoneNo, int premiumAmount, String type,
                            String fromDate, String toDate, String agentId) {
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
        this.agentId = agentId;
    }

  
    public String toString() {
        return "PolicyNo: " + policyNo + ", VehicleNo: " + vehicleNo + ", VehicleType: " + vehicleType + 
               ", CustomerName: " + customerName + ", EngineNo: " + engineNo + ", ChasisNo: " + chasisNo + 
               ", PhoneNo: " + phoneNo + ", PremiumAmt: " + premiumAmount + ", Type: " + type + 
               ", FromDate: " + fromDate + ", ToDate: " + toDate + ", AgentId: " + agentId;
    }
}

class InsuranceAgent {
    String id, password;
    List<VehicleInsurance> insurances;

    public InsuranceAgent(String id, String password) {
        this.id = id;
        this.password = password;
        this.insurances = new ArrayList<>();
    }
}

public class CreateVehicleInsurance {
    private static List<InsuranceAgent> agents = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static int policyCounter = 1;

    static {
        agents.add(new InsuranceAgent("UW1", "password1"));
        agents.add(new InsuranceAgent("UW2", "password2"));
        agents.add(new InsuranceAgent("UW3", "password3"));
    }

    public static void main(String[] args) {
        login();
    }

    private static void login() {
        System.out.print("Enter Agent ID: ");
        String agentId = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        InsuranceAgent loggedInAgent = findAgent(agentId, password);

        if (loggedInAgent != null) {
            System.out.println("Login successful.");
            displayMenu(loggedInAgent);
        } else {
            System.out.println("Invalid Agent ID or Password.");
            login();
        }
    }

    private static InsuranceAgent findAgent(String agentId, String password) {
        for (InsuranceAgent agent : agents) {
            if (agent.id.equals(agentId) && agent.password.equals(password)) {
                return agent;
            }
        }
        return null;
    }

    private static void displayMenu(InsuranceAgent loggedInAgent) {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Create Vehicle Insurance");
            System.out.println("2. View All Policies by Agent ID");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    createVehicleInsurance(loggedInAgent);
                    break;
                case 2:
                    viewAllPolicies(loggedInAgent);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void createVehicleInsurance(InsuranceAgent loggedInAgent) {
        if (loggedInAgent.insurances.size() >= 2) {
            System.out.println("You have already created two vehicle insurances.");
            return;
        }

        for (int i = 0; i < 2; i++) {
            String policyNo = "P" + policyCounter++;
            System.out.println("Creating Vehicle Insurance " + (i + 1) + ":");
            System.out.print("Enter VehicleNo (Alphanumeric with space): ");
            String vehicleNo = scanner.nextLine();

            System.out.print("Enter VehicleType (2-wheeler/4-wheeler): ");
            String vehicleType = scanner.nextLine();

            System.out.print("Enter CustomerName: ");
            String customerName = scanner.nextLine();

            System.out.print("Enter EngineNo (Alphanumeric): ");
            String engineNo = scanner.nextLine();

            System.out.print("Enter ChasisNo (Alphanumeric): ");
            String chasisNo = scanner.nextLine();

            System.out.print("Enter PhoneNo (10 digits): ");
            String phoneNo = scanner.nextLine();

            System.out.print("Enter Policy Type (Full Insurance/Third Party): ");
            String type = scanner.nextLine();

            int premiumAmount = type.equalsIgnoreCase("Full Insurance") ? 1000 : 500;
            String fromDate = getCurrentDate();
            String toDate = getOneYearLaterDate();

            VehicleInsurance vehicleInsurance = new VehicleInsurance(policyNo, vehicleNo, vehicleType, customerName,
                    engineNo, chasisNo, phoneNo, premiumAmount, type, fromDate, toDate, loggedInAgent.id);

            loggedInAgent.insurances.add(vehicleInsurance);
            System.out.println("Vehicle Insurance created successfully:");
            System.out.println(vehicleInsurance);
        }
    }

    private static void viewAllPolicies(InsuranceAgent loggedInAgent) {
        if (loggedInAgent.insurances.isEmpty()) {
            System.out.println("No vehicle insurances found for Agent ID: " + loggedInAgent.id);
            return;
        }

        System.out.println("Policies for Agent ID: " + loggedInAgent.id);
        for (VehicleInsurance vehicleInsurance : loggedInAgent.insurances) {
            System.out.println(vehicleInsurance);
        }
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
