package voting_exception;

    public class InvalidAgeException extends RuntimeException
    {
        public String toString()
        {
            return getClass()+" : / InvalidAgeException";
        }
    } 