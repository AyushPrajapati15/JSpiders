package com.jsp.Main;

import java.util.Scanner;

import com.jsp.Model.UserAccountDetails;
import com.jsp.Model.UserInformation;
import com.jsp.Service.BankService;
import com.jsp.Service.BankServiceImpl;
import com.jsp.Service.UserService;
import com.jsp.Service.UserServiceImpl;

public class MainClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		UserService service = new UserServiceImpl();

//		UserDao user =new UserDAOimpl();//IMPLICIT UPCASTING
//		user.userRegistration();

//		UserService service=new UserServiceImpl();
//		int result=service.userData();
//		if(result!=0)
//		{
//			System.out.println("Data inserted Successfully");
//		}
//		else {
//			System.out.println("No data inserted");
//		}

		System.out.println("Enter \n 1 for User Registration \n 2 for User Login");
		int request = scanner.nextInt();

		switch (request) {
		case 1:
			System.out.println("User Registration");
			int res = service.userData();
			if (res != 0) {
				System.out.println("Registration Successful");
				System.out.println(res + " row affected");
			} else {
				System.out.println("Duplicate Data \n " + res + " row affected");
			}
			break;
		case 2:
//			System.out.println("User Login");
			UserInformation userInformation = service.userLogin();
			if (userInformation != null) {
				String gender = userInformation.getGender();
				if (gender.equalsIgnoreCase("male")) {
					System.out.println("Welcome Mr :" + userInformation.getFirstname());
				}
				if (gender.equalsIgnoreCase("female")) {
					System.out.println("Welcome Miss :" + userInformation.getFirstname());
				}
				System.out.println("Enter 1. For Bank Account " + "\n 2. For Credit  " + "\n 3. For Debit  "
						+ "\n 4. For Check Balance" + "\n 5. For Change password" + "\n 6. For Statement"
						+ "\n 7. For Delete account");

				UserAccountDetails userAccountDetails = new UserAccountDetails();
				BankService bankService = new BankServiceImpl();
				switch (scanner.nextInt()) {
				case 1:
//					System.out.println("**---**--Bank account--**---**");
					output("Bank Account");
					System.out.println();
					userAccountDetails = bankService.bankAccountDetails(userInformation.getId());
					if (userAccountDetails != null) {
						output("Account created successfully");
						System.out.println("Name " + userInformation.getFirstname());
						System.out.println("AccountNo " + userAccountDetails.getAccountnumber());
						long mobilenum = userInformation.getMobileno();
//						System.out.println(+"******"+);

					} else {
//						System.out.println("Account Already Exist");
//						System.out.println("Name "+userInformation.getFirstname());
//						System.out.println("AccountNo "+userAccountDetails.getAccountnumber());
//						System.out.println("MobileNo"+userInformation.getMobileno());
					}

					break;
				case 2:
//					System.out.println("Credit");
					output("Credit");

					break;
				case 3:
//					System.out.println("Debit");
					output("Debit");
					System.err.println();
					bankService.forDebit(userInformation.getId());

					break;
				case 4:
//					System.out.println("Check Balance");
					output("Check Balance");

					break;
				case 5:
//					System.out.println("Change Password");
					output("Change Password");

					break;
				case 6:
//					System.out.println("Statement");
					output("Statement");

					break;
				case 7:
//					System.out.println("Delete Account");
					output("Delete Account");

					break;

				default:
					break;
				}

			} else {
				System.out.println("Invalid details");
			}
		}

	}

	public static void output(String str) {
		String s = "**---**--" + str + "--**---**";
		Thread thread = new Thread();
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i));
			try {
				thread.sleep(50);
			} catch (InterruptedException e) {
				System.out.println(e);
			}

		}

	}
}
