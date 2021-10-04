package baseball;

public class Application {
    private static String answer = "123";

    public static void main(String[] args) {
        boolean isIng = true;

        Player player = new Player();
        Judgment judgment = new Judgment();

        while (isIng) {
            System.out.print("숫자를 입력해주세요 :");
            String input = player.play();
            Result result = judgment.judge(answer, input);

            if (result.isFinish()) {
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 끝");
                isIng = false;
            }
        }
    }
}
