package exceptions;

public class Exception1 extends RuntimeException{

    int value;
    String message;

    public Exception1(String message, int value, String message1) {
        super(message);
        this.value = value;
        this.message = message1;
    }

    public Exception1(String message, Throwable cause, int value, String message1) {
        super(message, cause);
        this.value = value;
        this.message = message1;
    }

    public Exception1(Throwable cause, int value, String message) {
        super(cause);
        this.value = value;
        this.message = message;
    }

    public Exception1(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, int value, String message1) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.value = value;
        this.message = message1;
    }

    public Exception1(int value, String message) {
        this.message=message;
        this.value=value;
    }
}
