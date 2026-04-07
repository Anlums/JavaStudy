package Exception;

public class BankException extends Exception {
    private int errorcode;

    public BankException(String message,int errorcode) {
        super(message);
        this.errorcode = errorcode;
    }

    public int getErrorcode() {
        return errorcode;
    }

}
