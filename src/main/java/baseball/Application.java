package baseball;

import nextstep.utils.Console;

public class Application {
    private final static String GO = "1";

    public static void main(String[] args) {
        BaseBall baseBall = new BaseBall();
        do {
            baseBall.play();
        } while (getGoOrStop().equals(GO));
    }

    private static String getGoOrStop() {
        System.out.println("게임을 새로 시작하려면1, 종료하려면 2를 입력하세요");
        return Console.readLine();
    }
}
