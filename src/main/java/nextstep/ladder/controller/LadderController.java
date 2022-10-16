package nextstep.ladder.controller;

import nextstep.ladder.domain.Game;
import nextstep.ladder.domain.player.Players;
import nextstep.ladder.view.GameResult;
import nextstep.ladder.view.InputView;
import nextstep.ladder.view.LadderResult;
import nextstep.ladder.view.ResultView;

import static nextstep.ladder.view.GameResult.ALL_PLAYERS;

public class LadderController {
    public void start() {
        String[] inputNames = InputView.inputNames();

        Players players = Players.create(inputNames);
        String[] results = InputView.inputResults();
        int height = InputView.inputLadderHeight();

        Game game = new Game(players, results, height);
        ResultView.showLadder(new LadderResult(game, results));

        GameResult gameResult = new GameResult(game);
        showGameResult(gameResult);
    }

    private void showGameResult(GameResult gameResult) {
        String playerName = InputView.inputPlayerName();

        if (playerName.equals(ALL_PLAYERS)) {
            String result = gameResult.resultOfPlayer(playerName);
            ResultView.showResult(result);
            return;
        }

        try {
            String result = gameResult.resultOfPlayer(playerName);
            ResultView.showResult(result);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        showGameResult(gameResult);
    }
}
