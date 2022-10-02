package baseball.view;

public class BaseballView implements GameView {

    private final String START_MESSAGE = "숫자를 입력해 주세요 : ";

    @Override
    public void enter() {
        System.out.print(START_MESSAGE);
    }

    @Override
    public void println(String message) {
        System.out.println(message);
    }

    @Override
    public void print(String message) {
        System.out.print(message);
    }
}
