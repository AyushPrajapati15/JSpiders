package voting_exception;

import java.util.Scanner;

public class voting {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if(age>=18)
        {
            System.out.println("You are eligible for voting");
        }
        else {
            try {
                InvalidAgeException e = new InvalidAgeException();
                throw e;
                
            } catch (InvalidAgeException e) {
                System.out.println("Enter the valid age");
                age = sc.nextInt();
            }
        }
        
        
    }
}
