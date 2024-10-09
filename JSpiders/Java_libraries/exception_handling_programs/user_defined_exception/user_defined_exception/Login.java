package user_defined_exception;
import java.util.Scanner;

public class Login
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the userName");
        String userName = sc.next();
        System.out.println("Enter the password");
        int password = sc.nextInt();

        if(userName.equals("Admin"))
        {
            if (password == 123) {
                System.out.println("Login success");
            } else {
                try {
                    InvalidPasswordException e = new InvalidPasswordException();
                    throw e;
                } catch (InvalidPasswordException e) {
                    System.out.println("Invalid password");
                    password = sc.nextInt();
                }
            }
        }
        else
        {
            try {
                invalidUserNameException e=new invalidUserNameException();
                throw e;
            } catch (invalidUserNameException e) {
                System.out.println("Invalid userName");
                userName = sc.next();
            }

        }

    }
}