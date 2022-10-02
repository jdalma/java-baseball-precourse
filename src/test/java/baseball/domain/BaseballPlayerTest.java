package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class BaseballPlayerTest {

    private final int NUMBER_SIZE = 3;

    @Nested
    @DisplayName("computer()")
    class Describe_ComputerMethod {

        @Test
        @DisplayName("중복되지 않는 3개의 숫자 List를 가진 객체를 반환한다.")
        void It_ThreeSizeAndNotDuplicated() {
            BaseballPlayer computer = BaseballPlayer.computer();
            assertThat(computer.getNumbers().size()).isEqualTo(NUMBER_SIZE);

            int[] numberCount = new int[10];
            List<Integer> numbers = computer.getNumbers();
            for (int number : numbers) {
                numberCount[number]++;
            }

            for (int number : numbers) {
                assertThat(numberCount[number]).isLessThan(2);
            }
        }
    }

    @Nested
    @DisplayName("user()")
    class Describe_UserMethod{

        @Nested
        @DisplayName("중복되지 않는 숫자로 이루어진 문자열 3글자를 전달하면")
        class Context_InputNumber{

            private final String numbers = "379";

            @Test
            @DisplayName("숫자 3개의 List를 가진 객체를 반환한다.")
            void It_ReturnUser(){
                BaseballPlayer user = BaseballPlayer.user(numbers);
                List<Integer> userNumbers = user.getNumbers();

                for (int i = 0; i < userNumbers.size(); i++) {
                    int number = userNumbers.get(i);
                    assertThat(number).isEqualTo(numbers.charAt(i) - 48);
                }
            }
        }
    }
}
