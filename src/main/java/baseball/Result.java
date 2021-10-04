package baseball;

public class Result {
    private int strike;
    private int ball;

    private final int THREE_STRIKE = 3;

    public int getStrike() {
        return strike;
    }

    public void setStrike(int strike) {
        this.strike = strike;
    }

    public int getBall() {
        return ball;
    }

    public void setBall(int ball) {
        this.ball = ball;
    }

    public boolean isFinish() {
        return strike == THREE_STRIKE;
    }

    public boolean isExist(int count) {
        return count > 0;
    }

    public boolean isNothing() {
        return strike == 0 && ball == 0;
    }
}
