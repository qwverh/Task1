package loginAndParol;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super("Введен неправильный формат пароля");
    }
    public WrongPasswordException(String message) {
        super(message);
    }
}
