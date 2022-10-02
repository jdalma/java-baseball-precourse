package baseball.domain;

import baseball.util.Converter;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;

import static baseball.service.BaseballReferee.END_INCLUSIVE;
import static baseball.service.BaseballReferee.NUMBER_SIZE;
import static baseball.service.BaseballReferee.START_INCLUSIVE;

public class BaseballPlayer {

    private final List<Integer> numbers;

    private BaseballPlayer(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public static BaseballPlayer computer() {
        return new BaseballPlayer(Randoms.pickUniqueNumbersInRange(START_INCLUSIVE , END_INCLUSIVE , NUMBER_SIZE));
    }

    public static BaseballPlayer user(String command) {
        return new BaseballPlayer(Converter.stringToList(command));
    }

    public List<Integer> getNumbers() {
        return this.numbers;
    }
}
