package user_defined_exception;

public class invalidUserNameException extends RuntimeException {
    

    public String toString()
    {
        return getClass() + " :/ Entered userName is incorrect";
    }
    
}
