package nextstep.ladder.controller;

import nextstep.ladder.domain.Names;
import nextstep.ladder.view.InputView;

public class LadderController {
    public void start() {
        String names = InputView.inputNames();
        Names.of(names);
    }
}
