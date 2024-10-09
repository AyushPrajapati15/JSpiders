package matrimony_exception;
import java.util.Scanner;

public class Matrimony {
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
                    InvalidAgeLimitException e = new InvalidAgeLimitException();
                    throw e;
                    
                } catch (InvalidAgeLimitException e) {
                    System.out.println("Enter the valid age");
                    age = sc.nextInt();
                }
            }
            
            
        }
    }