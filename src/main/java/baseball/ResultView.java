package baseball;

public class ResultView {
    public void view(Result result) {
        if (result.isFinish()) {
            System.out.println(result.getStrike() + "스트라이크 ");
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 끝" );
            return;
        }
        if (result.isNothing()) {
            System.out.println("낫싱");
            return;
        }
        if (result.isExist(result.getStrike())) {
            System.out.print(result.getStrike() + "스트라이크 ");
        }
        if (result.isExist(result.getBall())) {
            System.out.println(result.getBall() + "볼");
        }
        System.out.println("");
    }
}
