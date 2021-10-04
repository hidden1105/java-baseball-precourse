package baseball;

public class Application {
    private static String answer = "123";

    public static void main(String[] args) {
        boolean isIng = true;

        Player player = new Player();
        Judgment judgment = new Judgment();
        ResultView resultView = new ResultView();

        while (isIng) {
            System.out.print("숫자를 입력해주세요 :");
            String input = player.play();
            Result result = judgment.judge(answer, input);
            resultView.view(result);

            if (result.isFinish()) {
                isIng = false;
            }
        }
    }
}
