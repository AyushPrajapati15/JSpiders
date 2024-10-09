package user_defined_exception;

public class InvalidPasswordException extends RuntimeException {
    
    public String toString()
    {
        return getClass() + " :/ Entered password is invalid ";
    }
    
}
