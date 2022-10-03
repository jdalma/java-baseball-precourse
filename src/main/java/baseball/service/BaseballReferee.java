package baseball.service;

import baseball.error.BaseballNumberContainsNonDigitException;
import baseball.error.BaseballNumberDuplicateException;
import baseball.error.BaseballNumberNullException;
import baseball.error.BaseballNumberSizeException;

public class BaseballReferee implements Referee{

    public static final int START_INCLUSIVE = 0;
    public static final int END_INCLUSIVE = 9;
    public static final int NUMBER_SIZE = 3;

    @Override
    public void checkCommand(String command) {
        if (command == null) {
            throw new BaseballNumberNullException("숫자를 입력하여 주세요.");
        } else if (isDifferentSize(command)) {
            throw new BaseballNumberSizeException(String.format("숫자는 %d 자리만 입력하여 주세요.", NUMBER_SIZE));
        } else if (isCommandContainsNonDigit(command)) {
            throw new BaseballNumberContainsNonDigitException("숫자만 입력하여 주세요.");
        } else if (isNumberDuplicate(command)) {
            throw new BaseballNumberDuplicateException("숫자가 중복되지 않게 입력하여 주세요.");
        }
    }

    private boolean isDifferentSize(String command) {
        return command.length() != NUMBER_SIZE;
    }

    private boolean isCommandContainsNonDigit(String command) {
        final String REGEX = "[0-9]+";
        return !command.matches(REGEX);
    }

    private boolean isNumberDuplicate(String command) {
        int[] numbers = new int[10];
        int count = 0;

        for(int i = 0; i < command.length(); i++){
            char ch = command.charAt(i);
            numbers[ch - 48]++;
            count = Math.max(numbers[ch - 48] , count);
        }

        return count >= 2;
    }
}
