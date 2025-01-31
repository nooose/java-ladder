package nextstep.ladder.view;

public class ResultView {
    private static final String NEW_LINE = System.lineSeparator();
    private static final String LADDER_RESULT_MESSAGE = NEW_LINE + "사다리 결과" + NEW_LINE;

    private ResultView() {
    }

    public static void showLadder(LadderResult result) {
        System.out.println(LADDER_RESULT_MESSAGE);
        System.out.println(result.playerNames());
        System.out.println(result.ladder());
        System.out.println(result.results());
    }

    public static void showResult(String result) {
        System.out.println(NEW_LINE + "실행 결과");
        System.out.println(result);
    }
}
