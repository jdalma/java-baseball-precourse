package baseball.view;

public class BaseballView implements GameView {

    private final String START_MESSAGE = "숫자를 입력해 주세요 : ";
    private final String GAME_OVER = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    private final String CONTINUE_GAME = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    @Override
    public void enter() {
        System.out.print(START_MESSAGE);
    }

    @Override
    public void continueGame() {
        System.out.println(GAME_OVER);
        System.out.println(CONTINUE_GAME);
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
