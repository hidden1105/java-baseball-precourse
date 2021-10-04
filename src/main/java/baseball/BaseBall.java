package baseball;

public class BaseBall {
    Computer computer = new Computer();
    Player player = new Player();
    Judgment judgment = new Judgment();
    ResultView resultView = new ResultView();

    public Result play() {
        Result result = null;
        String answer = computer.getRandomAnswer();
        do {
            System.out.print("숫자를 입력해주세요 :");
            String input = player.play();
            result = judgment.judge(answer, input);
            resultView.view(result);
        } while (!result.isFinish());

        return result;
    }
}
