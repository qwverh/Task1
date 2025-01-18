package loginAndParol;


public class WrongLoginException extends Exception {
    public WrongLoginException() {
        super("Формат логина введен неправильно");
    }
    public WrongLoginException(String message) {
        super(message);
    }
}

