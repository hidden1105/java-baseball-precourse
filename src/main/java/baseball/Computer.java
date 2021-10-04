package baseball;

import nextstep.utils.Randoms;

public class Computer {
    private int startIndex = 1;
    private int endIndex = 3;
    private int term = 3;

    public String getRandomAnswer() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append(Randoms.pickNumberInRange(startIndex, endIndex));
            startIndex = startIndex + term;
            endIndex = endIndex + term;
        }
        return sb.toString();
    }
}
