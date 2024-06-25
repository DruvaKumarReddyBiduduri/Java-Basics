package authentication;

public class NoSuchEmployeeException extends Exception{
    public NoSuchEmployeeException(String message) {
        super(message);
    }
}
