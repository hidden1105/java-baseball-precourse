package baseball;

import nextstep.utils.Console;

public class Application {
    private final static String GO = "1";
    private final static String STOP = "2";

    public static void main(String[] args) {
        String goOrStop;

        Computer computer = new Computer();
        Player player = new Player();
        Judgment judgment = new Judgment();
        ResultView resultView = new ResultView();

        String answer = computer.getRandomAnswer();
        do {
            System.out.print("숫자를 입력해주세요 :");
            String input = player.play();
            Result result = judgment.judge(answer, input);
            resultView.view(result);

            goOrStop = getGoOrStop(result);
        } while (goOrStop.equals(GO));
    }

    private static String getGoOrStop(Result result) {
        if (result.isFinish()) {
            System.out.println("게임을 새로 시작하려면1, 종료하려면 2를 입력하세요");
            return Console.readLine();
        }
        return GO;
    }
}
