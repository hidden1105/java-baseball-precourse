package baseball;

import nextstep.utils.Randoms;

public class Computer {
    private int term = 3;

    public String getRandomAnswer() {
        int startIndex = 1;
        int endIndex = 3;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append(Randoms.pickNumberInRange(startIndex, endIndex));
            startIndex = startIndex + term;
            endIndex = endIndex + term;
        }
        return sb.toString();
    }
}
