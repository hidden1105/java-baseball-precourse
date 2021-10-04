package baseball;

import nextstep.utils.Console;

public class Application {
    private static String answer = "111";

    public static void main(String[] args) {
        boolean isIng = true;

        while (isIng) {
            System.out.print("숫자를 입력해주세요 :");
            String input = Console.readLine();

            String result = getResult(input);
            if (result.equals("3스트라이크")) {
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 끝");
                isIng = false;
            }
        }
    }

    private static String getResult(String input) {
        if (input.equals(answer)) {
            return "3스트라이크";
        }

        return "3볼";
    }
}
