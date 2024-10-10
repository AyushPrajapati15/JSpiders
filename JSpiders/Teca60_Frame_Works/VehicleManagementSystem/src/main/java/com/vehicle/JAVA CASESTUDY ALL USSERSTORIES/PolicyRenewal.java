/*US010	
As an UnderWriter, you should be able to renew the policy for a specific vehicle id.	
"When the UnderWriter choses to renew the Insurance for a Vehicle, the screen should prompt the UnderWriter to enter the policy Id. 
On Entering a valid policy Id, the related details(as mentioned above in US009) are displayed in the screen along with the option to enter 'R' 
to confirm the renewal. 
Once the user presses 'R' button, the screen prompts the UnderWriter to enter the updated premium amount.
On entering the premium amount, a new record will be created(refer to US009)  with all displayed details.
 The from date should be updated with the current date and to date will be updated by from date + 365 days. 
The above logic works for only those vehicles whose insurance is expired that is the current date exceeds the to date. 
If the current date is less than to date (i.e. the policy is yet to be expired), then the from date for the new record will be 
previous to date + 1 and to date for the new record will be updated from date + 365 days. 

In all cases the underWriter Id will be automatically captured from logged in UnderWriter Id. 
The Premium amount will be updated by the entered premium amount."*/


import java.util.*;
import java.text.SimpleDateFormat;

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

    public String toString() {
        return "PolicyNo: " + policyNo + ", VehicleNo: " + vehicleNo + ", VehicleType: " + vehicleType + ", CustomerName: " + customerName +
                ", EngineNo: " + engineNo + ", ChasisNo: " + chasisNo + ", PhoneNo: " + phoneNo + ", PremiumAmnt: " + premiumAmount +
                ", Type: " + type + ", FromDate: " + fromDate + ", ToDate: " + toDate;
    }
}

class Underwriter2 {
    String id, password;
    List<Vehicle2> vehicles;

    public Underwriter2(String id, String password) {
        this.id = id;
        this.password = password;
        this.vehicles = new ArrayList<>();
    }
}

public class PolicyRenewal {

    private static List<Underwriter2> underwriters = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    static {
        underwriters.add(new Underwriter2("UW1", "password1"));
        underwriters.add(new Underwriter2("UW2", "password2"));
        underwriters.add(new Underwriter2("UW3", "password3"));
        underwriters.add(new Underwriter2("UW4", "password4"));
        underwriters.add(new Underwriter2("UW5", "password5"));

        addVehicleToUnderwriter("UW1", new Vehicle2("P1", "V1", "Car", "harsha", "EN1", "CH1", "1234567890", 1000, "Full Insurance", "2024-01-01", "2025-01-01"));
        addVehicleToUnderwriter("UW1", new Vehicle2("P2", "V2", "Bike", "vardhini", "EN2", "CH2", "0987654321", 500, "Third Party", "2024-02-01", "2025-02-01"));
        addVehicleToUnderwriter("UW2", new Vehicle2("P3", "V3", "Truck", "narendra", "EN3", "CH3", "1122334455", 1500, "Full Insurance", "2024-03-01", "2025-03-01"));
        addVehicleToUnderwriter("UW3", new Vehicle2("P4", "V4", "Car", "lokesh", "EN4", "CH4", "2233445566", 1200, "Full Insurance", "2024-04-01", "2025-04-01"));
        addVehicleToUnderwriter("UW4", new Vehicle2("P5", "V5", "Bike", "tejesh", "EN5", "CH5", "3344556677", 700, "Third Party", "2024-05-01", "2025-05-01"));
        addVehicleToUnderwriter("UW5", new Vehicle2("P6", "V6", "SUV", "anusha", "EN6", "CH6", "5566778899", 1300, "Full Insurance", "2024-06-01", "2025-06-01"));
    }

    private static void addVehicleToUnderwriter(String underwriterId, Vehicle2 vehicle) {
        for (Underwriter2 uw : underwriters) {
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

        Underwriter2 loggedInUnderwriter = findUnderwriter(underwriterId, password);

        if (loggedInUnderwriter != null) {
            System.out.println("Login successful.");
            showMenu(loggedInUnderwriter);
        } else {
            System.out.println("Invalid Underwriter ID or Password.");
            login();
        }
    }

    private static Underwriter2 findUnderwriter(String underwriterId, String password) {
        for (Underwriter2 uw : underwriters) {
            if (uw.id.equals(underwriterId) && uw.password.equals(password)) {
                return uw;
            }
        }
        return null;
    }

    private static void showMenu(Underwriter2 loggedInUnderwriter) {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. View Policies");
            System.out.println("2. Renew Policy");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    viewPolicies(loggedInUnderwriter);
                    break;
                case 2:
                    renewPolicy(loggedInUnderwriter);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void viewPolicies(Underwriter2 loggedInUnderwriter) {
        System.out.println("\nPolicies:");
        for (Vehicle2 vehicle : loggedInUnderwriter.vehicles) {
            System.out.println(vehicle);
        }
    }

    private static void renewPolicy(Underwriter2 loggedInUnderwriter) {
        System.out.print("Enter Policy ID: ");
        String policyId = scanner.nextLine();

        Vehicle2 vehicleToRenew = null;

        for (Vehicle2 vehicle : loggedInUnderwriter.vehicles) {
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

                String newFromDate;
                String newToDate;
                Date currentDate = new Date();
                if (currentDate.after(parseDate(vehicleToRenew.toDate))) {
                    newFromDate = getCurrentDate();
                    newToDate = getOneYearLaterDate();
                } else {
                    newFromDate = getOneDayAfterDate(vehicleToRenew.toDate);
                    newToDate = getOneYearFromCustomDate(newFromDate);
                }

                String newPolicyNo = "P" + (loggedInUnderwriter.vehicles.size() + 1);

                Vehicle2 renewedVehicle = new Vehicle2(newPolicyNo, vehicleToRenew.vehicleNo, vehicleToRenew.vehicleType, vehicleToRenew.customerName, vehicleToRenew.engineNo, vehicleToRenew.chasisNo, vehicleToRenew.phoneNo, newPremiumAmount, vehicleToRenew.type, newFromDate, newToDate);
                loggedInUnderwriter.vehicles.add(renewedVehicle);

                System.out.println("Policy renewed successfully.");
            } else {
                System.out.println("Renewal cancelled.");
            }
        } else {
            System.out.println("Invalid Policy ID.");
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

    private static String getOneDayAfterDate(String date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(parseDate(date));
        calendar.add(Calendar.DAY_OF_YEAR, 1);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        return formatter.format(calendar.getTime());
    }

    private static String getOneYearFromCustomDate(String date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(parseDate(date));
        calendar.add(Calendar.YEAR, 1);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        return formatter.format(calendar.getTime());
    }

    private static Date parseDate(String dateStr) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return formatter.parse(dateStr);
        } catch (Exception e) {
            return null;
        }
    }
}
