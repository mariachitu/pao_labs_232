package exceptions;

public class MyException extends Exception {
    private String code;

    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause, String code) {
        super(message, cause);
        this.code = code;
    }
}

class MyRunException extends RuntimeException {
}
