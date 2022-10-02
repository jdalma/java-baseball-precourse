package baseball.controller;

import baseball.service.Referee;
import baseball.view.GameView;

public class BaseballGame implements GameController{

    private final GameView baseballView;
    private final Referee baseballReferee;

    public BaseballGame(GameView baseballView, Referee baseballReferee) {
        this.baseballView = baseballView;
        this.baseballReferee = baseballReferee;
    }

    @Override
    public void start(){

    }
}
