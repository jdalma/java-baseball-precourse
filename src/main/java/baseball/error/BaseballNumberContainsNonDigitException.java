package baseball.error;

public class BaseballNumberContainsNonDigitException extends RuntimeException {
    public BaseballNumberContainsNonDigitException(String message) {
        super(message);
    }
}
